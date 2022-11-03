package lab7.lab10_13;

public class Tetrahedron extends ThreeDimensionalShape{
    private double edge;

    public Tetrahedron(double edge) {
        setEdge(edge);
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double getVolume() {
        return Math.pow(getEdge(), 3) / (6 * Math.sqrt(2));
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(getEdge(), 2);
    }

    @Override
    public String toString() {
        return "Tetrahedron{" +
                "edge=" + edge +
                "} " ;
    }
}
