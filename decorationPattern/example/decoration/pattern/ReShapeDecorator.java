package example.decoration.pattern;

public class ReShapeDecorator extends ShapeDecorator {

    public ReShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("Set red border  : RED" );
    }
}
