import fruits.FruitBoxe;
import fruits.Apple;
import fruits.Orange;
import fruits.Banana;
import java.util.List;

import static ListArr.ArrToList.toList;

public class main {
    public static void main(String[] args) {
        // Arr to list.
        String[] array = {"Hello!", "It`s", "example", "convert", "array", "to", "list"};
        List<String> list = toList(array);
        System.out.println(list+"\n");

        // Створити коробки з фруктами
        FruitBoxe<Apple> appleBox = new FruitBoxe<>();
        appleBox.addFruit(new Apple(0.01f));
        appleBox.addFruit(new Apple(0.02f));
        appleBox.addFruit(new Apple(0.03f));

        FruitBoxe<Orange> orangeBox = new FruitBoxe<>();
        orangeBox.addFruit(new Orange(0.01f));
        orangeBox.addFruit(new Orange(0.02f));
        orangeBox.addFruit(new Orange(0.03f));

        FruitBoxe<Banana> bananaBox = new FruitBoxe<>();
        bananaBox.addFruit(new Banana(0.21f));
        bananaBox.addFruit(new Banana(0.22f));
        bananaBox.addFruit(new Banana(0.23f));

        // Weight box
        System.out.println("Weight of a box of Apple: " + appleBox.getWeight());
        System.out.println("Weight of a box of Orange: " + orangeBox.getWeight());
        System.out.println("Weight of a box of Banana: " + bananaBox.getWeight()+"\n");

        // Boxes is equal?
        boolean areEqual = appleBox.compare(orangeBox);
        System.out.println("Apple and orange boxes is equal? " + areEqual);
        boolean areEqual2 = appleBox.compare(bananaBox);
        System.out.println("Apple and banana boxes is equal? " + areEqual2);
        System.out.println("");

        // Combining the boxes
        FruitBoxe<Apple> anotherAppleBox = new FruitBoxe<>();
        anotherAppleBox.addFruit(new Apple(0.1f));
        anotherAppleBox.addFruit(new Apple(0.3f));
        anotherAppleBox.addFruit(new Apple(0.04f));

        appleBox.merge(anotherAppleBox);
        // Weight of the boxes after combining
        System.out.println("Weight of the apple box_1 after consolidation: " + appleBox.getWeight());
        System.out.println("Weight of the apple box_2 after consolidation: " + anotherAppleBox.getWeight());

    }
}
