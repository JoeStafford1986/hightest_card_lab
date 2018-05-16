import java.util.ArrayList;
import java.util.*;


public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<>();
    }


    public int getPlayersCount() {
        return this.players.size();
    }

    public Deck getDeck() {
        return this.deck;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void shuffleDeck(ArrayList<Deck> deck){
        Collections.shuffle(deck);
    }

    public Card dealCard(int firstCard){
        Card cardToDeal = this.getDeck().getCardDeck().get(firstCard);
        this.getDeck().getCardDeck().remove(cardToDeal);
        return cardToDeal;
    }

    public Player getWinner(){
        Player winningPlayer = players.get(0);
        for (Player player: players){
            if (player.getCard().getRank().getValue() > winningPlayer.getCard().getRank().getValue()){
                winningPlayer = player;
            } else if (player.getCard().getRank().getValue() == winningPlayer.getCard().getRank().getValue() ){
                player.
            }
        }
        
        return winningPlayer;
    }

}
