package example.command.pattern;

public class CommandPatternDemo {

    public static void main(String[] args) {
        
        Stock stock = new Stock("MyStock", 100);
        
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        
        Broker broker = new Broker();
        
        broker.takeOrder(buyStock);
        broker.executeOrders();
        
        broker.takeOrder(sellStock);
        broker.executeOrders();
        
    }

}
