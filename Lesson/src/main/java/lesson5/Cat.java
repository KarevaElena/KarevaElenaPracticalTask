package lesson5;

public class Cat extends Animal {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= 200) {
            System.out.println(name + " пробежал " + obstacleLength + " м");
        } else {
            System.out.println(name + " не может пробежать " + obstacleLength + " м");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println(name + " не умеет плавать");
    }

    public boolean eatFood(Plate p) {
        if (appetite <= p.getFood()) {
            return satiety = true;
        } else {
            return satiety = false;
        }
    }
}

