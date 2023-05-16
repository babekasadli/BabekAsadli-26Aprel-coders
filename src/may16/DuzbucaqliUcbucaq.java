package may16;

public class DuzbucaqliUcbucaq extends forma{
    private double base;
    private double height;

    public DuzbucaqliUcbucaq(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }
    double getArea() {
        return 0.5 * base * height;
    }
}
