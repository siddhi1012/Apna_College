import java.util.Scanner;

public class Matrix {
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
        
    }
    
}
