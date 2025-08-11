import java.util.Scanner;
public class Matrix_element_search {
    public static boolean Search_element(int matrix[][],int key){
       
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]== key){
                    System.out.println("Element found at cell"+"("+i+","+j+")");
                    return true;

                }
            }
        }
        System.out.println("Element is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix [] []= new int[3][3];
        int n=matrix.length, m=matrix[0].length;    // n=3,m=3
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Element:");
       

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
         Search_element(matrix, 5);
    
        
    }

    
}
