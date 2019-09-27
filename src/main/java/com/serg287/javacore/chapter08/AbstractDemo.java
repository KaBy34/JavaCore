package main.java.com.serg287.javacore.chapter08;

// Простой пример абстракции
abstract class A5 {
    abstract void callme();

    // абстрактные классы все же могут содержать конкретные методы
    void callmetoo() {
        System.out.println( "Этo конкретный метод.");
    }
}

class B5 extends A5 {
    void callme() {
        System.out.println("Peaлизaция метода callme() из класса B5.");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        B5 b = new B5();

        b.callme();
        b.callmetoo();
    }
}
