public class DecimaltoBinaryFunction {
    public static void DecimaltoBinary(int n){
        int decNum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int lastDigit=n%2;
            binNum=binNum+(lastDigit*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(" Binary of "+ decNum +" = "+binNum);
    }
    public static void main(String[] args) {
        DecimaltoBinary(5);
        
    }
}
