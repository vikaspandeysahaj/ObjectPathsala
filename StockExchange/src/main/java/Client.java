import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikas on 09/06/15.
 */
public class Client implements Subscriber {

    private List<Stock> stocks = new ArrayList<Stock>();
    private String name;

    public Client addStock(Stock stock) {
        this.stocks.add(stock);
        return this;
    }

    public void removeStock(Stock stock) {
        this.stocks.remove(stock);
    }

    @Override
    public List<Stock> getStocks(){
        return stocks;
    }

    @Override
    public void notification(Stock stock) {
        System.out.println(stock.getName() +" Stock price is changed for client "+ this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
