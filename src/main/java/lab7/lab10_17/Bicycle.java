package lab7.lab10_17;

public class Bicycle implements CarbonFootprint{
    private static final double FOOTPRINT_PER_MILE_AVERAGE = 50;
    private static final double FOOTPRINT_PER_MILE_BY_BANANAS = 65;
    private static final double FOOTPRINT_PER_MILE_BY_CEREAL_WITH_MILK = 90;
    private static final double FOOTPRINT_PER_MILE_BY_BACON = 200;
    private static final double FOOTPRINT_PER_MILE_BY_CHEESEBURGERS = 260;
    private static final double FOOTPRINT_PER_MILE_BY_AIR_FREIGHTED_ASPARAGUS = 2800;

    private static final double GRAM_TO_METRIC_TON_MULTIPLIER = .000001;
    public enum PowerSource {
        AVERAGE_PERSON {
            public String toString() {
                return "Average Person";
            }
        },
        AIR_FREIGHTED_ASPARAGUS {
            public String toString() {
                return "Air-Freighted Asparagus";
            }
        },
        BACON {
            public String toString() {
                return "Bacon";
            }
        },
        BANANAS {
            public String toString() {
                return "Bananas";
            }
        },
        CEREAL_WITH_MILK {
            public String toString() {
                return "Cereal with milk";
            }
        },
        CHEESEBURGERS {
            public String toString() {
                return "Cheeseburgers";
            }
        };
    }
    private String id;
    private double miles;

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
    private Bicycle.PowerSource powerSource;

    public Bicycle(String id, double miles, PowerSource powerSource) {
        setId(id);
        setMiles(miles);
        setPowerSource(powerSource);
    }

    public PowerSource getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public double getCarbonFootprint() {
        double footprint = 0;
        switch (getPowerSource()) {
            case AIR_FREIGHTED_ASPARAGUS:
                footprint = getMiles()
                        * FOOTPRINT_PER_MILE_BY_AIR_FREIGHTED_ASPARAGUS;
            case BACON:
                footprint = getMiles() * FOOTPRINT_PER_MILE_BY_BACON;
            case BANANAS:
                footprint = getMiles() * FOOTPRINT_PER_MILE_BY_BANANAS;
            case CEREAL_WITH_MILK:
                footprint = getMiles() * FOOTPRINT_PER_MILE_BY_CEREAL_WITH_MILK;
            case CHEESEBURGERS:
                footprint = getMiles() * FOOTPRINT_PER_MILE_BY_CHEESEBURGERS;
            default:
                footprint = getMiles() * FOOTPRINT_PER_MILE_AVERAGE;
        }

        // Convert final footprint to metric tons.
        return footprint * GRAM_TO_METRIC_TON_MULTIPLIER;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id='" + id + '\'' +
                ", miles=" + miles +
                ", powerSource=" + powerSource +
                '}';
    }
}
