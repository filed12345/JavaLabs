package lab7.lab10_12;

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

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");
        for (int i = 1; i <= 12; i++) {
            for (Employee currentEmployee : employees) {
                if (i == currentEmployee.getBirthdayDate().getMonth()) {
                    if (currentEmployee instanceof SalariedEmployee) {
                        System.out.println("Current month number: "+i);
                        System.out.println(currentEmployee);
                        SalariedEmployee employee = (SalariedEmployee) currentEmployee;
                        System.out.printf("new salary with bonus : $%,.2f%n", employee.earnings() + 100);
                    } else if (currentEmployee instanceof HourlyEmployee) {
                        System.out.println("Current month number: "+i);
                        System.out.println(currentEmployee);
                        HourlyEmployee employee = (HourlyEmployee) currentEmployee;
                        System.out.printf("new salary with bonus : $%,.2f%n", employee.earnings() + 100);
                    } else if (currentEmployee instanceof CommissionEmployee) {
                        System.out.println("Current month number: "+i);
                        System.out.println(currentEmployee);
                        CommissionEmployee employee = (CommissionEmployee) currentEmployee;
                        System.out.printf("new salary with bonus : $%,.2f%n", employee.earnings() + 100);
                    } else if (currentEmployee instanceof BasePlusCommissionEmployee) {
                        System.out.println("Current month number: "+i);
                        System.out.println(currentEmployee);
                        BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                        System.out.printf("new salary with bonus : $%,.2f%n", employee.earnings() + 100);
                    }
                    System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
                }
            }
        }
    }
}
