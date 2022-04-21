package main.java.net.oopip.lr1;

public class CustomDate {
    private int day;
    private int year;
    private Month month;

    public CustomDate() {}

    public CustomDate(int day, Month month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day cannot be less than 1 or more than 31");
        }
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Year cannot be less than 1 or more than 9999");
        }
        this.year = year;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    public void printDigitDate() {
        System.out.println(formatDay(day) + "." + formatMonth(month) + "." + year + "\n");
    }

    public void printWordDate() {
        System.out.println(formatDay(day) + " " + month.getMonth() + " " + year + " года\n");
    }

    private String formatDay(int day) {
        String dayNumber = day + "";

        if (day < 10) {
            dayNumber = "0" + dayNumber;
        }

        return dayNumber;
    }

    private String formatMonth(Month month) {
        String monthNumber = month.ordinal() + "";

        if (month.ordinal() < 10) {
            monthNumber = "0" + monthNumber;
        }

        return monthNumber;
    }
}
