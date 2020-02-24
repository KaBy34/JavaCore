package main.java.com.serg287.javacore.chapter18;

// Продемонстрировать применения класса ArrayDeque
import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String> ( ) ;

        // использовать класс ArrayDeque для организации стека
        adq.push("A") ;
        adq.push("B") ;
        adq.push("D") ;
        adq.push("E") ;
        adq.push("F") ;

        System.out.println("Извлeчeниe из стека: ");

        while(adq.peek() != null)
            System.out.println(adq.pop() + " ");

        System.out.println();
    }
}
