/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 * 
 * Modifier: Group - The Java Warriors - UNO - Gopika, Ramandeep, Naman, Simaran
 * Date: 11th August, 2022
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards()
    {
        this.cards = new ArrayList<Card>();
        for(CardNo no: CardNo.values()){
            for(CardColor color: CardColor.values()){
                cards.add(new Card(no, color));
            }
        }
        
    }

    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }


    void dealCard(Player currPlayer) {
            for (int i = 0; i < 7; i++) {
            Card deleteCard = cards.remove(0);
            currPlayer.getHandCards().add(deleteCard);
        }    
    }

    void addCard(Player currPlayer) {
        Card deleteCard = cards.remove(0);
            currPlayer.getHandCards().add(deleteCard);
    } 

    Card addCard() {
        Card deleteCard = cards.remove(0);
        return deleteCard;
    }
}//end class
