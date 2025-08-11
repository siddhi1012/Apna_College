public class Transpose_matrix {
    public static void Transpose_Matrix(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int transpose[][]=new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[j][i]=arr[i][j];
            }
        }
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(transpose[j][i]+"  ");
            }
               System.out.println();
        }
     

    }
  

     
    
     public static void main(String[] args) {
        int arr[][]={ {12,4,9},{11,4,3},{24,2,3} };
        Transpose_Matrix(arr);
    
}
    
}
