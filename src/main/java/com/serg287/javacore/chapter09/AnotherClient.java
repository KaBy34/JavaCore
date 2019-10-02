package main.java.com.serg287.javacore.chapter09;

// Еще одна реализация интерфейса Callback
class AnotherClient implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Eщe один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
