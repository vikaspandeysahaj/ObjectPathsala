import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class TwitterControllerTest {

    Tweet tweet1;
    Tweet tweet2;
    Twitter twitter;
    TwitterController twitterController;

    @Before
    public void setUp() throws Exception {

        tweet1 = new Tweet("tweet1", "tweet1 data");
        tweet2 = new Tweet("tweet2","tweet2 data");
        twitter = mock(Twitter.class);
        twitterController = new TwitterController(twitter);
    }

    @Test
    public void ShouldReadFeedAndTransformFeed(){

        when(twitter.readFeed())
                .thenReturn("@tweet1 tweet1 data|@tweet2 tweet2 data");
        assertEquals(asList(tweet1, tweet2), twitterController.readFeed());
    }

    @Test
    public void ShouldPostToTwitterAndReturnSuccessStatus() {

        Twitter twitterMocked = mock(Twitter.class);
        TwitterController twitterController = new TwitterController(twitterMocked);
        String message = "this is message";
        when(twitterMocked.post(any(String.class))).thenReturn(true);
        boolean posted = twitterController.post(message);
        assertEquals(posted, true);
        verify(twitterMocked).post(message);
    }

    @Test
    public void ShouldFailedPostToTwitterAndReturnFailedStatus() {
        Twitter twitterMocked = mock(Twitter.class);
        TwitterController twitterController = new TwitterController(twitterMocked);
        String message = "some message";
        when(twitterMocked.post(any(String.class))).thenReturn(false);

        boolean posted = twitterController.post(message);

        assertEquals(posted, false);
    }
}