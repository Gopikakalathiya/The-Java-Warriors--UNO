/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Gopika Kalathiya
 */
public class Uno {
    public static void main(String[] args) {
        //create player
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        
        
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
        
        System.out.println("Cards are dealt to both players, Play begins");
        
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
            while(chosenCard < 0){
                chosenCard = sc.nextInt();
                if(chosenCard > currPlayer.getHandCards().size()){
                    System.out.println("Invalid card No: please try again");
                    chosenCard = -100;
                    
                }
            }
            Card currCard = currPlayer.getHandCards().get(chosenCard-1);
            
            //special actions
            ///skip
            if(currCard.getNum() == CardNo.SKIP){
                turn++;
            }
            
            //reverse
            if(currCard.getNum() == CardNo.REVERSE){
                //do nothing since it's two player game
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
            
            
            //check if he's the winner
            currPlayer.getHandCards().remove(chosenCard - 1);
            if(game.declareWinner(currPlayer))
            {
                break;
            }
            turn++;
        }
        
    }
}
