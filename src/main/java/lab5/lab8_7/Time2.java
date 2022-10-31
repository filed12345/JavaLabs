package lab5.lab8_7;

public class Time2 {
    private int hour; // 0 - 23

    private int minute; // 0 - 59

    private int second; // 0 - 59

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

    public void tick() {
        if (second == 59) {
            setSeconds(0);
            incrementMinute();
        }else {
            setSeconds(getSecond()+1);
        }
    }
    public void incrementMinute(){
        if (minute == 59){
            setMinutes(0);
            incrementHour();
        } else {
          setMinutes(getMinute()+1);
        }
    }

    public void incrementHour() {
        if (hour == 23){
            setHour(0);
        }else {
            setHour(getHour()+1);
        }
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
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = seconds;
    }

    private int getHour() {
        return hour;
    }

    private int getSecond() {
        return second;
    }

    private int getMinute() {
        return minute;
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
