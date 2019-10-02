package main.java.com.serg287.javacore.chapter09.default_Methods;

// Использовать метод по умолчанию
public class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        // Метод qetNumber() можно вызвать, т.к. он явно реализован
        // в классе МyIFImp:
        System.out.println(obj.getNumber());

        // Метод getString() также можно вызвать, т.к. в интерфейсе
        // имеется его реализация по умолчанию:
        System.out.println(obj.getString());
    }
}
