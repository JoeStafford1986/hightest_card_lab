import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        deck.addAllCardsToCardDeck();
        game = new Game(deck);
        player = new Player("Hannah");
    }

    @Test
    public void playersStartsEmpty(){
        assertEquals(0, game.getPlayersCount());
    }

    @Test
    public void gamesCardDeckStartsFull(){
        Deck gamesDeck = game.getDeck();
        assertEquals(52, gamesDeck.getCardDeckSize());
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player);
        assertEquals(1, game.getPlayersCount());
    }

//    @Test
//    public void canShuffleDeck(){
//       Deck deck = game.getDeck();
//       Card cardToCheck = deck.get(0);
//
//    }
}
