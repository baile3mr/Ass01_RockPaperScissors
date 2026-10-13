import java.util.Scanner;

import static java.lang.IO.*;

public class RockPaperScissors {
    static void main() {

        Scanner input = new Scanner(System.in);
        String playAgain = "Yes";

        while (playAgain.equalsIgnoreCase("Yes")) {

            String moveA = "";
            String moveB = "";


            do {
                IO.print("Player A - Enter move (R, P, S): ");
                moveA = input.nextLine().trim().toUpperCase();
            } while (!moveA.equals("R") && !moveA.equals("P") && !moveA.equals("S"));


            do {
                IO.print("Player B - Enter move (R, P, S): ");
                moveB = input.nextLine().trim().toUpperCase();
            } while (!moveB.equals("R") && !moveB.equals("P") && !moveB.equals("S"));


            if (moveA.equals(moveB)) {
               IO.println(moveA + " vs " + moveB + " it's a Tie!");
            } else if (moveA.equals("R") && moveB.equals("S")) {
                IO.println("Rock breaks Scissors — Player A wins!");
            } else if (moveA.equals("S") && moveB.equals("P")) {
                IO.println("Scissors cuts Paper — Player A wins!");
            } else if (moveA.equals("P") && moveB.equals("R")) {
                IO.println("Paper covers Rock — Player A wins!");
            } else if (moveB.equals("R") && moveA.equals("S")) {
                IO.println("Rock breaks Scissors — Player B wins!");
            } else if (moveB.equals("S") && moveA.equals("P")) {
                IO.println("Scissors cuts Paper — Player B wins!");
            } else if (moveB.equals("P") && moveA.equals("R")) {
                IO.println("Paper covers Rock — Player B wins!");
            }


            IO.print("Play again? (Yes/No): ");
            playAgain = input.nextLine().trim();
        }

        System.out.println("Thanks for playing!");
    }
}
