import java.util.List;

/**
 * Created by vikas on 09/06/15.
 */
public class Client implements Subscriber {

    private List<Stock> stocks;
    private String name;


    @Override
    public void register(Stock stock) {
        this.stocks.add(stock);
    }

    @Override
    public void unregister(Stock stock) {
        this.stocks.remove(stock);
    }

    @Override
    public void notification() {

    }
}
