public class Min_subArray {
    public static void min_subArray(int numbers[]){
        int currSum = 0;
        int minSum = Integer.MAX_VALUE;
        for(int i=0 ;i<numbers.length; i++){
            int start = i;
            for(int j=i ;j<numbers.length; j++){
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum-=numbers[k];
                }
                System.out.println(currSum);
                if(minSum > currSum){
                    minSum = currSum;
                }

            }
        }
        System.out.println("Min Sum is:"+minSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        min_subArray(numbers);

    }
    
}
