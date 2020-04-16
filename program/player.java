package rockpaperscissors;

import java.util.Scanner;

class Player {
    private String name;
    private String choice;
    private int roundsWon;
    
    Player(String n) {
        name = n;
        roundsWon = 0;
    }
    
    // Get Player name.
    public String getName() {
        return name;
    }
    
    // Get Player choice.
    public String getChoice() {
        return choice;
    }
    
    // Get roundsWon.
    public int getRoundsWon() {
        return roundsWon;
    }
    
    // Set Player name.
    public void setName(String n) {
        name = n.toLowerCase();
    }
