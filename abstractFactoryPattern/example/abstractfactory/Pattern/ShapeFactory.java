package example.abstractfactory.Pattern;

public class ShapeFactory implements AbstractFactory{

    public Shape getShape(String type ) {
        
        if(type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        
        else if(type.equalsIgnoreCase("square")) {
            return new Square();
        }
        
        else if(type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        
        else {
            return null;
        }
        
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
    
}
