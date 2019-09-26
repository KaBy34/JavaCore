package main.java.com.serg287.javacore.chapter08;
// Расширение класса BoxWeiqht включением в него
// поля стоимости доставки

// class Box2 {} (c)
// class BoxWeight extends Box {} (c)

// добавить поле стоимости доставки
class Shipment extends BoxWeight2 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) { // передать объект конструктору
        super(ob);
        cost = ob.cost;
    }

    // конструктор, используемый при указании всех параметров
    Shipment (double w, double h, double d,
              double m, double с) {
        super(w, h, d, m); // вызвать конструктор суперкласса
        cost = с;
    }

    // конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    // конструктор , применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Oбъeм shipment1 равен " + vol) ;
        System.out.println("Bec shipment1 равен " + shipment1.weight);
        System.out.println("Cтoимocть доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Oбъeм shipment2 равен " + vol);
        System.out.println("Bec shipment2 равен " + shipment2.weight);
        System.out.println("Cтoимocть доставки : $" + shipment2.cost);
    }
}