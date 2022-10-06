package ninth_task;

import java.util.LinkedList;

public class Basket {
    private LinkedList<Ball> ballsList ;

    public Basket() {
        ballsList = new LinkedList<Ball>();
    }

    public LinkedList<Ball> getBallsList () {
        return ballsList;
    }

    public void addBall (Ball ball) {
        ballsList.add(ball);
    }

    public static double getBallsWeight(Basket basket) {
        double weight = 0;

        for (Ball ball : basket.getBallsList()) {
            weight += ball.getWeight();
        }

        return weight;
    }

    private static LinkedList<Ball> getBallsListByColour(Basket basket, String colour) {
        LinkedList<Ball> ballsList = new LinkedList<>();

        for (Ball ball : basket.getBallsList()) {

            if (ball.getColour().toLowerCase().equals(colour.toLowerCase())) {
                ballsList.add(ball);
            }
        }
        return ballsList;
    }

    public static int getCountOfColoredBalls(Basket basket, String colour) {
        return getBallsListByColour(basket, colour).size();
    }
}
