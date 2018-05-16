import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;
    Game game;

    @Before
    public void before(){
        player = new Player("Richard");
        deck = new Deck();
        deck.addAllCardsToCardDeck();
        game = new Game(deck);
    }

    @Test
    public void canGetPlayerName(){
        assertEquals("Richard", player.getPlayerName());
    }

    @Test
    public void canReceiveCard(){
        player.receiveCard(game);
        assertEquals(51, game.getDeck().getCardDeckSize());
        assertEquals(1, player.getHandOfCardsSize());
    }


}
