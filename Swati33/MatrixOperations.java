import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare two 2x2 matrices
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        
        // Input matrices from the user
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Show menu for operations
        System.out.println("\nSelect an operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        System.out.println("3. Matrix 1 Transpose");
        System.out.println("4. Matrix 2 Transpose");

        // Read the user's choice
        int choice = scanner.nextInt();

        // Perform the chosen operation using a switch-case
        switch (choice) {
            case 1:
                // Matrix Addition
                int[][] additionResult = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        additionResult[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("\nMatrix Addition Result:");
                printMatrix(additionResult);
                break;

            case 2:
                // Matrix Multiplication
                int[][] multiplicationResult = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        multiplicationResult[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            multiplicationResult[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                System.out.println("\nMatrix Multiplication Result:");
                printMatrix(multiplicationResult);
                break;

            case 3:
                // Matrix 1 Transpose
                int[][] transposeMatrix1 = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        transposeMatrix1[i][j] = matrix1[j][i];
                    }
                }
                System.out.println("\nMatrix 1 Transpose:");
                printMatrix(transposeMatrix1);
                break;

            case 4:
                // Matrix 2 Transpose
                int[][] transposeMatrix2 = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        transposeMatrix2[i][j] = matrix2[j][i];
                    }
                }
                System.out.println("\nMatrix 2 Transpose:");
                printMatrix(transposeMatrix2);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        // Close the scanner
        scanner.close();
    }

    // Helper function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
