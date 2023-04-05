package fruits;

public class Banana extends Fruit{
    private float weight = 1.5F;
    public Banana(float weight) {
        this.weight = weight;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
