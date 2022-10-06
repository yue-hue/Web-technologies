package second_task;

import java.util.Scanner;

public class SecondTask {
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

        if (x >= -6 && x <= 6) {
            if (y >= -3 && y <= 5) {
                if ((x < -4 && y > 0) || (x > 4 && y > 0)) {
                    System.out.println("false");
                }
                else
                    System.out.println("true");
            }
        }

    }
}
