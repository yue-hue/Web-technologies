package fifth_task;

import java.util.Scanner;
import java.util.ArrayList;

public class FifthTask {

    public static void printArr(int[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void getRes() {
        int[] arr = new int[]{7, 28, 30, 49, 72, 55, 3, 115, 93};
        ArrayList<Integer> resultArr = new ArrayList<Integer>();
        int num = arr[0];
        int count = 0;
        resultArr.add(num);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
                resultArr.add(num);
            } else {
                count++;
            }
        }
        printArr(arr);
        System.out.println("K: " + count);
        System.out.print("Result: ");
        for (Integer elem : resultArr) {
            System.out.print(elem + " ");
        }
        System.out.print("\n");
    }
}
