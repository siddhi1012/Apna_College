public class OOPS_Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,5));
        System.out.println(calc.sum((float)1.4,(float)2.5));
        System.out.println(calc.sum(2,5,7));

        // Deer dr = new Deer();
        // dr.eats();
        Animal a = new Deer();
        a.eats();
        Animal a2 = new Animal();
        a2.eats();
        
    }
    
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b ;
    }
     int sum(int a, int b, int c){
        return a+b+c;
    }
}
class Animal{
    void eats(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal{
    void eats1(){
        System.out.println("Eats grass");
    }
}