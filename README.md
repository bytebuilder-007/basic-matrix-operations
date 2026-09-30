# Matrix Operations in Java

A Java console program that reads a matrix from the user and performs common operations on it using 2D arrays.

## Problem Statement

Write a program that reads a matrix of size rows x cols and then:
1. Displays the matrix
2. Prints the sum of each row
3. Prints the sum of each column
4. Prints the sum of the main diagonal (only for square matrices)
5. Prints the transpose of the matrix
6. Finds the largest element

## Concepts Used

- 2D arrays
- Nested loops
- Conditional statements (if-else)
- User input with Scanner


java MatrixOperations.java


## Sample Input and Output


Enter number of rows: 3
Enter number of columns: 3
Enter matrix elements:
1 2 3
4 5 6
7 8 9

Matrix:
1	2	3
4	5	6
7	8	9

Row sums:
Row 1: 6
Row 2: 15
Row 3: 24

Column sums:
Column 1: 12
Column 2: 15
Column 3: 18

Main diagonal sum: 15

Transpose:
1	4	7
2	5	8
3	6	9

Largest element: 9


## How It Works

| Operation | Approach |
|-----------|----------|
| Row sum | Outer loop over rows, inner loop adds each element in that row |
| Column sum | Outer loop over columns, inner loop adds each element in that column |
| Diagonal sum | Add matrix[i][i] when rows equal columns |
| Transpose | Store matrix[i][j] at transpose[j][i] in a [cols][rows] array |
| Largest element | Compare every element with the current largest |

## Future Improvements

- Matrix addition and subtraction
- Matrix multiplication
- Secondary diagonal sum
- Check whether the matrix is symmetric
- Menu-driven interface

## Author

Raghav Karthikeya
