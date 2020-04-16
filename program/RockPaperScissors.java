package rockpaperscissors;

/*
 * RockPaperScissors runs the game "Rock, Paper, Scissors"
 * 
 * To start, just run the following:
 * java RockPaperScissors.
 */
import java.util.Scanner;

class RockPapersScissors {
    
    // Static variables
    static Player p1;
    static Player p2;
    static Player[] players = new Player[2];
    
    static Scanner in;
    static String msg1 = "Enter choice: ";
    
    static int limit = 3; // number of rounds
    static boolean stop = false; // set to true to stop game
    // Checks all win conditions.
    private static boolean isWin(Player p1, Player p2) {
        if(p1.getChoice().equals("rock")) {
            if(p2.getChoice().equals("scissors")) {
                return true;
            } else if(p2.getChoice().equals("paper")) {
                return false;
            }
        } else if(p1.getChoice().equals("paper")) {
            if(p2.getChoice().equals("rock")) {
                return true;
            } else if(p2.getChoice().equals("scissors")) {
                return false;
            }
        } else if(p1.getChoice().equals("scissors")) {
            if(p2.getChoice().equals("paper")) {
                return true;
            } else if(p2.getChoice().equals("rock")) {
                return false;
            }
        }
        return false;
    }
