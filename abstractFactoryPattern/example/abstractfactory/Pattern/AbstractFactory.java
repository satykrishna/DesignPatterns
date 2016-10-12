package example.abstractfactory.Pattern;

public interface AbstractFactory {

    public abstract Shape getShape(String type);

    public abstract Color getColor(String type);

}
