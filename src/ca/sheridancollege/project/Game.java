/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 * 
 * Modifier: Group - The Java Warriors - UNO - Gopika, Ramandeep, Naman, Simaran
 * Date: 11th June, 2022
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public class Game 
{
    final private static int NUMCARDSHAND = 7;
    private GroupOfCards groupOfCards;
    private ArrayList <Player> players;// the players of the game
    private Player player;
    public Game()
    {
        initGame();
        
        players = new ArrayList();
    }

     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public boolean declareWinner(Player p)
    {
        if(p.getHandCards().isEmpty())
        {
            System.out.println("Winner!!! is Player:  " + p.toString() );
            return true;
        }
        else{
            return false;
        }
        
    }

    private void initGame() {
        
        groupOfCards = new GroupOfCards();

        
        
    }

   
    
}//end class
