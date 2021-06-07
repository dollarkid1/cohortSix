package Games;

import static Games.Ranks.*;
import static Games.Suits.*;
// 1. create array of deck, suit, and ranks
//   2. initialize the deck
//    3.shuffle deck
//   4. Displaying the first four cards with a loop by dividing cardNumber / 13 to determine the suit of the card and
// 5.  Using modulo in identifying a card, with cardNumber % 13 which determines the rank of the card



public class DeckOfCards {

    public static void main(String[] args) {

        int [] deck = new int[52];
        Games.Suits[] suits = {SPADES, HEARTS, DIAMOND, CLUBS};
        Games.Ranks[] ranks = {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,EIGHT, NINE, TEN,JACK, QUEEN, KING};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random()* deck.length);
            int temp = deck[i];
            deck[i] =  deck[index];
            deck[index]= temp;
        }

       /* for (int i = 0; i < 4; i++) {
            Games.Suits  suit =suits[deck[i] / 13];
            Games.Ranks rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }*/
        for (int i = 0; i < 4; i++) {
            int cardNumber = (int)(Math.random() * deck.length);
            Games.Suits   suit = suits[cardNumber / 13];
            Games.Ranks rank = ranks[cardNumber % 13];
            System.out.println("Card number " + cardNumber + ": "
                    + rank + " of " + suit);
        }
        String s = new String("dan");
        String t = new String("dan");
        System.out.println(s==t);
        System.out.println(s.equals(t));

    }

}
