package main.java.net.oopip.lr1;

import main.java.net.oopip.lr2.cargoCarrier.CargoCarrier;
import main.java.net.oopip.lr2.cargoCarrier.Plane;
import main.java.net.oopip.lr2.cargoCarrier.Train;
import main.java.net.oopip.lr2.learner.Learner;
import main.java.net.oopip.lr2.learner.SchoolBoy;
import main.java.net.oopip.lr2.learner.Student;
import main.java.net.oopip.lr2.passengerCarrier.PassengerCarrier;
import main.java.net.oopip.lr2.transoprtVehicle.Bicycle;
import main.java.net.oopip.lr2.transoprtVehicle.Car;
import main.java.net.oopip.lr2.transoprtVehicle.Cart;
import main.java.net.oopip.lr2.transoprtVehicle.TransportVehicle;

import javax.swing.*;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Antonovich", LocalDate.of(2001, 1, 19));
        System.out.println(person.toString());

        Matrix matrix1 = new Matrix(2,3);
        Matrix matrix2 = new Matrix(3,2);
        Matrix matrix3 = new Matrix(3,2);

        System.out.println("\nMatrix1:\n");
        matrix1.printMatrix();
        System.out.println("\nMatrix2:\n");
        matrix2.printMatrix();
        System.out.println("\nMatrix3:\n");
        matrix3.printMatrix();

        try {
            System.out.println("\nMatrix addition: \n");
            Matrix.matrixAddition(matrix3, matrix2).printMatrix();
            System.out.println("\nMatrix substration: \n");
            Matrix.matrixSubtraction(matrix2, matrix3).printMatrix();
            System.out.println("\nMatrix multiplication: \n");
            Matrix.matrixMultiplication(matrix1, matrix2).printMatrix();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n\n");
        CustomDate customDate = new CustomDate(8, Month.APRIL, 2001);
        customDate.printDigitDate();
        customDate.printWordDate();

        System.out.println("\n\nFor car\n");
        TransportVehicle car = new Car();
        car.setCargoWeight(100);
        car.setPassengerCount(4);
        car.calculateTimeAndCost();
        car.printTimeAndCost();

        System.out.println("\nFor bicycle\n");
        TransportVehicle bicycle = new Bicycle();
        bicycle.setCargoWeight(45);
        bicycle.setPassengerCount(2);
        bicycle.calculateTimeAndCost();
        bicycle.printTimeAndCost();

        System.out.println("\nFor Cart\n");
        TransportVehicle cart = new Cart();
        cart.setCargoWeight(250);
        cart.setPassengerCount(4);
        cart.calculateTimeAndCost();
        cart.printTimeAndCost();

        System.out.println("\n\nFor Plane\n");
        CargoCarrier plane = new Plane();
        plane.calculateTimeAndCost(1000);

        System.out.println("\n\nFor Train\n");
        CargoCarrier train = new Train();
        train.calculateTimeAndCost(1000);

        System.out.println("\n\nFor Car\n");
        CargoCarrier car1 = new main.java.net.oopip.lr2.cargoCarrier.Car();
        car1.calculateTimeAndCost(1000);

        System.out.println("\n\nFor Plane\n");
        PassengerCarrier passPlane = new main.java.net.oopip.lr2.passengerCarrier.Plane();
        passPlane.calculateTimeAndCost(1000);

        System.out.println("\n\nFor Train\n");
        PassengerCarrier passTrain = new main.java.net.oopip.lr2.passengerCarrier.Train();
        passTrain.calculateTimeAndCost(1000);

        System.out.println("\n\nFor Car\n");
        PassengerCarrier passCar = new main.java.net.oopip.lr2.passengerCarrier.Car();
        passCar.calculateTimeAndCost(1000);

        System.out.println("\n\n\n");

        Learner[] arr = new Learner[5];
        arr[0] = new SchoolBoy("Ivan", "Pass");
        arr[1] = new Student("Lera", "Asciid");
        arr[2] = new SchoolBoy("Sasha", "Bogratian");
        arr[3] = new SchoolBoy("Lexa", "Popap");
        arr[4] = new Student("Proto", "Var PvP");

        for (int i = 0; i < 5; i++) {
            if (arr[i].getClass() == SchoolBoy.class) {
                System.out.println("SchoolBoy: " + arr[i].getName() + " " + arr[i].getSurname() + "\n");
            }
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i].getClass() == main.java.net.oopip.lr2.learner.Student.class) {
                System.out.println("Student: " + arr[i].getName() + " " + arr[i].getSurname() + "\n");
            }
        }


    }
}
