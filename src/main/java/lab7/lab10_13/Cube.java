package lab7.lab10_13;

public class Cube extends ThreeDimensionalShape{
    private double edge;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Cube(double edge) {
        setEdge(edge);
    }

    @Override
    public double getVolume() {
        return Math.pow(getEdge(), 3);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getEdge(), 2);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "edge=" + edge +
                "} ";
    }
}
