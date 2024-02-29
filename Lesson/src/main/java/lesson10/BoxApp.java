package lesson10;

public class BoxApp {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());

        Box<Orange> box2 = new Box<>();
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));

        Box<Apple> box3 = new Box<>();
        box3.addFruit(new Apple());
        box3.addFruit(new Apple());

        box1.sprinkleFruit(box3);

        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());
    }
}
