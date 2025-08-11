public class Recursion_p1 {
    public static void printDec(int n){
        // define base case
        if(n == 1){
            System.out.println(n + " ");
            return;
        }
        // print n
        System.out.print(n + " ");
        // call inner function
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);

    }
    
}
