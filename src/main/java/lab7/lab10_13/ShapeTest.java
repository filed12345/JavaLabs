package lab7.lab10_13;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape[] = new Shape[6];
        shape[0] = new Circle(7.0);
        shape[1] = new Square(7.0);
        shape[2] = new Triangle(4.0, 5.0);
        shape[3] = new Sphere(1.0);
        shape[4] = new Cube(1.0);
        shape[5] = new Tetrahedron(1.0);
        for (Shape currentShape: shape) {
            if (currentShape instanceof TwoDimensionalShape){
                TwoDimensionalShape twoDimentionalShape = (TwoDimensionalShape) currentShape;
                System.out.printf("%s %.2f%n",currentShape.toString(),((TwoDimensionalShape) currentShape).getArea());
            } else if (currentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) currentShape;
                System.out.printf("%s %.2f%n",currentShape.toString(),((ThreeDimensionalShape) currentShape).getArea());

            }
        }
    }
}
