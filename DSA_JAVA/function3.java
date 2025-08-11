import java.util.Scanner;

public class function3 {
    public static int Factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
        
    }

  public static int binCoff(int n,int r){
    int n_fact=Factorial(n);
    int r_fact=Factorial(r);
    int nr_fact=Factorial(n-r);
    int binCoff=n_fact/(r_fact * nr_fact);
    return binCoff;

  }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the numner");
        // int n=sc.nextInt();
        // int fact=Factorial(n);
        // System.out.println("Factorial is:"+fact);
        System.out.println((binCoff(5,2)));
        
    }
    
}
