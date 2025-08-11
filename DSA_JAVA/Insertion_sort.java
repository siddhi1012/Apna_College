public class Insertion_sort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i]; // temp sorted in the array  current = 4
            int prev = i-1;    //5 last index of sorted part
            // find out the current positon to insert 
            // shift elements greater than current to the right
            while(prev>=0 && arr[prev] > curr ){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]= curr; // insert current element at correct positions 
        }
    }
    public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,2,3};
        insertionSort(arr);
        PrintArray(arr);

    }
    
}
