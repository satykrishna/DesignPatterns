package example.command.pattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> ordersList = new ArrayList<Order>();
    
    public void takeOrder(Order newOrder) {
        ordersList.add(newOrder);
    }
    
    public void executeOrders(){
        
        for(Order order : ordersList ) {
            order.execute();
        }
        
        System.out.println("Done !!!.. Executed");
        
        ordersList.clear();
    }
    
    public Broker() {
        // TODO Auto-generated constructor stub
    }

}
