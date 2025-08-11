import java.util.Scanner;

public class functionp5 {
    public static int sumofDigit(int n)
    {
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println("The Sum Of Digit is "+sumofDigit(n));
        
    }
    
}
