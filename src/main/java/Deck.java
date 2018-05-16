import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cardDeck;


    public Deck(){
        this.cardDeck = new ArrayList<>();
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
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 53; j++){
//
//            }
//        }
    }
}
