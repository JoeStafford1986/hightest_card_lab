import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> handOfCards;


    public Player(String name){
        this.name = name;
        this.handOfCards = new ArrayList<>();
    }

    public String getPlayerName() {
        return this.name;
    }

    public void receiveCard(Game game){
        handOfCards.add(game.dealCard(0));
    }

    public int getHandOfCardsSize() {
        return this.handOfCards.size();
    }

    public Card getCard() {
        return this.handOfCards.get(0);
    }
}
