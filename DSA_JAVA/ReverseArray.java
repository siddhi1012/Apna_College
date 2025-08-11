public class ReverseArray {
    public static int reverseArray(int numbers[]){
        int start=0,end=numbers.length-1;
        while(start < end){
            // swap 
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] =temp;
            start++;
            end--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverseArray(numbers);
        // Print Array
        for(int i=0; i < numbers.length ;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
}
