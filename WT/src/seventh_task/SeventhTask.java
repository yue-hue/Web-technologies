package seventh_task;

import java.util.Scanner;

public class SeventhTask {
    public static void printArray(double[] arr, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static double[] sortArr(double[] arr, int N) {
        double temp = 0;
        int j;
        int step = N / 2;

        while (step > 0)
        {
            for (int i = 0; i < (N - step); i++)
            {
                j = i;
                while ((j >= 0) && (arr[j] > arr[j + step]))
                {
                    temp = arr[j];
                    arr[j] = arr[j + step];
                    arr[j + step] = temp;
                    j -= step;
                }
            }
            step = step / 2;
        }

        return arr;
    }

    public static int inputSize() {
        Scanner in = new Scanner(System.in);
        int N = 0;

        System.out.print("Input array size: ");
        while (!in.hasNextInt()) {
            System.out.println("Size of matrix must be an integer number.");
            in.next();
        }
        N = in.nextInt();
        return N;
    }

    public static double inputParam() {
        Scanner in = new Scanner(System.in);
        double var = 0;


        while (!in.hasNextFloat()) {
            System.out.println("Elements of array must be number.");
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
            arr[i] = inputParam();
        }
        System.out.print("Array: ");
        printArray(arr, N);

        arr = sortArr(arr, N);

        System.out.print("\nSorted array: ");
        printArray(arr, N);
        System.out.print("\n");
    }
}
