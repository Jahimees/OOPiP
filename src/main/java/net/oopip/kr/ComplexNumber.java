package main.java.net.oopip.kr;

/**
 * Класс представляет собой гибрит plain old java object (POJO) и утилитного класса.
 * <p>
 * В качестве простого объекта выступает комплексное число, состоящее из действительной {@link #actualPart}
 * и мнимой {@link #imaginaryPart} частей
 * <p>
 * Сам объект имеет ряд методов: геттеры и сеттеры для полей, переопределенный toString,
 * а также метод установки значений сразу двух частей (действительной и мнимой).
 * <p>
 * Утилитная част представлена статическими методами, позволяющими совершать математические
 * действия над комплексными числами: вычитание и умножение
 */
public class ComplexNumber {
    /**
     * Действительная часть
     */
    private int actualPart;
    /**
     * Мнимая часть
     */
    private int imaginaryPart;

    public ComplexNumber() {
    }

    public ComplexNumber(int actualPart, int imaginaryPart) {
        this.actualPart = actualPart;
        this.imaginaryPart = imaginaryPart;
    }

    public int getActualPart() {
        return actualPart;
    }

    public void setActualPart(int actualPart) {
        this.actualPart = actualPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * Устанавливает значения действительной и мнимой частей
     *
     * @param actualPart    действительная часть
     * @param imaginaryPart мнимая часть
     */
    public void setComplexNumber(int actualPart, int imaginaryPart) {
        this.actualPart = actualPart;
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * Производит вычитание второго комплексного числа из первого
     *
     * @param cn1 уменьшаемое
     * @param cn2 вычитаемое
     * @return разность
     */
    public static ComplexNumber subtraction(ComplexNumber cn1, ComplexNumber cn2) {
        ComplexNumber complexNumber = new ComplexNumber();
        complexNumber.setComplexNumber(cn1.actualPart - cn2.actualPart, cn1.imaginaryPart - cn2.imaginaryPart);
        return complexNumber;
    }

    /**
     * Выполняет произведение двух комплексных чисел
     *
     * @param cn1 первый множитель
     * @param cn2 второй множитель
     * @return произведение
     */
    public static ComplexNumber multiplication(ComplexNumber cn1, ComplexNumber cn2) {
        ComplexNumber complexNumber = new ComplexNumber();
        complexNumber.setComplexNumber(cn1.actualPart * cn2.actualPart + cn1.imaginaryPart * cn2.imaginaryPart * (-1),
                cn1.actualPart * cn2.imaginaryPart + cn2.actualPart * cn1.imaginaryPart);
        return complexNumber;
    }

    /**
     * Возвращает привычную форму комплексного числа в виде строки
     *
     * @return комплексное число в строковом представлении
     */
    @Override
    public String toString() {
        return actualPart + " + " + imaginaryPart + "i";
    }
}
