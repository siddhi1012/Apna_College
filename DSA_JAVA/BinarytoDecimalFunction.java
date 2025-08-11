public class BinarytoDecimalFunction {
    public static void BinarytoDecimal(int n){
        int binNum=n;
        int pow=0;
        int decNum=0;
        while(n>0){
            int lastDigit=n%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of "+ binNum  +" = "+decNum);

    }
    public static void main(String[] args) {
        BinarytoDecimal(101);
        
    }
    
}
