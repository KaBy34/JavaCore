package main.java.com.serg287.javacore.chapter18;

// Использовать лямбда-выражение для создания компаратора
// с обратным упорядочением
import java.util.*;

public class CompDemo2 {
    public static void main(String[] args) {

        // передать компаратор с обратным упорядочением
        // древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<String> (
                                 (aStr, bStr) -> bStr.compareTo(aStr));

        // ввести элементы в древовидное множество
        ts.add("C") ;
        ts.add("A") ;
        ts.add("B") ;
        ts.add("Е") ;
        ts.add("F") ;
        ts.add("D") ;
        // вывести элементы из древовидного множества
        for (String element : ts)
            System.out.println(element + " ");

        System.out.println();
    }
}
