package main.java.com.serg287.javacore.chapter18;
// Продемонстрировать применение класса LinkedHashSet
import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множество
        LinkedHashSet<String> hs = new LinkedHashSet<String> ( ) ;

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
