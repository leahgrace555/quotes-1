package quotes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testJavaQuote {
    @Test
    public void testConstruct(){
        Quote testQuote = new Quote("charlie", "Yo, this wack.");

        assertEquals("charlie was written by Yo, this wack.", testQuote.toString());
    }
}
