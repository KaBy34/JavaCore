package main.java.com.serg287.javacore.chapter09;

// Пример вложенного интерфейса

// Этот класс содержит интерфейс как свой член
class A {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative (int x) ;
    }
}

// Класс В реализует вложенный интерфейс
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
public class NestedIFDemo {
    public static void main(String[] args) {

        // исполь зовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("Чиcлo 10 неотрицательное");
        if(nif.isNotNegative(-12))
            System.out.println("Этo не будет выведено");
    }
}
