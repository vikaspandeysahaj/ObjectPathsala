import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikas on 09/06/15.
 */
public class Exchange implements Publisher {

    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void changeInPrice(Stock stock, double price){

    }

    @Override
    public void notifySubscribers() {

    }
}
