import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        Scanner scan = new Scanner(System.in);
        String Choice = scan.nextLine();

        if (Choice.equals("r") || Choice.equals("rock") || Choice.equals("Rock")) {
            Choice = ROCK;
        } else if (Choice.equals("p") || Choice.equals("paper") || Choice.equals("Paper")) {
            Choice = PAPER;
        } else if (Choice.equals("s") || Choice.equals("scissors") || Choice.equals("Scissors")) {
            Choice = SCISSORS;
        } else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        String computerMove = "";

        switch (computerRandomNumber) {
            case 0:
                computerMove = ROCK;
                break;
            case 1:
                computerMove = PAPER;
                break;
            case 2:
                computerMove = SCISSORS;
                break;
        }
        System.out.printf("The computer chose %s.%n", computerMove);
        if (((Choice.equals(ROCK)) && computerMove.equals(SCISSORS)) || (Choice.equals(PAPER) && computerMove.equals(ROCK)) ||
                (Choice.equals(SCISSORS) && computerMove.equals(PAPER))) {
            System.out.println("You win.");
        } else if (((computerMove.equals(ROCK)) && Choice.equals(SCISSORS)) || (computerMove.equals(PAPER) && Choice.equals(ROCK)) ||
                (computerMove.equals(SCISSORS) && Choice.equals(PAPER))) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw");
        }
    }
}