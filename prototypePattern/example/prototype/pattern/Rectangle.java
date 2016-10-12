package example.prototype.pattern;

public class Rectangle extends Shape {

    
    public Rectangle() {
        
        this.type = "rectangle";
    }
    
    @Override
    public void draw() {
        
        System.out.println("Draw Rectangle");

    }

}
