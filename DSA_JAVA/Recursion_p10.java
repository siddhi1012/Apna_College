public class Recursion_p10 {
    public static int powerOP(int x, int n ){
        // base condition  Time Complexity -> o(log n)
        if( n == 0){
            return -1;
        }
        int halfPwr =  powerOP(x, n/2);
        // n is even
        int halfPwrSq = halfPwr * halfPwr;
        // n is odd
        if(n%2 !=0){
            halfPwrSq = x * halfPwrSq;
        }
        return halfPwrSq;
    }
    public static void main(String[] args) {
        System.out.println(powerOP(2, 4));
    }
    
}
