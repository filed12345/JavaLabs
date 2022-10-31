package lab5.lab8_5;

public class Time2 {
    private int secondsSinceMidnight;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minutes) {
        this(hour, minutes, 0);
    }

    public Time2(int hour, int minutes, int seconds) {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int hour, int minutes, int seconds) {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        secondsSinceMidnight = (hour * 3600) + (getMinute() * 60) + getSecond();
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        secondsSinceMidnight = (getHour() * 3600) + (minutes * 60) + getSecond();
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        secondsSinceMidnight = (getHour() * 3600) + (getMinute() * 60) + seconds;
    }

    private int getHour() {
        return secondsSinceMidnight / 3600;
    }

    private int getSecond() {
        return (secondsSinceMidnight % 3600) % 60;
    }

    private int getMinute() {
        return (secondsSinceMidnight % 3600) / 60;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
