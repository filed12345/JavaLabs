package lab5.lab8_10;

public class TrafficLightTest {
    public static void main(String[] args) {
        for (TrafficLight traffic :TrafficLight.values()) {
            System.out.printf("%s ----- %d\n",traffic,traffic.getTime());
        }
    }
}
