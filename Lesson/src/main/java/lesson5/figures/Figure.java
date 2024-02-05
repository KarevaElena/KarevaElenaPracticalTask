package lesson5.figures;

public interface Figure {
    default double calculationPerimeter() {
        return 2 + 2 + 3 +3;
    }
    double calculationArea();
    void printInfo();
}
