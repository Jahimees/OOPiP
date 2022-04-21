package main.java.net.oopip.lr1;

import java.time.LocalDate;

public class Person {
    private String surname;
    private LocalDate birthday;

    public Person() {

    }

    public Person(String surname, LocalDate birthday) {
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    private String getBirthdayAsString() {
        return birthday.toString();
    }

    public void changeSurname(String newSurname) {
        this.surname = newSurname;
    }

    @Override
    public String toString() {
        return "Фамилия: " + surname + "\n" +
                "Возраст: " + getBirthdayAsString();
    }
}
