public class Recursion_p6 {
    public static boolean isSorted(int arr[], int i){
        // base condition
        if( i == arr.length -1){
            return true;
        }
        //inner function
        if(arr[i] > arr[i+1]){
            return false;
        } 
        return isSorted(arr, i+1);
    }
     public static void main(String[] args) {
        int arr []= {5};
        System.out.println(isSorted(arr, 0));
     }
    
}
