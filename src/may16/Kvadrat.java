package may16;

public class Kvadrat extends forma{
    private double side;

    public Kvadrat(double side) {
        this.side = side;
    }
    double getPerimeter() {
        return 4 * side;
    }

    double getArea() {
        return side * side;
    }
}
