package lesson5.figures;

public class Triangle implements Figure {
    private double side1;
    private double side2;
    private double side3;
    private String backgroundColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3, String backgroundColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculationPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculationArea() {
        double semiperimeter = calculationPerimeter() / 2;

        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }

    @Override
    public void printInfo() {
        System.out.println("У треугольника периметр = " + calculationPerimeter() + "; площадь = " + calculationArea() +
                "; цвет фона = " + backgroundColor + "; цвет границ = " + borderColor);
    }
}
