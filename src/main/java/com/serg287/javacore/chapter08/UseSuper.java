package main.java.com.serg287.javacore.chapter08;

// Исполь зовать ключевое слово super с целью предотвратить сокрытие имен
class A {
    int i;
}

// создать подкласс путем расширения класса А
class B extends A {
    int i;      // этот член i скрывает член i из класса А

    B(int a, int b) {
        super.i = a; // член i из класса А
        i = b;       // член i из класса В
}

    void show() {
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
