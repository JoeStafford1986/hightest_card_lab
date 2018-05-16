import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void cardDeckStartsEmpty(){
        assertEquals(0, deck.getCardDeckSize());
    }

    @Test
    public void canAddCardToCardDeck(){
        deck.addCardToCardDeck(card);
        assertEquals(1, deck.getCardDeckSize());
    }

    @Test
    public void canAddAllCardsToCardDeck(){
        deck.addAllCardsToCardDeck();
        assertEquals(52, deck.getCardDeckSize());
    }
}
