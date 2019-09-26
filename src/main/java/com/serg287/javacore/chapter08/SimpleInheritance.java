package main.java.com.serg287.javacore.chapter08;

// Простой пример наследования

// создать суперкласс 
class А {
    int i, j;
  
    void showi j () {
        Systern.out.println(" i и j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса А 
class В extends А {
    int k; 
    
    void showk() {
        Systern.out.println("k: " + k); 
    }
    void sum() {
    System.out.println("i+j +k: " + (i+j+k));
    }
}

class SimpleInheritance {
    public static void main(String args[]) {
        А super0b = new А();
        В sub0b = new В();
        
        // суперкласс может использоваться самостоятельно
        super0b.i = 10;
        super0b.j = 20;
        System.out.println("Coдepжимoe объекта super0b: ");
        super0b.showij();
        System.out.println();
        
        /* Подкласс имеет доступ ко всем открытым членам
        своего суперкласса. */
        sub0b.i = 7;
        sub0b.j = 8;
        sub0b.k = 9;
        System.out.println("Coдepжимoe объекта sub0b: ");
        sub0b.showij();
        sub0b.showk();
        
        System.out.println();
        System.out.println("Cyммa i, j и k в объекте sub0b:");
        sub0b.sum();
    }
}    
