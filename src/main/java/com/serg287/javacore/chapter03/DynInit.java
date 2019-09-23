package main.java.com.serg287.javacore.chapter03;

// В этом примере демонстрируется динамическая инициализация
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        // динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
        char x = 'х'; // присваивание символа • х • переменной х
        System.out.println("Гипoтeнyзa равна " + c);
    }
}
