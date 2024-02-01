package lesson5;

public class Dog extends Animal{
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void run(int obstacleLength) {
        if(obstacleLength > 0 && obstacleLength <= 500) {
            System.out.println(name + " пробежал " + obstacleLength + " м");
        } else {
            System.out.println(name + " не может пробежать " + obstacleLength + " м");
        }
    }
    @Override
    public void swim(int obstacleLength) {
        if(obstacleLength > 0 && obstacleLength <= 10) {
            System.out.println(name + " проплыл " + obstacleLength + " м");
        }
    }
}
