package example.flyWeight.pattern;

public class FlyPatternDemo {

    public static final String[] colors = new String[] { "red", "green", "white", "yellow", "orange" };

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    public static  int getRandomY() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 20; ++i) {
            
            Circle circle = (Circle) ShapeFactory.getCricle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();

        }

    }

}
