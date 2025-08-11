public class Recursion_p2 {
    public static void printInc(int n){
        //base case
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        //calling inner fuction
        printInc(n-1);
        //print n
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
    
}
