package Fruits;

import java.util.ArrayList;
import java.util.Arrays;


public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(T... fruit) {
        this.fruits = new ArrayList<>(Arrays.asList(fruit));
    }

    public Box() {
        fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.0001;
    }

    public float getWeight() {
        float fruitWeight = 0;
        if (fruits.size() > 0) {
            fruitWeight = fruits.get(0).getWeight();
        }
        return fruitWeight * fruits.size();
    }

    public void moveFruitsTo(Box<T> destBox) {
        for (T fruit : fruits) {
            destBox.addFruit(fruit);
        }
        fruits.clear();
    }
}
