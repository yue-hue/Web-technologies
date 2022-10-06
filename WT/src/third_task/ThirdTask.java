package third_task;

import java.util.Scanner;

public class ThirdTask {
    public static double inputParam(char param) {
        Scanner in = new Scanner(System.in);
        double var = 0;

        System.out.print("Input " + param + ": ");
        while (!in.hasNextFloat()) {
            System.out.println(param + " must be number.");
            in.next();
        }

        var = in.nextFloat();

        return var;
    }

    public static void getRes() {
        double a = inputParam((char)97);
        double b = inputParam((char)98);
        double h = inputParam((char)104);

        System.out.print("  x | tan(x)\n");
        for (double i = a; i <= b; i += h) {
            double res = Math.tan(i);
            System.out.print(i + " | " + res + "\n");
            System.out.print("----|-----\n");
        }
    }
}
