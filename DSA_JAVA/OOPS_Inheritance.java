public class OOPS_Inheritance {
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.eats();
        // Dog dobby = new Dog();
        // dobby.eats();
        // dobby.legs=4;
        // System.out.println(dobby.legs);
        Bird crow = new Bird();
        crow.fly();
        Fish shark = new Fish();
        shark.eats(); 

        
    }
    
}

class Animal{
    String color;
    void eats(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breath");
    }
}

// class fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in the water");
//     }
// }
 class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }

 }

//  class Dog extends Mammal{
//     String breed;
//  }

class Fish extends Animal{
    void swim(){
        System.out.println("Can Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Can fly");
    }
}