package main.java.com.serg287.javacore.chapter06;

/* Программа, исnользующая класс Вох
Присвоить исходному файлу имя BoxDeшo . java
 */
class Вох {
    double width;
    double height;
    double depth;
}
class BoxDemo {
    public static void main(String[] args) {
        Вох mybox = new Вох();

        double vol;

        // присвоить значение переменным экземпляра mуbох
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Oбъeм равен " + vol) ;
    }
}
