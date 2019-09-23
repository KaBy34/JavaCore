package main.java.com.serg287.javacore.chapter04;

// Продемонстрировать применение тернарной операции ?
public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значения переменной i
        System.out.print("Aбcoлютнoe значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное значения переменной i
        System.out.print("Aбcoлютнoe значение ");
        System.out.println(i + " равно " + k);
    }
}
