public class Recursion_p7 {
    public static int FO(int arr[] , int key , int i){
      // base case
      if( i == arr.length){
        return -1;
      }
        if(arr[i] == key){
            return i;
        }
        return FO(arr , key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(FO(arr, 5, 0 ));
    }
    
}
