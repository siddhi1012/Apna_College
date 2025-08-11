public class Array2D_P1 {
    public static void Count_7s_from_matrix(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("Count:"+count);
    }
    public static void main(String[] args) {
          int arr[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,7,11,12},
                        {7,7,15,16}};
                        Count_7s_from_matrix(arr);
    }
    
}
