/**
 * Created by vikas on 08/06/15.
 */
public class Validator {

    Bag bag;

    public Validator(Bag bag) {
        this.bag = bag;
    }

    public boolean validate() throws ValidationException {
        return maxBallsValidation()
                && maxThreeGreenBallsValidation()
                && redAndGreenBallValidation();

    }

    private boolean redAndGreenBallValidation() throws ValidationException {
        if (bag.countBallsByColor(Color.RED) > (bag.countBallsByColor(Color.GREEN) * 2)+1) {
            throw new ValidationException("Red balls cannot be more than double the green balls");
        }
        return true;
    }

    private boolean maxThreeGreenBallsValidation() throws ValidationException {
        if (bag.countBallsByColor(Color.GREEN) + 1 > 3) {
            throw new ValidationException("can't add more than 3 green balls");
        }
        return true;
    }

    private boolean maxBallsValidation() throws ValidationException {
        if (bag.countBalls() + 1 > 12) {
            throw new ValidationException("Bag is full");
        }
        return true;
    }
}
