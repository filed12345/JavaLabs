package lab7.lab10_13;

public class Triangle extends TwoDimensionalShape{
    private double  base,height;

    public Triangle(double base, double height) {
        super();
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return  (getBase()*getHeight())/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                "} " ;
    }
}
