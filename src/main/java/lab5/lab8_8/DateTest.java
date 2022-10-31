package lab5.lab8_8;

public class DateTest {
    public static void main(String[] args) {
        Date hiredate = new Date(12,30,2000);
        for (int i = 0;i<=32;i++){
            hiredate.nextDay();
            System.out.println(hiredate);
        }
    }
}
