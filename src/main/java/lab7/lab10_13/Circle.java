package lab7.lab10_13;

public class Circle extends TwoDimensionalShape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
    }


    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} ";
    }
}
