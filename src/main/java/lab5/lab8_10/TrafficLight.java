package lab5.lab8_10;

public enum TrafficLight {
    RED(50), GREEN(55), YELLOW(15);
    private final int time;

    TrafficLight(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
