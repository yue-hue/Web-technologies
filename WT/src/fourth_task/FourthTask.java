package fourth_task;

import java.util.ArrayList;
import java.util.Scanner;

public class FourthTask {
    public static void printRes(ArrayList<Integer> primeNum) {
        if (primeNum.size() > 0) {
            System.out.print("\nPrime numbers are in positions: ");
            for (int i = 0; i < primeNum.size(); i++) {
                System.out.print(primeNum.get(i) + " ");
            }
        }
        else {
            System.out.print("\nArray doesn't contain prime numbers.\n");
        }
    }

    public static void printArr(int[] arr, int N) {
        System.out.print("Array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean isNumPrime(int num) {
        if (num < 2)
            return false;
        double s = Math.sqrt(num);
        for (int i = 2; i <= s; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> createArrList(int[] arr, int N) {
        ArrayList<Integer> primeNum = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (isNumPrime(arr[i])) {
                primeNum.add(i + 1);
            }
        }
        return primeNum;
    }

    public static int inputParam() {
        Scanner in = new Scanner(System.in);
        int var = 0;

        while (!in.hasNextInt()) {
            System.out.println("It must be an integer number.");
            in.next();
        }
        var = in.nextInt();
        return var;
    }

    public static int[] createArr(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Input " + (i + 1) + " symbol of array: ");
            arr[i] = inputParam();
        }

        return arr;
    }

    public static void getRes() {
        System.out.print("Input array length: ");
        int N = inputParam();

        int[] arr = createArr(N);

        ArrayList<Integer> primeNum = createArrList(arr, N);

        printArr(arr, N);

        printRes(primeNum);
        System.out.print("\n");
    }

}
