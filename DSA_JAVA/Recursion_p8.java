public class Recursion_p8 {
    public static int LO(int arr[], int key, int i){
        // base condition
        if(i == arr.length -1){
            return -1;
        }
        // look forward 
        int isFound = LO(arr, key, i+1);
        //Compare  with self
        if( isFound ==-1 && arr[i]== key){
            return i;
        }
        return isFound;
    }
     public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(LO(arr, 5, 0 ));
    
}
    
}
