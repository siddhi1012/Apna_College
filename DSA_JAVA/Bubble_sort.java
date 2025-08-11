public class Bubble_sort { 
    public static void bubble_sort(int arr[]){
        for(int turn=0; turn< arr.length-1; turn++){
            int swap = 0;
            for(int j=0; j<arr.length-1-turn; j++){
                //swapp
                if(arr[j]> arr[j+1]){
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }   
            }
        }   
    }
    public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        bubble_sort(arr);
        PrintArray(arr);

    
}
    
}
