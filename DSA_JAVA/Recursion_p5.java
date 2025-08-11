public class Recursion_p5 {
    public static int fib(int n){
        // base case
        if( n == 0 || n == 1){
            return n;
        }
        // innner function
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        return f1 + f2;
    }
    public static void main(String[] args) {
      int n = 25;
      System.out.println(fib(n));
    }
}
