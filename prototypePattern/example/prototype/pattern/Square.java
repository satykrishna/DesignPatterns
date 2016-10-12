package example.prototype.pattern;

public class Square extends Shape {
    
    
    public  Square() {
        this.type = "square";
    }
    
    @Override
    public void draw() {
        System.out.println("draw square");
    }

}
