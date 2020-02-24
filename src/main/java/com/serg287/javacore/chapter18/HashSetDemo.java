package main.java.com.serg287.javacore.chapter18;

// Продемонстрировать применение класса HashSet
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множество
        HashSet<String> hs = new HashSet<String> ( ) ;

        // ввести элементы в хеш-множество
        hs . add ("Бета") ;
        hs . add ("Aльфa") ;
        hs . add ("Этa") ;
        hs . add ("Гaммa") ;
        hs . add ("Эпсилон") ;
        hs . add ("Oмeгa") ;

        System.out.println(hs);
    }
}
