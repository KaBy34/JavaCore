package main.java.com.serg287.javacore.chapter09.IFTest;

// Определить интерфейс для целочисленного стека
interface IntStack {
    void push(int item); // сохранить элемент в стеке
    int pop();           // извлечь элемент из стека
}
