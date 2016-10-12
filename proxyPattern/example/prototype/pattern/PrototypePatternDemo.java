package example.prototype.pattern;

public class PrototypePatternDemo {
    
    public static void main(String[] args) {
        
        Image image = new ProxyImage("TestImage.png");
        
        image.draw();
        
        System.out.println("Redraw");
        
        image.draw();
        
    }

}
