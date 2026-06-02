import java.util.*;

public class SetMatrixZeroes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Take matrix size
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        // Create matrix and take input
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix:");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Store rows and columns containing zero
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
       // Set matrix values to zero
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Print final matrix
        System.out.println("Final Matrix:");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
