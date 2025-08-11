public class OddorEvenBit {
    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n+" is even Number");
        }else{
            System.out.println(n+" is Odd Number");
        }
    }
    public static void main(String[] args) {
        OddorEven(4);
        OddorEven(9);
        
    }
    
}
