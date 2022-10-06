package eighth_task;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class EighthTask {

    public static void printArr(int[] arr, int N, String name) {
        System.out.print("Sequence " + name + ": ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static int inputLength() {
        Scanner in = new Scanner(System.in);
        int var = 0;

        while (!in.hasNextInt()) {
            System.out.println("Length must be an integer number.");
            in.next();
        }
        var = in.nextInt();
        return var;
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
            System.out.print("Input " + (i + 1) + " symbol of sequence: ");
            arr[i] = inputParam();
        }
        Arrays.sort(arr);

        return arr;
    }

    private static ArrayList<Integer> insertElements(int[] sequenceA, int[] sequenceB) {
        ArrayList<Integer> resList = new ArrayList<>();
        ArrayList<Integer> positionList = new ArrayList<>();

        for (int i = 0; i < sequenceA.length; i++) {
            resList.add(sequenceA[i]);
        }

        for (int i = 0; i < sequenceB.length; i++) {
            for (int j = 0; j < resList.size(); j++) {
                if (resList.get(j) > sequenceB[i]) {
                    resList.add(j, sequenceB[i]);
                    positionList.add(j);
                    break;
                }
            }
        }

        for (int i = 0; i < sequenceB.length; i++) {
            for (int j = 0; j < resList.size(); j++) {

                if (resList.get(j) < sequenceB[i] && !resList.contains(sequenceB[i])) {
                    resList.add(sequenceB[i]);
                    positionList.add(resList.indexOf(sequenceB[i]));
                }
            }
        }

        System.out.print("Result array: ");
        for (Integer num : resList) {
            System.out.print(num + " ");
        }

        System.out.print("\nPositions: ");
        for (Integer num : positionList) {
            System.out.print(num + " ");
        }

        return resList;
    }

    public static void getRes() {
        System.out.print("Input first sequence length: ");
        int lengthA = inputLength();
        int[] sequenceA = createArr(lengthA);

        System.out.print("Input second sequence length: ");
        int lengthB = inputLength();
        int[] sequenceB = createArr(lengthB);

        printArr(sequenceA, lengthA, "a");
        printArr(sequenceB, lengthB, "b");

        ArrayList<Integer> resList = insertElements(sequenceA, sequenceB);

        System.out.print("\n");
    }

}
