package main.java.com.serg287.javacore.chapter06;

// В этой программе объявляются два объекта класса Вох

class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo2 {
    public static void main(String[] args) {
        Вох mybox1 = new Вох();
        Вох mybox2 = new Вох();
        double vol;

        // присвоить значения переменным экземпляра myboxl
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экземпляра mуbох2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // рассчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Oбъeм равен " + vol);

        // рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Oбъeм равен " + vol);
    }
}
