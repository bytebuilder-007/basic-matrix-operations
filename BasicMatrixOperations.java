import java.util.Scanner;

public class MatrixOperations 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) 
        {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) 
            {
                rowSum = rowSum + matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        
        System.out.println("Column sums:");
        for (int j = 0; j < cols; j++) 
        {
            int colSum = 0;
            for (int i = 0; i < rows; i++) 
            {
                colSum = colSum + matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        
        if (rows == cols) 
        {
            int diagSum = 0;
            for (int i = 0; i < rows; i++) 
            {
                diagSum = diagSum + matrix[i][i];
            }
            System.out.println("Main diagonal sum: " + diagSum);
        } 
        else 
        {
            System.out.println("Diagonal sum not possible (not a square matrix).");
        }

        
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) 
        {
            for (int j = 0; j < rows; j++) 
            {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }

      
        int largest = matrix[0][0];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (matrix[i][j] > largest) 
                {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element: " + largest);
    }
}
