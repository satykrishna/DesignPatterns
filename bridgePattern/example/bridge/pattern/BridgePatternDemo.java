package example.bridge.pattern;

public class BridgePatternDemo {
    
    public static void main(String[] args) {
        
        Shape shape1 = new Circle(new RedCircle(), 2, 3, 5);
        
        Shape shape2 = new Circle(new GreenCircle(), 4, 5, 10);
        
        shape1.draw();
        
        shape2.draw();
        
        
    }

}
