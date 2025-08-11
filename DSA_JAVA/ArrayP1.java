public class ArrayP1 {
    // Time Compexity - o(n^2) we choosing for better optimized solution
    public static boolean containsDuplicate(int number[]){
        for(int i=0;i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i]==number[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int number[] = {1,3,2,1};
        System.out.println(containsDuplicate(number));

    }
    
}
