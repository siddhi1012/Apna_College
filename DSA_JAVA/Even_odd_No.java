public class Even_odd_No {

    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        boolean result=isEven(12);
        System.out .println(result);

    }
    
}
