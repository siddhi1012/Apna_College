public class Spiral_Matrix {
    public static void Printing_spiral_Matrix(int Matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = Matrix.length - 1;
        int endCol = Matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top 
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(Matrix[startRow][j] + " ");
            }

            // Right 
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(Matrix[i][endCol] + " ");
            }

            // Bottom
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(Matrix[endRow][j] + " ");
                }
            }

            // Left 
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(Matrix[i][startCol] + " ");
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        System.out.println(); 



        
    }

    public static void main(String[] args) {
        int Matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        Printing_spiral_Matrix(Matrix);
    }
}
