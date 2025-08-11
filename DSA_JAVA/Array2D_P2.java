public class Array2D_P2 {
    public static void Sum_of_second_row(int arr[][]){
        int sum = 0;
        int n=arr.length;
        int m = arr[0].length;
        // for(int j=0; j<m; j++){
        //     sum+=arr[1][j];
        // }
        for(int i=0; i<n; i++){
            sum+=arr[i][2];
        }
       System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][]={ {1,4,9},{11,4,3},{2,2,3} };
                        Sum_of_second_row(arr);
    }
    
}
