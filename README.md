# Matrix Inversion and Operations in Java

This repository contains a Java project focused on matrix inversion and various matrix operations. The project includes classes for handling matrices, performing calculations, and displaying results. The primary functionality demonstrates the inversion of matrices and other related operations.

## Features

- **Matrix Representation**: Defines a class for representing matrices and their properties.
- **Matrix Inversion**: Implements algorithms to calculate the inverse of a matrix.
- **Matrix Operations**: Provides methods for other matrix operations such as addition, subtraction, and multiplication.
- **User Interaction**: Handles user input to create matrices and perform operations on them.
- **Result Display**: Outputs the results of matrix operations, including the inverse matrix.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes methods for matrix operations.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage for matrix inversion
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        
        double[][] matrixData = new double[size][size];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixData[i][j] = scanner.nextDouble();
            }
        }

        Matrix matrix = new Matrix(matrixData);
        Matrix inverseMatrix = matrix.inverse();

        System.out.println("Original Matrix:");
        matrix.print();

        System.out.println("Inverse Matrix:");
        inverseMatrix.print();
    }
}
```

#### Matrix Class

The `Matrix` class represents a matrix and includes methods for inversion and other operations.

```java
public class Matrix {
    private double[][] data;
    private int size;

    public Matrix(double[][] data) {
        this.data = data;
        this.size = data.length;
    }

    public Matrix inverse() {
        // Algorithm to compute the inverse of the matrix
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Other matrix operations (addition, subtraction, multiplication)
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Main`) to start the program.
3.  Follow the prompts to enter the size and elements of the matrix.
4.  The program will calculate and display the inverse of the matrix along with other matrix operations if implemented.

### Classes and Methods

-   `Main`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `Matrix`: A class representing a matrix with methods for inversion and other operations.
    -   `Matrix(double[][] data)`: Constructor that initializes the matrix with given data.
    -   `inverse()`: Method that calculates and returns the inverse of the matrix.
    -   `print()`: Method that prints the matrix.