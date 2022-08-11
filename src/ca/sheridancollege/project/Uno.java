/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Group - The Java Warriors - UNO -Gopika, Ramandeep, Naman, Simaran
 */
public class Uno {
    public static void main(String[] args) {
        //create player
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        
        //discard pile
        List<Card> discard = new ArrayList<Card>();
        
        //create new game
        Game game = new Game();
        
        //create deck
        GroupOfCards deck = new GroupOfCards();
        
        //take inputs from user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME!! Let the play begin");
        
        //shuffle deck
        deck.shuffle();
        
        deck.dealCard(p1);
        deck.dealCard(p2);
        discard.add(deck.addCard());
        System.out.println("Cards are dealt to both players, Play begins");
        System.out.println("top card is : " + discard.get(discard.size()-1));
        
        int turn =0;
        Player currPlayer = p1;
        Player opponent = p2;
        while(!p1.getHandCards().isEmpty() && !p2.getHandCards().isEmpty()){
            //curr turn 
            if(turn%2 == 0)
            {
                currPlayer = p1;
                opponent = p2;
                
            }
            else{
                currPlayer = p2;
                opponent = p1;
            }
            
            //Current player hand
            System.out.println("Hand of Player: " + currPlayer.toString());
            int cardNo = 1;
            for(Card card: currPlayer.getHandCards()){
                System.out.println(cardNo + " : " + card.toString());
                cardNo++;
            }
            
            //choose the card to play
            System.out.println(currPlayer.toString() + ": please choose a card to play");
            int chosenCard = -100;
            Card currCard = null;
            boolean skipPlay = true;
            if(!canPlay(currPlayer.getHandCards(),discard.get(discard.size()-1))){
                deck.addCard(currPlayer);
                System.out.println("No cards to play a new card was drawn from drawing pile!! new card drawn is : " + currPlayer.getHandCards().get(currPlayer.getHandCards().size()-1));
                skipPlay = false;
            }
            if(skipPlay)
            {
            while(chosenCard < 0){
                chosenCard = sc.nextInt();
                if(chosenCard > currPlayer.getHandCards().size() && chosenCard < 0 ){
                    System.out.println("Invalid card No: please try again");
                    chosenCard = -100;
                    
                }else{
                    currCard = currPlayer.getHandCards().get(chosenCard-1);
                    List<Card> currPlayerCard = new ArrayList<>();
                    currPlayerCard.add(currCard);
                    if(!canPlay(currPlayerCard,discard.get(discard.size()-1)))
                    {
                        System.out.println("Card cannot be played: top card is : " + discard.get(discard.size()-1));
                        chosenCard = -100;
                        
                    }
                }
                
            }
            
            
            //special actions
            
            //skip
            if(currCard.getNum() == CardNo.SKIP){
                //same player get turn again since its 2 player game
                turn--;
            }
            
            //reverse
            if(currCard.getNum() == CardNo.REVERSE){
                //same player get turn again since its 2 player game
                turn--;
            }
            
            //drawTwo
            if(currCard.getNum() == CardNo.DRAWTWO){
               deck.addCard(opponent);
               deck.addCard(opponent);
               
            }
            
            
            //drawFour
            if(currCard.getNum() == CardNo.DRAWFOUR){
                 
                deck.addCard(opponent);
                deck.addCard(opponent);
                deck.addCard(opponent);
                deck.addCard(opponent);

            }
            
            
            //check if we get the winner
            
            discard.add(currPlayer.getHandCards().remove(chosenCard - 1));
            skipPlay = false;
            }
            System.out.println("top card is : " + discard.get(discard.size()-1));
            System.out.println("----------------------next turn----------------");
            if(game.declareWinner(currPlayer))
            {
                break;
            }
            turn++;
        }
        
    }

    private static boolean canPlay(List<Card> handCards, Card topCard) {
        for(Card card: handCards)
        {
            if(card.getColor() == topCard.getColor() || card.getNum() == topCard.getNum())
            {
                return true;
            }
            if(card.getNum() == CardNo.DRAWFOUR || card.getNum() == CardNo.WILDCARD  )
            {
                return true;
            }
        }
       return false;
    }
}
