package example.abstractfactory.Pattern;

public class Demo {
    
    public static void main(String[] args) {
        
        AbstractFactory factory = FactoryProducer.getFactory("shape");
        
        Shape shape = factory.getShape("rectangle");
        
        System.out.println(shape.draw());
        
        
        factory = FactoryProducer.getFactory("shape");
        
        shape = factory.getShape("circle");
        
        System.out.println(shape.draw());
        
        
        factory = FactoryProducer.getFactory("color");
        
        Color color = factory.getColor("blue");
        
        System.out.println(color.fill());
    }

}
