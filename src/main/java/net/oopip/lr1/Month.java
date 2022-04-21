package main.java.net.oopip.lr1;

public enum Month {
    JANUARY("Января"),
    FEBRUARY("Февраля"),
    MARCH("Марта"),
    APRIL("Апреля"),
    MAY("Мая"),
    JUNE("Июня"),
    JULY("Июля"),
    AUGUST("Августа"),
    SEPTEMBER("Сентября"),
    OCTOBER("Октября"),
    NOVEMBER("Ноября"),
    DECEMBER("Декабря");

    private String month;

    Month(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}
