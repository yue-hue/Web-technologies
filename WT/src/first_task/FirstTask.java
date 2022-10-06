package first_task;

import java.util.Scanner;

public class FirstTask {
    public static double countDen(double x, double y) {
        double den = 0;
        double denominator = 1 + (Math.pow(x, 2) * Math.pow(y, 2));
        den = Math.abs(x - (2 * x / denominator)) + 2;
        return den;
    }

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
        double x = inputParam((char)120);
        double y = inputParam((char)121);

        double res = Math.sin(x + y) * Math.sin(x + y) + 1;
        double denominator = countDen(x, y);
        res = (res / denominator) + x;

        System.out.println("Result = " + res);
    }
}
