import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int taskNum = 1;
        do {
            System.out.print("\nInput task num: ");
            taskNum = in.nextInt();

            switch (taskNum) {
                case 1: {
                    first_task.FirstTask.getRes();
                    break;
                }
                case 2: {
                    second_task.SecondTask.getRes();
                    break;
                }
                case 3: {
                    third_task.ThirdTask.getRes();
                    break;
                }
                case 4: {
                    fourth_task.FourthTask.getRes();
                    break;
                }
                case 5: {
                    fifth_task.FifthTask.getRes();
                    break;
                }
                case 6: {
                    sixth_task.SixthTask.getRes();

                    break;
                }
                case 7: {
                    seventh_task.SeventhTask.getRes();
                    break;
                }
                case 8: {
                    eighth_task.EighthTask.getRes();
                    break;
                }
                case 9: {
                    ninth_task.Main.main();
                    break;
                }

                case 0: {
                }

            }
        } while (taskNum != 0);

    }
}