import java.util.HashSet;
// Time Complexity o(n) 
public class ArrayOPP1 { 
    public static boolean containsDuplicate(int number[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<number.length; i++){
            if (set.contains(number[i])){
                return true;
            }else{
                
                set.add(number[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
      int number[] = {1,3,2,1};
      System.out.println(containsDuplicate(number));

}
    
}
