import java.util.Scanner;

public class function2 {
    public static int Product(int a,int b)
    {
        int mul=a*b;
        return mul;
       


    }
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=Product(a, b);
        System.out.println("Multiply is:"+mul);

    }
    
}
