package main.java.com.serg287.javacore.chapter03;

// Символьные переменные ведут себя как целочисленные значения
public class CharDemo2 {
    public static void main(String[] args) {
        char ch1;

        ch1 = 'Х';
        System.out.println("ch1 содержит " + ch1) ;

        ch1++; // увеличить на единицу значение переменной ch1
        System.out.println( "ch1 теперь содержит " + ch1 ) ;
    }
}
