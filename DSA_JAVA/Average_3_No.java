import java.util.Scanner;

public class Average_3_No {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        System.out.println("Enter the Third Number");
        int c=sc.nextInt();
        float Avg=(a+b+c)/3;
        System.out.println("Average of the three Number ="+Avg);



    }
    
}
