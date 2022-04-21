package main.java.net.oopip.kr;

public class Main {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        cn1.setComplexNumber(1, 3);
        ComplexNumber cn2 = new ComplexNumber(2, -2);

        System.out.println("(" + cn1 + ") - (" + cn2 + ") = " + ComplexNumber.subtraction(cn1, cn2) + "\n");
        System.out.println("(" + cn1 + ") * (" + cn2 + ") = " + ComplexNumber.multiplication(cn1, cn2) + "\n");

        String complexNumberString = cn1.toString();

        System.out.println(complexNumberString);
    }
}
