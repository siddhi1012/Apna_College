import java.util.*;
public class Cost_3_Item {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Cost of Pencil");
        float Pencil=sc.nextFloat();
        System.out.println("Enter the Cost of Pen");
        float Pen=sc.nextFloat();
        System.out.println("Enter the Cost of Eraser");
        float Eraser=sc.nextFloat();
        float total=(Pencil+Pen+Eraser);
        System.out.println("Total Cost is ="+total);
        float tax=total*0.18f;
        System.out.println("Tax of The item is ="+tax);



    } 
}
