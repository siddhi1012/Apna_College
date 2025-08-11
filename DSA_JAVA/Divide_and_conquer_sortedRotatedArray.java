public class Divide_and_conquer_sortedRotatedArray {
    public static int search(int arr[], int tar, int si, int ei){
      // base case
      if(si > ei){
        return -1;
          }  
        // kaam
        int mid = si+(ei-si)/2;
        // case Found
        if(arr[mid] == tar){
            return mid;
        }
        // mid Lies on L1
        if(arr[si] <= arr[mid]){
            // case a -> left search
            if(arr[si]<= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1); // beacuse if mid is equal to target thats why mid-1
            }else{
                // case b -> right search
                return search(arr, tar, mid+1, ei);
            }

        }
         // mid lies on L2
        else{
            // case c -> right search
            if(arr[mid]<= tar && tar <= arr[ei]){
                return search(arr, tar,mid+1, ei);
            }else{
                // case d
                return search(arr, tar, si, mid-1);
            }          
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length-1));
    
    }
    
}
