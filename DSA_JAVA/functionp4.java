import java.util.Scanner;

public class functionp4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int x=sc.nextInt();
        System.out.println("Enter the Second Number");
        int y=sc.nextInt();
        
        System.out.println("Smallest Among Two Number "+Math.min(x,y));
        System.out.println("Largest Among Two Number "+Math.max(x,y));
        System.out.println("Square Root of the Number "+Math.sqrt(x));
        System.out.println("Power of The Number "+Math.pow(x,y));
        System.out.println("Absolute of the Number "+Math.abs(x));
    }
    
}
