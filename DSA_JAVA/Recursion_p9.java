public class Recursion_p9 { 
    public static int power(int x, int n){
        //base case
        if( n == 0){
            return x;
        }
        power(x, n-1);
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
       int N= power(2, 10);
       System.out.println(N);
        
    }
    
}
