package lab7.lab10_13;

public class Square extends TwoDimensionalShape{
    private double length;

    public Square(double length) {
        super();
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                "} " ;
    }
}
