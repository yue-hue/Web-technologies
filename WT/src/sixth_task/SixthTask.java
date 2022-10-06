package sixth_task;

import java.util.Scanner;

public class SixthTask {

    public static void printMatrix(double[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static double[][] createMatrix(double[] arr, int N) {
        double[][] matrix = new double[N][N];
        double temp = 0;

        // i - rows; j - columns
        for (int i = 0; i < N; i++) {
            temp = arr[0];
            for (int j = 0; j < N; j++) {
                matrix[i][j] = arr[j];
            }
            for (int k = 0; k < N - 1; k++) {
                arr[k] = arr[k + 1];
            }
            arr[N - 1] = temp;
        }

        return matrix;
    }

    public static int inputSize() {
        Scanner in = new Scanner(System.in);
        int N = 0;

        System.out.print("Input matrix size: ");
        while (!in.hasNextInt()) {
            System.out.println("Size of matrix must be an integer number.");
            in.next();
        }
        N = in.nextInt();
        return N;
    }

    public static double inputArr() {
        Scanner in = new Scanner(System.in);
        double var = 0;

        while (!in.hasNextFloat()) {
            System.out.println("Elements of matrix must be number.");
            in.next();
        }
        var = in.nextFloat();
        return var;
    }

    public static void getRes() {
        int N = inputSize();

        double [] arr = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Input " + (i + 1) + " symbol of array: ");
            arr[i] = inputArr();
        }

        double[][] matrix = createMatrix(arr, N);

        printMatrix(matrix, N);

    }
}
