public class binary_to_decimal {
    static int isBtoD(int n){
        int sum=0,mul=1;
    while(n>0){
        int digit=n%10;
        sum=sum+digit*mul;
        n=n/10;
        mul=mul*2;

    }
    return sum;

}

    public static void main(String args[]){
        int result=isBtoD(101);
        System.out.println(result);

    }
    
}
