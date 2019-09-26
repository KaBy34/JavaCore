package main.java.com.serg287.javacore.chapter08;

// Переопределение метода
class A2 {
    int i, j;
    A2(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;
    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной k с помощью метода,
    // переопределяющего метод show() из класса А2
    void show() {
        // super.show();  // эдесь вызывается метод show() из класса А2
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B2 subOb = new B2(1, 2, 3);
        subOb.show(); // здесь вызывается метод show() из класса В2
    }
}
