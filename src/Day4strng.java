
import java.util.Scanner;
//testing comments
public class Day4strng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Enter either rock,or paper, or scissors, or enter quit if you want to quit");
            System.out.println();
            String player1 = in.nextLine();
            if(player1.equals("quit")){
                break;
            }
            if(!player1.equals("rock") && !player1.equals("scissors") && !player1.equals("paper")) {
                System.out.println("your move is not valid");
            }
                else {
                    int rand = (int) (Math.random() * 3);
                    String opponentMove = "";
                    if(rand == 0) {
                        opponentMove = "rock";
                    } else if(rand == 1) {
                        opponentMove = "paper";
                    }else {
                        opponentMove = "scissors";
                    }
                    System.out.println("opponentmove: " + opponentMove);

                    if(player1.equals(opponentMove)) {
                        System.out.println("you tied");
                    } else if ((player1.equals("rock") && opponentMove.equals("scissors")) || (player1.equals("scissors") && opponentMove.equals("paper")) ||
                            (player1.equals("paper") && opponentMove.equals("rock"))) {
                        System.out.println("you won");
                    } else {
                        System.out.println("you lost");
                    }

                    }
                }
            System.out.println("Thanks for palying: ");
            }
        }



