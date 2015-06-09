import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by vikas on 08/06/15.
 */
public class BagTest {
    @Test(expected=ValidationException.class)
    public void shouldNotAddMoreThan12Balls() throws ValidationException {
        Bag bag = new Bag();
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.RED));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
    }
    @Test(expected=ValidationException.class)
    public void shouldNotAddMoreThreeGreenBall() throws ValidationException {
        Bag bag = new Bag();

        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
    }
}
