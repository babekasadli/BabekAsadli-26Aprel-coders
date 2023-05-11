package may11;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.height=height;
        this.width=width;
    }
    public Rectangle(double sideLength){
        this(sideLength,sideLength);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
