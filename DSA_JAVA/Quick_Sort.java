public class Quick_Sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }
        // kaam 
        //last element
        int pIdex = partition(arr, si, ei);
        quickSort(arr, si, pIdex-1); // left part
        quickSort(arr, pIdex+1, ei); // right part

    }
     public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei]; // last element
        int i = si-1; // to make place for elements smaller than pivot-> -1
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                // to make a place
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //to make place for pivot
        i++;
                //swap
                int temp = pivot; //temp ke andar pivot ko store karenge
                arr[ei] = arr[i];
                arr[i] = temp;
                // pivot ka sahi index i ke barabar hai
                return i; // we store pivot in i 
     }
    public static void main(String[] args) {
        int arr [] = {6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
    
}
