package lab7.lab10_17;

public class Building implements CarbonFootprint{
    private static final double COAL_PER_ONE_KWH = .00034;
    private static final double ELECTRICITY_PER_ONE_KWH = .00059;
    private static final double HEATING_OIL_PER_ONE_KWH = .00028;
    private static final double LPG_PER_ONE_KWH = .00021;
    private static final double NATURAL_GAS_PER_ONE_KWH = .00018;
    private static final double PROPANE_PER_ONE_GALLON = .00579;
    private static final double WOODEN_PELLETS_PER_ONE_METRIC_TON = .00774;

    private double coal;
    private double electricity;
    private double heatingOil;
    private String id;
    private double lpg;
    private double naturalGas;
    private int numberOfPeople;

    public Building(double coal, double electricity, double heatingOil, String id, double lpg, double naturalGas, int numberOfPeople, double propane, double woodenPellets) {
        this.coal = coal;
        this.electricity = electricity;
        this.heatingOil = heatingOil;
        this.id = id;
        this.lpg = lpg;
        this.naturalGas = naturalGas;
        this.numberOfPeople = numberOfPeople;
        this.propane = propane;
        this.woodenPellets = woodenPellets;
    }

    public double getCoal() {
        return coal;
    }

    public void setCoal(double coal) {
        this.coal = coal;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getHeatingOil() {
        return heatingOil;
    }

    public void setHeatingOil(double heatingOil) {
        this.heatingOil = heatingOil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLpg() {
        return lpg;
    }

    public void setLpg(double lpg) {
        this.lpg = lpg;
    }

    public double getNaturalGas() {
        return naturalGas;
    }

    public void setNaturalGas(double naturalGas) {
        this.naturalGas = naturalGas;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getPropane() {
        return propane;
    }

    public void setPropane(double propane) {
        this.propane = propane;
    }

    public double getWoodenPellets() {
        return woodenPellets;
    }

    public void setWoodenPellets(double woodenPellets) {
        this.woodenPellets = woodenPellets;
    }

    private double propane;
    private double woodenPellets;

    private double addCoal(double carbonFootprint) {
        return computeItem(carbonFootprint, coal, COAL_PER_ONE_KWH);
    }

    private double addElectricity(double carbonFootprint) {
        return computeItem(carbonFootprint, electricity,
                ELECTRICITY_PER_ONE_KWH);
    }

    private double addHeatingOil(double carbonFootprint) {
        return computeItem(carbonFootprint, heatingOil, HEATING_OIL_PER_ONE_KWH);
    }

    private double addLPG(double carbonFootprint) {
        return computeItem(carbonFootprint, lpg, LPG_PER_ONE_KWH);
    }

    private double addNaturalGas(double carbonFootprint) {
        return computeItem(carbonFootprint, naturalGas, NATURAL_GAS_PER_ONE_KWH);
    }

    private double addPropane(double carbonFootprint) {
        return computeItem(carbonFootprint, propane, PROPANE_PER_ONE_GALLON);
    }

    private double addWoodenPellets(double carbonFootprint) {
        return computeItem(carbonFootprint, woodenPellets,
                WOODEN_PELLETS_PER_ONE_METRIC_TON);
    }

    private double computeItem(double carbonFootprint, double amount,
                               double multiplier) {
        return carbonFootprint + (amount * multiplier);
    }

    @Override
    public double getCarbonFootprint() {
        double carbonFootprint = 0;

        carbonFootprint = addElectricity(carbonFootprint);
        carbonFootprint = addNaturalGas(carbonFootprint);
        carbonFootprint = addHeatingOil(carbonFootprint);
        carbonFootprint = addCoal(carbonFootprint);
        carbonFootprint = addLPG(carbonFootprint);
        carbonFootprint = addPropane(carbonFootprint);
        carbonFootprint = addWoodenPellets(carbonFootprint);
        return carbonFootprint;
    }

    @Override
    public String toString() {
        return "Building{" +
                "coal=" + coal +
                ", electricity=" + electricity +
                ", heatingOil=" + heatingOil +
                ", id='" + id + '\'' +
                ", lpg=" + lpg +
                ", naturalGas=" + naturalGas +
                ", numberOfPeople=" + numberOfPeople +
                ", propane=" + propane +
                ", woodenPellets=" + woodenPellets +
                '}';
    }
}
