import java.util.ArrayList;
import java.util.List;


public class Exchange implements Publisher {

    private static Exchange exchange;
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    private List<Stock> stocks = new ArrayList<Stock>();

    private Exchange(){

    }

    public static Exchange getExchange(){
        if(exchange == null){
            exchange = new Exchange();
        }
        return exchange;
    }

    @Override
    public void registerClient(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unregisterClient(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void registerStock(Stock stock) {
        stocks.add(stock);
    }

    @Override
    public void unregisterStock(Stock stock) {
        stocks.remove(stock);
    }

    @Override
    public void notifySubscribers(Stock stock) {
        for(Subscriber subscriber : subscribers){
            if(subscriber.getStocks().contains(stock)){
                subscriber.notification(stock);
            }
        }
    }
}
