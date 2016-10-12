package example.bridge.pattern;

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Red Circle : " + x  + "  ... "+ y);
    }


}
