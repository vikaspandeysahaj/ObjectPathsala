import java.util.List;

public interface Subscriber {
    public void notification(Stock stock);
    public List<Stock> getStocks();
}
