package lab5.lab8_7;

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2(11, 12, 13);
        Time2 t2 = new Time2(11, 12, 13);
        Time2 t3 = new Time2(23, 59, 59);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        t1.incrementMinute();
        t2.incrementHour();
        t3.tick();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }

}
