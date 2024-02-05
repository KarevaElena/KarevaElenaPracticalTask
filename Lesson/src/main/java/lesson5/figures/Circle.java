package lesson5.figures;

public class Circle implements Figure {
    private double radius;
    private String backgroundColor;
    private String borderColor;

    public Circle(double radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculationPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculationArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void printInfo() {
        System.out.println("У круга периметр = " + calculationPerimeter() + "; площадь = " + calculationArea() +
                "; цвет фона = " + backgroundColor + "; цвет границ = " + borderColor);
    }
}
