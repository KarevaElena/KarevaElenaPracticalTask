package lesson5;

public class Plate {
    private int food;
    private int supplement;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int getSupplement() {
        return supplement;
    }

    public void addFood(Cat c) {
        if (c.getAppetite() > food) {
            supplement = c.getAppetite() - food;
        }
    }
}
