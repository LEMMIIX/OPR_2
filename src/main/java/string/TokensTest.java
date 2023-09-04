package string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TokensTest {
    private String st;
    private String[] starray;
    private String[] tokens;

    @BeforeEach
    void setUp() {
        st = "Lennart,Simon,Philippp,Manuel";
        starray = new String[]{"Lennart", "Simon", "Philippp", "Manuel"};
        tokens = Tokens.tokens(st, ",");
    }

    @Test
    void testTokens1() {
        assertEquals("Lennart", Tokens.tokens(st, ",")[0]);
    }

    @Test
    void testTokens2() {
        assertEquals("Simon", Tokens.tokens(st, ",")[1]);
    }

    @Test
    void testTokens3() {
        assertNotSame("Lennart", tokens[0]);
    }

    @Test
    void testTokens4() {
        assertNotEquals(starray, Tokens.tokens(st, ","));
    }
}