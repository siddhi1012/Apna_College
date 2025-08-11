import java.util.Scanner;

public class functionp1 {
    public static int Average(int a,int b, int c)
    {
        
        int avg = 0;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter Third Number");
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("Average of Three Number is "+avg);
    
      
        
    }
    
}
