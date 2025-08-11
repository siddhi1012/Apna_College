public class OOPS_Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eats();
        h.walks();
        h.change_color("red");
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eats();
        c.walks();
        c.change_color("black");
        System.out.println(h.color);
        Mustang mh = new Mustang();
        // Animal -> Horse -> Mustang

       
    }
    
}

abstract class Animal{
    String color;
    // we can create constructor in the abstract class
    Animal(){
         System.out.println("Animal Constructor Called");
    }
    // non abstract Method
    void eats(){
        System.out.println(" Animal Eats");
    }
    // abstract Method
    abstract void walks();
}

class Horse extends Animal{

     Horse(){
         System.out.println("Horse Constructor Called");
    }
    // implement of the abstract method or writing the  definition of abstract method
    void walks(){
        System.out.println("Walks on 4 legs");
    }

    void change_color(String color){
        this.color = color;
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
}

class Chicken extends Animal{

    Chicken(){
         System.out.println("Chicken Constructor Called");
    }
    // By definition walk implemented 
    void walks(){
        System.out.println("walks on 2 legs");
    }

    void change_color(String color){
        this.color = color;
    }
}
