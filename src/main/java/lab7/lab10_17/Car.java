package lab7.lab10_17;

public class Car implements CarbonFootprint{

    public Car(String id, double miles, double milesPerGallon) {
        this.id = id;
        this.miles = miles;
        this.milesPerGallon = milesPerGallon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    private static final double FOOTPRINT_PER_MILE_PER_GALLON = .08765;

    private String id;
    private double miles;
    private double milesPerGallon;
    @Override
    public double getCarbonFootprint() {
        return ((FOOTPRINT_PER_MILE_PER_GALLON * getMiles()) / getMilesPerGallon());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", miles=" + miles +
                ", milesPerGallon=" + milesPerGallon +
                '}';
    }
}
