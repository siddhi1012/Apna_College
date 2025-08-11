public class Recursion_p4 {
    public static int Sum_of_natural_no(int n){
        // base condition 
        if( n == 1){
            return 1;
        }
        // calling inner fuction
        Sum_of_natural_no(n-1);
        int sum = n + Sum_of_natural_no(n-1);
        return sum ;
    }
        public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum_of_natural_no(n));
    }
    
}
