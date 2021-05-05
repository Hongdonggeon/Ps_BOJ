import java.util.Vector;

public class Player {
    private Vector<Card> hand = new Vector<Card>();

    public void addCard(Card card){
        hand.add(card);
    }

    public Card get(int item){ //item 번째 카드를 리턴한다.
        return hand.get(item);
    }

    public Vector<Card> getHand(){
        return hand;
    }
}
