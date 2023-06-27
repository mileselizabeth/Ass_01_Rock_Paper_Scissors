import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerAMove = "";
        String playerAMoveTemp = "";
        String playerBMove = "";
        String playerBMoveTemp = "";
        String playAgain = "";
        boolean validEntry = false;
        do {
            do {
                System.out.println("Player A, what is your move? [R, P, or S]");
                playerAMoveTemp = in.next();
                if( playerAMoveTemp.equalsIgnoreCase("R")){
                    playerAMove = playerAMoveTemp;
                    validEntry = true;
                }
                else if(playerAMoveTemp.equalsIgnoreCase("P")){
                    playerAMove = playerAMoveTemp;
                    validEntry = true;
                }
                else if(playerAMoveTemp.equalsIgnoreCase("S")){
                    playerAMove = playerAMoveTemp;
                    validEntry = true;
                }
                else {
                    System.out.println("Invalid entry");
                }

            }while(!validEntry);

            validEntry = false;
            do {
                System.out.println("Player B, what is your move? [R, P, or S]");
                playerBMoveTemp = in.next();
                if( playerBMoveTemp.equalsIgnoreCase("R")){
                    playerBMove = playerBMoveTemp;
                    validEntry = true;
                }
                else if(playerBMoveTemp.equalsIgnoreCase("P")){
                    playerBMove = playerBMoveTemp;
                    validEntry = true;
                }
                else if(playerBMoveTemp.equalsIgnoreCase("S")){
                    playerBMove = playerBMoveTemp;
                    validEntry = true;
                }
                else {
                    System.out.println("Invalid entry");
                }

            }while(!validEntry);

            if(playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("S")){
                System.out.println("Rock breaks scissors, Player A wins");
            }
            else if(playerBMove.equalsIgnoreCase("R") && playerAMove.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks scissors, Player B wins");
            }
            else if(playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("S")) {
                System.out.println("Scissors cuts paper, Player B wins");
            }
            else if(playerBMove.equalsIgnoreCase("P") && playerAMove.equalsIgnoreCase("S")) {
                System.out.println("Scissors cuts paper, Player A wins");
            }
            else if(playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("P")) {
                System.out.println("Paper covers rock, Player B wins");
            }
            else if(playerBMove.equalsIgnoreCase("R") && playerAMove.equalsIgnoreCase("P")) {
                System.out.println("Paper covers rock, Player A wins");
            }
            else if(playerAMove.equalsIgnoreCase(playerBMove)) {
                System.out.println("It's a tie!");
            }

            System.out.println("Enter Y to play again.");
            playAgain = in.next();

        }while(playAgain.equalsIgnoreCase("Y"));

    }
}