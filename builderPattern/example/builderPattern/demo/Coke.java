package example.builderPattern.demo;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 15.0f;
    }

}
