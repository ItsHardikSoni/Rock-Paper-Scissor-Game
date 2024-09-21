import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 for Rock
        // 2 for Paper
        // 3 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (1 for Rock, 2 for Paper, 3 for Scissor): ");
        int userchoice = sc.nextInt();

        Random rand = new Random();
        int computerchoice = rand.nextInt(3);

        if (userchoice == computerchoice) {
            System.out.println("Draw");
            System.out.println("Computer Choice: " + computerchoice);
        }
        else if (userchoice == 1 && computerchoice == 3 || userchoice == 2 && computerchoice == 1 || userchoice == 3 && computerchoice == 1) {
            System.out.println("You Win!");
            System.out.println("Computer Choice: " + computerchoice);
        }
        else {
            System.out.println("Computer Win!");
            System.out.println("Computer Choice: " + computerchoice);
        }
    }
}