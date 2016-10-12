package example.abstractfactory.Pattern;

public class ColorFactory implements AbstractFactory {

    public Color getColor(String type) {
        if (type.equalsIgnoreCase("red")) {
            return new Red();
        }

        else if (type.equalsIgnoreCase("blue")) {
            return new Blue();
        }

        else if (type.equalsIgnoreCase("green")) {
            return new Green();
        }

        else {
            return null;
        }
    }

    @Override
    public Shape getShape(String type) {
        // TODO Auto-generated method stub
        return null;
    }

}
