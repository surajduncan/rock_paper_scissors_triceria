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
