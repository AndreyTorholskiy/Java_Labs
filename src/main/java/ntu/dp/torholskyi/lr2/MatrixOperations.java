package ntu.dp.torholskyi.lr2;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    private static final int MAX_SIZE_MATRIX = 20;
    private static final int MIN_RANDOM_NUMBER = -20;
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MANUAL_MATRIX_FILLING = 1;
    private static final int RANDOM_MATRIX_FILLING = 2;
    private int rows;
    private int columns;
    private int[][] matrix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        MatrixOperations matrixOperations = new MatrixOperations();

        System.out.println("\t\tMatrix operations");
        System.out.println("____________________________________\n");

        matrixOperations.getMatrixSize(scanner);
        matrixOperations.createMatrix();

        System.out.print("Enter method of filling matrix (" + MANUAL_MATRIX_FILLING + " - user input," + RANDOM_MATRIX_FILLING + " - random): ");
        int choice = scanner.nextInt();

        if (choice != MANUAL_MATRIX_FILLING && choice != RANDOM_MATRIX_FILLING) {
            System.out.println("Invalid matrix filling method! Exiting...");
            System.exit(0);
        }

        switch (choice) {
            case MANUAL_MATRIX_FILLING:
                matrixOperations.fillMatrixManually(scanner);
                break;
            case RANDOM_MATRIX_FILLING:
                matrixOperations.fillMatrixRandomly(random);
                break;
            default:
                System.out.println("Invalid matrix filling method! Exiting...");
                System.exit(0);
        }

        matrixOperations.printMatrix(matrixOperations.matrix);
        System.out.println("Minimum matrix element: " + matrixOperations.getMinimalMatrixElement(matrixOperations.matrix));
        System.out.println("Maximum matrix element: " + matrixOperations.getMaximalMatrixElement(matrixOperations.matrix));
        System.out.printf("Average matrix element: %.3f", matrixOperations.getMatrixAverage(matrixOperations.matrix));

    }

    private void getMatrixSize(Scanner scanner) {
        System.out.print("Enter size of matrix rows (not greater than " + MAX_SIZE_MATRIX + "): ");
        rows = scanner.nextInt();

        System.out.print("Enter size of matrix columns (not greater than " + MAX_SIZE_MATRIX + "): ");
        columns = scanner.nextInt();

        if (rows > MAX_SIZE_MATRIX || columns > MAX_SIZE_MATRIX || rows <= 0 || columns <= 0) {
            System.out.println("Invalid matrix size! Exiting...");
            System.exit(0);
        }
    }

    private void createMatrix() {
        matrix = new int[rows][columns];
    }

    private void fillMatrixManually(Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]:");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private void fillMatrixRandomly(Random random) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER + 1) + MIN_RANDOM_NUMBER;
            }
        }
    }

    private void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int rowElement : row) {
                System.out.printf("%4d", rowElement);
            }
            System.out.println();
        }
    }

    private int getMinimalMatrixElement(int[][] matrix) {
        int minElement = matrix[0][0];
        for (int[] row : matrix) {
            for (int rowElement : row) {
                if (rowElement < minElement) {
                    minElement = rowElement;
                }
            }
        }
        return minElement;
    }

    private int getMaximalMatrixElement(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int[] row : matrix) {
            for (int rowElement : row) {
                if (rowElement > maxElement) {
                    maxElement = rowElement;
                }
            }
        }
        return maxElement;
    }

    private double getMatrixAverage(int[][] matrix) {
        double sumElements = 0;
        int countElements = 0;
        for (int[] row : matrix) {
            for (int rowElement : row) {
                sumElements += rowElement;
                countElements++;
            }
        }
        return sumElements / countElements;
    }
}
