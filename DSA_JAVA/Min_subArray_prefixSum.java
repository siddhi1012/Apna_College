public class Min_subArray_prefixSum {
    public static void min_subArray_prefixsum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix []=new int[numbers.length];

        prefix[0]=numbers[0];
             //calculate prefix array
             for(int i=1; i<prefix.length; i++){
                prefix[i]=prefix[i-1]+numbers[i];
             }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1]; // if start 0 then prefix gives error for -1 index
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            
        }
        System.out.println("Max Sum is:"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        min_subArray_prefixsum(numbers);
        
    }
    
}
