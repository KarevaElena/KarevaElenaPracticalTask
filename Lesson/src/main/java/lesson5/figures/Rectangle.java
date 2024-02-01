package lesson5.figures;

public class Rectangle implements Figure {
    private double widthRectangle;
    private double lengthRectangle;
    private String backgroundColor;
    private String borderColor;

    public Rectangle(double widthRectangle, double lengthRectangle, String backgroundColor, String borderColor) {
        this.widthRectangle = widthRectangle;
        this.lengthRectangle = lengthRectangle;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculationPerimeter() {
        return 2 * (widthRectangle + lengthRectangle);
    }

    @Override
    public double calculationArea() {
        return widthRectangle * lengthRectangle;
    }

    @Override
    public void printInfo() {
        System.out.println("У прямоугольника периметр = " + calculationPerimeter() + "; площадь = " + calculationArea() +
                "; цвет фона = " + backgroundColor + "; цвет границ = " + borderColor);
    }

}
