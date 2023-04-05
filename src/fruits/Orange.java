package fruits;

public class Orange extends Fruit{
    private float weight = 1.5F;
    public Orange(float weight) {
        this.weight = weight;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
