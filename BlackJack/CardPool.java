import java.util.Collections;
import java.util.Stack;

public class CardPool {
    private Stack<Card> cards = new Stack<Card>();
    String[] shapes = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    CardPool(int num_decks){
        for (int i=0; i< shapes.length; i++){
            for(int j=0; j<ranks.length; j++){
                cards.push(new Card(shapes[i], ranks[j]));
            }
        }
        Collections.shuffle(cards);
    }
    public Card drawCard(){
        return cards.pop();
    }
}
