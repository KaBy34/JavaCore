package main.java.com.serg287.javacore.chapter07;

// Объекты допускается передавать методам в качестве параметров
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // возвратить логическое значение true, если в качестве
    // параметра o указан вызывающий объект
    boolean equals (Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("b1 == оb2: " + ob1.equals(ob2));
        System.out.println("b1 == оb3: " + ob1.equals(ob3));
    }
}
