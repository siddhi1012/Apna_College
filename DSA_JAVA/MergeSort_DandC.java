public class MergeSort_DandC {
    // Printing the array 
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void MergeSort(int arr[], int si, int ei){
        int mid = si+(ei-si)/2; // ->(si+ei)/2
        // base case
        if(si >= ei){
            return;
        }
        MergeSort(arr, si, mid); // left part
        MergeSort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);


    }

    public static void merge(int arr[], int si, int mid, int ei){
        // left(0,3)-> 4 ele , right(4,6)-> 3 ele 
        //size->(6-0+1)=7
        int temp[] = new int[ei-si+1]; 
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp array
        // starting index to mid and mid+1 to ending index
        while( i <= mid && j <= ei){
            if(arr[i] < arr [j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++; // beacause k++ in both condition so we write this
            }

        
        // leftover element 
        //left part
        //for leftover ele of 1st sorted part
        while(i <= mid){
           temp[k++] = arr[i++];
        }
        // right part
        //for leftover ele of 2nd sorted part
        while(j <= ei ){
            temp[k++] =arr [j++];
        }
        // copy temp to original array
        for(k=0, i=si; k<temp.length; k++,i++){
            // temp ki value original array ke andar copy hoti hai
            arr[i] = temp[k];
        }
    }



    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        MergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
