package main.java.com.serg287.javacore.chapter08;

// Динамическая диспетчеризация методов
class A4 {
    void callme() {
        System.out.println("B методе callme() из класса А4");
    }
}

class B4 extends A4 {
    // переопределить метод callme()
    void callme() {
        System.out.println("B методе callme() из класса В4");
    }
}

class C4 extends B4 {
    // переопределить метод callme()
    void callme() {
        System.out.println("B методе callme() из класса C4");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A4 a = new A4(); // объект класса А4
        B4 b = new B4(); // объект класса B4
        C4 c = new C4(); // объект класса C4

        A4 r;            // получить ссылку на объект типа А4

        r = a;          // переменная r ссылается на объект типа А4
        r.callme();     // вызвать вариант метода callme(),
                        // определенный в классе А4
        r = b;          // переменная r ссылается на объект типа B4
        r.callme();     // вызвать вариант метода callme(),
                        // определенный в классе B4
        r = c;          // переменная r ссылается на объект типа C4
        r.callme();     // вызвать вариант метода callme(),
                        // определенный в классе C4
    }
}
