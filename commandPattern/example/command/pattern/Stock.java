package example.command.pattern;

public class Stock {

    private String name;
    private int    quantity;

    public Stock(String name, int quantity ) {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void buy() {
        System.out.println("Buy Stock [ Name = " + name + " quantity = " + quantity + " ]");
    }
    
    public void sell() {
        System.out.println("Sell Stock [ Name = " + name + " quantity = " + quantity + " ]");
    }

}
