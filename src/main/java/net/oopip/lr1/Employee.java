package main.java.net.oopip.lr1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    private int idEmployee;
    private float salary;
    private Date startWorkDate;

    public Employee() {
    }

    public Employee(int idEmployee, float salary, Date startWorkDate) {
        this.idEmployee = idEmployee;
        this.salary = salary;
        this.startWorkDate = startWorkDate;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public float getSalary() {
        return salary;
    }

    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void putEmploy() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id работника");
        this.idEmployee = scanner.nextInt();
        System.out.println("Введите зарплату сотрудника");
        this.salary = scanner.nextFloat();
        System.out.println("Введите день начала работы сотрудника в формате: dd.MM.yyyy");
        this.startWorkDate = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
    }

    public void getEmploy() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Идентификатор: " + idEmployee +
                "Оклад: " + salary +
                "День приема на работу: " + startWorkDate;
    }
}
