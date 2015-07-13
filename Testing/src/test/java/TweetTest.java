import org.junit.Test;

import static org.junit.Assert.*;


public class TweetTest {

    @Test
    public void shouldReturnWhoTweeted(){
        Tweet tweet = new Tweet("a", "this is testing");

        assertEquals("a",tweet.whoTweeted());
    }

    @Test
    public void shouldReturnTweetCorrectly(){
        Tweet tweet = new Tweet("a", "this is testing");

        assertEquals("this is testing",tweet.getTweet());
    }
}