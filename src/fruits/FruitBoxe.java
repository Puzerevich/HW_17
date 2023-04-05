package fruits;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxe <T extends Fruit>{

    List<T> fruitList = new ArrayList<>();
    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }
    public void addFruit(List<T> fruits) {
        fruitList.addAll(fruits);
    }

    public float getWeight() {
        float weight = 0;
        for (Fruit fruit : fruitList)
            weight += fruit.getWeight();
        return weight;
    }

    public boolean compare(FruitBoxe<? extends Fruit> fruitBox) {
        return getWeight() == fruitBox.getWeight();
    }

    public void merge(FruitBoxe<T> fruitBox){
        if (fruitList.isEmpty()) {
            fruitList.addAll(fruitBox.fruitList);
            fruitBox.fruitList.clear();
        } else if (!fruitBox.fruitList.isEmpty()) {
            if (fruitBox.fruitList.get(0).getClass() == fruitList.get(0).getClass()) {
                fruitList.addAll(fruitBox.fruitList);
                fruitBox.fruitList.clear();
            } else {
                System.out.println("Type isn`t equal");
            }
        }
    }
}