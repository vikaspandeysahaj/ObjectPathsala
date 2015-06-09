import java.util.List;

/**
 * Created by vikas on 09/06/15.
 */
public class Main {
    public static void main(String[] args) {

        Exchange exchange = Exchange.getExchange();

        Stock stock = new Stock("ABC",100.9);
        exchange.registerStock(stock);
        Stock stock2 = new Stock("XYZ",10);
        exchange.registerStock(stock2);
        Stock stock3 = new Stock("123",10000);
        exchange.registerStock(stock3);

        Client client1 = new Client();
        client1.setName("Vikas Pandey");
        client1.addStock(stock).addStock(stock2).addStock(stock3);
        exchange.registerClient(client1);

        Client client2 = new Client();
        client2.setName("Shwetha");
        client2.addStock(stock3);
        exchange.registerClient(client2);

        stock.setPrice(300);
        stock3.setPrice(89);

    }

}
