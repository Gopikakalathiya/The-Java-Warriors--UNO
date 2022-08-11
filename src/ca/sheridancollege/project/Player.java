/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 * Modifier: Group - The Java Warriors - UNO - Gopika, Ramandeep, Naman, Simaran
 * Date: 11th June, 2022
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player 
{
    String name; //the unique ID for this player
    private List<Card> hand;
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }

    public List<Card> getHandCards() {
        return hand;
    }

    
}
