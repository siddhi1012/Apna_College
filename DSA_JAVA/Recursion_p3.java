public class Recursion_p3 {
    public static int Factorial(int n){
        // base case
        if(n == 0){
            return 1;
        }
        // calling inner function
        Factorial(n-1);
        int fact = n * Factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
    }
    
}
