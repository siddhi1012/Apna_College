public class sum_of_No {
    static int sum_of_no(int n){
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum=sum+digit;
            n=n/10;

        }
        return sum
        ;

    }

    public static void main(String args[]){
         int result= sum_of_no(123);
         System.out.println(result);
         int result2= sum_of_no(135);
         System.out.println(result2);

    }
    
}
