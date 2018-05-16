import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cardDeck;


    public Deck(){
        this.cardDeck = new ArrayList<>();
    }


    public ArrayList<Card> getCardDeck() {
        return this.cardDeck;
    }

    public int getCardDeckSize() {
        return this.cardDeck.size();
    }

    public void addCardToCardDeck(Card card) {
        this.cardDeck.add(card);
    }

    public void addAllCardsToCardDeck() {
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                cardDeck.add(new Card(suit, rank));
            }
        }
    }

}
