package main.java.net.oopip.lr2.fakultet;

import main.java.net.oopip.lr1.Student;

import java.time.LocalDate;

public class Fakultet {
    private String VUZName;
    private String fakultelName;

    public Fakultet(String VUZName, String fakultelName) {
        this.VUZName = VUZName;
        this.fakultelName = fakultelName;
    }

    public Student createStudent_FOR_OUR_FA_KUL_TET(String name, LocalDate birthday) {
        return new Student(name, birthday, fakultelName, VUZName);
    }
}
