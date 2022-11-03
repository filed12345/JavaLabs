package lab7.lab10_14;

public class PayrollSystemTest {
    public static void main(String[] args) {
        Date birth1 = new Date(7, 12, 2000);
        Date birth2 = new Date(4, 1, 1996);
        Date birth3 = new Date(2, 27, 2001);
        Date birth4 = new Date(1, 22, 1967);
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, birth1);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, birth2);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06, birth3);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300, birth4);

        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = new PieceWorker("Oleg", "Neoleg","44--444",
                birth1,200,300);

        System.out.printf("Employees processed polymorphically:%n%n");

            for (Employee currentEmployee : employees) {
                System.out.println(currentEmployee);
                    System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
                }
            }
        }
