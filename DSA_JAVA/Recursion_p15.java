public class Recursion_p15 {
    public static int length(String str){
        // base case
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "siddhi";
        System.out.println(length(str));  // Output: 14
    }
}

