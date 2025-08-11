public class Selection_sort {
    public static void selction_sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swapp
            int temp= arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
      int arr[]= { 5,4,3,2,1};
      selction_sort(arr);
      PrintArray(arr);
    }
    
}
