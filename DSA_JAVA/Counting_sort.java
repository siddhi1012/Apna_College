public class Counting_sort {
    public static void counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        // find largest element
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest, arr[i]);
        }
        //create count array
        int count []=new int[largest+1];

        // count each elemnt's frquency
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // sorting the array using the count array
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]= i;
                j++;
                count[i]--;
            }
        }
    }
    public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr []= {1,4,1,3,2,4,3,7};
        counting_sort(arr);
        PrintArray(arr);
    }
    
}
