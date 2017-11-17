/**
* This program will randomly choose 4 cards from a standard deck of cards.
* @author Brian McEntee
*/
public class CardsFromDeck {
    /** Main method. */
    public static void main(String[] args) {
        // Create deck of cards
        int[] deck = new int[52];
        // Create utility arrays which help us determine the suit and rank
        String[] suit = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
            "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the deck
        for (int i = deck.length - 1; i > 0; i--) {
            int j = (int)(Math.random() * i);
            int tempElement = deck[j];
            deck[j] = deck[i];
            deck[i] = tempElement;
        }

        // Print results
        for (int i = 0; i < 4; i++) {
            System.out.println(rank[deck[i] % 13] + " of " + 
                suit[deck[i] / 13]);
        }
    }
}