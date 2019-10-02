package main.java.com.serg287.javacore.chapter09.default_Methods;

// Реализовать интерфейс МyIF
class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только метод qetNumber(),
    // определенный в интерфейсе MyIF.
    // А вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}

