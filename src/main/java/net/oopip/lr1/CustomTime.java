package main.java.net.oopip.lr1;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime() {}

    public CustomTime(int hour, int minute, int second) {

    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour cannot be less than 0 and more than 23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute cannot be less than 0 and more than 59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second cannot be less than 0 and more than 59");
        }
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void printTimeT1() {
        System.out.println(hour + " часов " + minute + " минут " + second + " секунд");
    }

    public void printTimeT2() {
        int formatedHour = 0;
        String pmam = "";
        if (hour > 12) {
            formatedHour = hour - 12;
            pmam = " p.m. ";
        } else {
            pmam = " a.m. ";
        }

        System.out.println(formatedHour + pmam + minute + " минут " + second + " секунд");
    }
}
