import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikas on 08/06/15.
 */
public class Bag {

    private List<Ball> balls = new ArrayList<Ball>();
    private Validator validator = new Validator(this);

    public int countBalls(){
        return balls.size();
    }
    public int countBallsByColor(Color color){
        int count = 0;
        for (Ball ball : this.balls){
            if(ball.getColor().equals(color)){
                count++;
            }
        }
        return count;
    }

    public void addBall(Ball ball) throws ValidationException {
        if(validator.validate()){
            this.balls.add(ball);
        }
    }
}
