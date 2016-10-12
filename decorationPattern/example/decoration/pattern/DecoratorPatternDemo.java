package example.decoration.pattern;

public class DecoratorPatternDemo {

    
    public static void main(String[] args) {
        
        Shape circle = new Circle();
        Shape redCircle = new ReShapeDecorator(circle);
        redCircle.draw();
        
        Shape rectangle = new Rectangle();
        
        Shape redRectangle = new ReShapeDecorator(rectangle);
        
        redRectangle.draw();
        
    }
    
}
