package fruits;

public class Apple extends Fruit{
    private float weight = 1.7F;
    public Apple(float weight) {
        this.weight = weight;
    }

    @Override
    public float getWeight() {
        return weight;
    }

}
