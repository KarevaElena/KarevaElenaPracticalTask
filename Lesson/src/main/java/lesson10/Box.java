package lesson10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }
    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }
    public void sprinkleFruit(Box<T> otherBox) {
        for (T fruit : fruits) {
            otherBox.addFruit(fruit);
        }
        fruits.clear();
    }
}
