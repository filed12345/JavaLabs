package lab5;

public class lab8_4 {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5.0,10.22);
        System.out.printf("Perimeter : %.2f\n",rectangle.perimeter());
        System.out.printf("square : %.2f",rectangle.square());
    }
}

class Rectangle {
    private double length = 1;
    private double width = 1;

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double square(){
        double s = length*width;
        return s;
    }
    public double perimeter(){
        double p = 2*(length*width);
        return p;
    }

    public void setLength(double length) {
        if (length < 0.0 || length > 20.0) {
            throw new IllegalArgumentException("length out of range");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0.0 || width > 20.0) {
            throw new IllegalArgumentException("width out of range");
        }
        this.width = width;
    }
}
