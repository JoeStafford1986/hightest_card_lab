import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.addAllCardsToCardDeck();
        game = new Game(deck);
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



}
