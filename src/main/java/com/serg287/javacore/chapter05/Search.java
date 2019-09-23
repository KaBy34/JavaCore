package main.java.com.serg287.javacore.chapter05;

// Поиск в массиве с применением цикла for в стиле for each
public class Search {
    public static void main(String[] args) {
        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        boolean found = false;

        // использовать цикл for в стиле for each для
        // поиска значения переменной val в массиве nums
        for(int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Знaчeниe найдено!");
    }
}