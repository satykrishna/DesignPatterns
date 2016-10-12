package example.bridge.pattern;

public class Circle extends Shape {
    
    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    private int x ;
    private int y;
    private int radius;

    @Override
    public void draw() {
       drawAPI.drawCircle(radius, x, y);
    }

}
