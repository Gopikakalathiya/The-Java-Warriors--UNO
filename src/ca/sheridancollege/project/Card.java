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

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    CardNo num;
    CardColor color;
    public Card(CardNo num, CardColor color) {
    this.num = num;
    this.color = color;
    }

    public CardNo getNum() {
        return num;
    }

    public void setNum(CardNo num) {
        this.num = num;
    }

    public CardColor getColor() {
        return color;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return num + " of "+ color;
    }
    
}
