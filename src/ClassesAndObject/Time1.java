package ClassesAndObject;

public class Time1 {
    private int hour;
    private int minute;
    private int second;


    public void setHour(int hour) {
        if (hour < 0 || hour >= 24){
            throw new IllegalArgumentException("incorrect input for hour");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 24) {
            throw new IllegalArgumentException("incorrect input for minutes");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60){
            throw new IllegalArgumentException("incorrect input for seconds");
        }
        this.second = second;
    }

  /*  @Override
    public String toString() {
        return "Time1{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }*/
/*
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12)? 12 :hour % 12),
                minute, second, (hour < 12 ? "AM":"PM" ));
    }*/
}
