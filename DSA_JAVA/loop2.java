import java.util.*;
public class loop2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch,sumEven = 0,sumOdd=0;
        do{
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            if(n%2==0){
                sumEven+=n;
            }
            else{
                sumOdd+=n;
            }
            System.out.println("Enter you're choice? press 1 for yes and 0 for no");
            ch=sc.nextInt();

        }while(ch==1);
        System.out.println("Sum of Even Number="+sumEven);
         System.out.println("Sum of Odd Number="+sumOdd);

    }
    
}
