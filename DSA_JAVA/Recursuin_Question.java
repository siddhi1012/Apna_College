public class Recursuin_Question { 
   static String digit[] = {"zero"," one" ,"two","three", "four","five", "six", "seven", "eight", "nine"};
    public static int calPow(int a, int n){
        // base condition
        if( n == 0){
            return 1;
        }
        // inner function 
        return a * calPow(a, n-1);
    }

    public static void findKey(int arr[], int key, int i){
        // base case
        if ( i == arr.length){
            return;
        }
        if( arr[i] == key){
            System.out.print(i+ " ");
        }
        // inner condition
        findKey(arr, key, i+1);
    }

    public static void Convert_num_to_word(int num){
             // base condition
             if(num == 0){
                return;
             }
            int lastDigit = num % 10;
            Convert_num_to_word(num/10);
            System.out.print(digit[lastDigit]+" ");
            return; 
    }
    public static void main(String[] args) {
        System.out.println(calPow(3, 4));
        int arr [] = {3,2,4,5,6,2,7,2,2};
        
        int num = 1097;
        int key = 2;
        findKey(arr, key, 0);
        System.out.println();
        Convert_num_to_word(num);
        
    }
    
}
