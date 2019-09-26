package main.java.com.serg287.javacore.chapter08;

// Методы с отличающимися сигнатурами считаются
// перегружаемыми, а не переопределяемыми
class A3 {
    int i, j;
    A3(int a, int b) {
        i = a;
        j = b;
    }
    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса А3
class B3 extends A3 {
    int k;
    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // перегрузить метод show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override2 {
    public static void main(String[] args) {
        B3 subOb = new B3(1, 2,  3);

        subOb.show("Это k: ");  // вызвать метод show() из класса В3
        subOb.show();                 // вызвать метод show() из класса А3
    }
}
