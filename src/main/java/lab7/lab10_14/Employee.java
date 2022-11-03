package lab7.lab10_14;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    private Date birthdayDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthdayDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthdayDate = birthdayDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s\nDate %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(),getBirthdayDate());
    }

    public abstract double earnings();
}
