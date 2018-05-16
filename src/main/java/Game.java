import java.util.ArrayList;

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
}
