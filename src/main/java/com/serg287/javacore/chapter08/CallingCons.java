package main.java.com.serg287.javacore.chapter08;

// Продемонстрировать порядок вызова конструкторов

// создать суперкласс

class A1 {
    A1() {
        System.out.println("B конструкторе А1.");
    }
}

// создать подкласс путем расширения класса А1
class B1 extends A1 {
    B1() {
        System.out.println("B конструкторе В1.");
    }
}

// создать еще один подкласс путем расширения класса В1
class C1 extends B1 {
    C1() {
        System.out.println("B конструкторе С1.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C1 c = new C1();
    }
}
