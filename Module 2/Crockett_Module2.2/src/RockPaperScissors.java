import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1;

        System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int userChoice = input.nextInt();

        String userMove = "";
        String computerMove = "";

        if (userChoice == 1) {
            userMove = "Rock";
        } else if (userChoice == 2) {
            userMove = "Paper";
        } else if (userChoice == 3) {
            userMove = "Scissors";
        }

        if (computerChoice == 1) {
            computerMove = "Rock";
        } else if (computerChoice == 2) {
            computerMove = "Paper";
        } else if (computerChoice == 3) {
            computerMove = "Scissors";
        }

        String result;

        if (userChoice == computerChoice) {
            result = "It's a tie!";
        } else if (userChoice == 1 && computerChoice == 3) {
            result = "You win!";
        } else if (userChoice == 2 && computerChoice == 1) {
            result = "You win!";
        } else if (userChoice == 3 && computerChoice == 2) {
            result = "You win!";
        } else {
            result = "Computer wins!";
        }

        System.out.println("You chose: " + userMove);
        System.out.println("Computer chose: " + computerMove);
        System.out.println(result);
    }
}
