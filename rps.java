import java.util.Random;
import java.util.Scanner;

public class rps {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        String playerMove;
      
        while(true) {
            System.out.println("Choose between rock, paper or scissors.");
            System.out.println("Enter your move (r, p or s)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
             System.out.println(playerMove + " is not a valid move.");
        }
      
        System.out.println("Computer played: " + computerMove);
      
        if (playerMove.equals(computerMove)) {
            System.out.println("The game was a tie!");
        }
        
        else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("You lose! (Paper wraps rock.)");
            }
            else if (computerMove.equals("s")) {
                System.out.println("You win! (Rock smashes the scissor.)");
            }
        }
        
        else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                System.out.println("You win! (Paper wraps rock.)");
            }
            else if (computerMove.equals("s")) {
                System.out.println("You lose! (Scissors cut paper.)");
            }
        }
        
        else if (playerMove.equals("s")) {
            if (computerMove.equals("p")) {
                System.out.println("You win! (Scissors cut paper.)");
            }
            else if (computerMove.equals("r")) {
                System.out.println("You lose! (Rock smashes the scissors)");
            }
        }
        
        System.out.println("Play again? (y or n)");
        String playAgain = scanner.nextLine();
        
        if (!playAgain.equals("y")) {
            break;
        }
    }
    scanner.close();
}
}