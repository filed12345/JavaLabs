package lab7.lab10_14;

public class PieceWorker extends Employee {
    private double wage;
    private double pieces;

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public void setPieces(double pieces) {
        if (pieces < 0.0) {
            throw new IllegalArgumentException("pieces must be >= 0.0");
        }
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public double getPieces() {
        return pieces;
    }

    public PieceWorker(String firstName, String lastName,
                       String socialSecurityNumber, Date birthdayDate, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber, birthdayDate);
        setPieces(pieces);
        setWage(wage);
    }

    @Override
    public double earnings() {
        return getPieces() * getWage();
    }

    @Override
    public String toString() {
        return String.format("piece worker: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "wage", getWage(),
                "pieces produced", getPieces());
    }
}
