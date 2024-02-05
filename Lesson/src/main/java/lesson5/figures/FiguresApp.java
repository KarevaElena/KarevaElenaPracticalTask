package lesson5.figures;

public class FiguresApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4,"голубой","чёрный");
        Rectangle rectangle1 = new Rectangle(5,7,"зелёный","серый");
        Triangle triangle1 = new Triangle(4,5,7,"жёлтый","синий");
        circle1.printInfo();
        rectangle1.printInfo();
        triangle1.printInfo();
    }
}
