package main.java.com.serg287.javacore.chapter09.p1;
class Derived extends Protection {
    Derived ( ) {
        System.out.println("кoнcтpyктop подкласса");
        System.out.println("n = " + n);
        // доступно только для класса
        // System.out.priпtlп("n_pri = " 4 + n_pri);

        System.out.println("n pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
