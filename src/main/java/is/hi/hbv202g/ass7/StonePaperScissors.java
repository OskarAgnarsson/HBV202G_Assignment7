package is.hi.hbv202g.ass7;

import java.util.Scanner;

public class StonePaperScissors {

    //array with rock paper scissors
    private final String[] rockPaperScissors = {"rock", "paper", "scissors"};
    public static void main(String[] args) {

        StonePaperScissors game = new StonePaperScissors();
        game.play();

    }

    private int checkWinner(String playerMove, String computerMove) {
        if(playerMove.equals(computerMove)) {
            return 0;
        } else if (playerMove.equals("rock") && computerMove.equals("paper")) {
            return -1;
        } else if (playerMove.equals("paper") && computerMove.equals("scissors")) {
            return -1;
        } else if (playerMove.equals("scissors") && computerMove.equals("rock")) {
            return -1;
        } else if (playerMove.equals("rock") && computerMove.equals("scissors")) {
            return 1;
        } else if (playerMove.equals("paper") && computerMove.equals("rock")) {
            return 1;
        } else if (playerMove.equals("scissors") && computerMove.equals("paper")) {
            return 1;
        }
        return 0;
    }

    public void play() {

        System.out.println("Welcome to the game of Stone Paper Scissors!");
        System.out.println("The rules are simple:");
        System.out.println("Rock beats scissors");
        System.out.println("Scissors beats paper");
        System.out.println("Paper beats rock");

        System.out.println("Let's play!");
        System.out.println("Enter 'rock' or 'scissors' or 'paper'");
        //pick random from rockPaperScissors
        String computerChoice = rockPaperScissors[(int) (Math.random() * rockPaperScissors.length)];
        //create scanner object
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        //check if user input is rock, scissors or paper
        //if userinput equals rock
        if(userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissors")) {
            System.out.println("You chose " + userInput);
            System.out.println("Computer chose " + computerChoice);
            //check winner
            int winner = checkWinner(userInput, computerChoice);
            if(winner == 0) {
                System.out.println("It's a tie!");
            }
            else if(winner == -1) {
                System.out.println("You lost!");
            }
            else if(winner == 1) {
                System.out.println("You won!");
            }
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}
