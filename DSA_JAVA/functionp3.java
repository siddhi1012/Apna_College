import java.util.Scanner;

public class functionp3 {
    public static boolean isPallindrome(int n)
    {
        int rev=0;
        int temp=n;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            n=n/10;
        }
        if(temp==rev)
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if (isPallindrome(n)){
            System.out.println("Number is "+ n +" Pallindrome");
        }
        else{
            System.out.println("Number is "+ n +" Not Pallindrome");
        }  
    }
}
