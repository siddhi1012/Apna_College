public class PalindromeString {
    public static boolean pallindrome_string(String str){
        for(int i=0; i<str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
              System.out.println("Given String is Not Palindrome");
              return false;
            }
        }
        System.out.println("Given String is Palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        pallindrome_string(str);
    }
    
}
