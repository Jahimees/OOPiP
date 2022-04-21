package main.java.net.oopip.lr1;

import java.time.LocalDate;

public class Student {
    private String surname;
    private LocalDate birthday;
    private String fakultet;
    private String VUZ;

    public Student() {

    }

    public Student(String surname, LocalDate birthday) {
        this.surname = surname;
        this.birthday = birthday;
    }

    public Student(String surname, LocalDate birthday, String fakultet, String VUZ) {
        this.surname = surname;
        this.birthday = birthday;
        this.fakultet = fakultet;
        this.VUZ = VUZ;
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
