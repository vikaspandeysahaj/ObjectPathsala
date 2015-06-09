/**
 * Created by vikas on 09/06/15.
 */
public interface Publisher {
    public void registerClient(Subscriber subscriber);
    public void unregisterClient(Subscriber subscriber);
    public void registerStock(Stock stock);
    public void unregisterStock(Stock stock);
    public void notifySubscribers(Stock stock);
}
