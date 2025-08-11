public class Bitwise_Solution_PracticeSet {
    public static void Swapping(int a, int b){
        System.out.println("Before Swapping the Number:a="+ a + "," +"b="+ b);
        //swapping without using temp
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("After Swapping the Number:a="+ a + "," +"b="+ b);
    }

    public static void Convert_uppercase(char ch){
        for( ch ='A'; ch<='Z';ch++){
            System.out.print((char) (ch | ' '));
        }

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println(a+" + "+1+" is "+-~a);
        System.out.println(b+" + "+1+" is "+-~b);
        Swapping(a, b);
        Convert_uppercase('A');

        
    }
    
}
