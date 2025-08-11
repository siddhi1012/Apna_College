public class palindrome {
    static boolean ispalindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
        

    }
    
    public static void main(String args[]){
      boolean result=ispalindrome(125);
        System.out.println(result);
        boolean result2=ispalindrome(1331);
        System.out.println(result2);
    }
}
