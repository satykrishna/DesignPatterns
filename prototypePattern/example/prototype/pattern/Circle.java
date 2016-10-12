package example.prototype.pattern;

public class Circle extends Shape {

    @Override
    public void draw() {
         System.out.println("draw circle");
    }
    
    public Circle() {
        this.type = "circle";
    }

}
