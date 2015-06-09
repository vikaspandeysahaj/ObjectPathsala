
public interface Subscriber {
    public void register(Stock stock);
    public void unregister(Stock stock);
    public void notification();
}
