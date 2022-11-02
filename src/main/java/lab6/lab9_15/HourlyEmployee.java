package lab6.lab9_15;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double hours){
        super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("hours must be between 0 and 168");
        }
        this.hours = hours;
    }
    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage must be >=0.0");
        }
        this.wage = wage;
    }
    public double earning(){
        double hourly = 20;
        if (hours>40){
            double newHourly = hourly *1.5;
            setWage((((hours-40)* newHourly))+(40*hourly));
        }
        else {
            setWage(hours*hourly);
        }
        return wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", wage=" + wage +
                "} " + super.toString();
    }
}
