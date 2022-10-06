package ninth_task;

import java.util.Scanner;

public class Main {
    public static int inputCount() {
        Scanner in = new Scanner(System.in);
        int N = 0;
        N = in.nextInt();
        return N;
    }

    public static double inputWeight() {
        Scanner in = new Scanner(System.in);
        double var = 0;
        var = in.nextFloat();

        return var;
    }

    public static void fill(Basket basket) {
        Scanner in = new Scanner(System.in);

        int ballsCount;
        double ballWeight;
        String ballColor;

        /*ballsCount = inputCount();

        for (int i = 0; i < ballsCount; i++) {
            System.out.println("Ball " + (i + 1) + " of " + ballsCount);

            System.out.print("Input balls weight: ");
            ballWeight = inputWeight();

            System.out.print("Input balls color: ");
            ballColor = in.nextLine();

            basket.addBall(new Ball(ballColor, ballWeight));
        }*/
        basket.addBall(new Ball("blue", 12));
        basket.addBall(new Ball("red", 5));
        basket.addBall(new Ball("yellow", 12.3));
        basket.addBall(new Ball("blue", 10));
        basket.addBall(new Ball("blue", 5.7));

    }

    public static void main() {
        {
            Basket basket = new Basket();
            fill(basket);

            System.out.println("Total ball's weight in basket is: " + Basket.getBallsWeight(basket));
            System.out.println("Count of blue balls is: " + Basket.getCountOfColoredBalls(basket, "blue"));
        }
    }
}
