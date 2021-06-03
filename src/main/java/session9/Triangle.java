package session9;

public class Triangle implements Shape{

    public double length;
    public double width;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
