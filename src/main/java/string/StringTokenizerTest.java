package string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;
import static org.junit.jupiter.api.Assertions.*;

public class StringTokenizerTest {

    private String string;
    private String trenner;
    private StringTokenizer st;

    @BeforeEach
    void setUp(){
        string = "--abc +-xyz";
        trenner = "+-";
        st = new StringTokenizer(string, trenner);
    }

    @Test
    void testStringTokenizer1(){
        assertEquals("abc ", st.nextToken());
    }

    @Test
    void testStringTokenizer2() {
        assertTrue(st.hasMoreTokens());
    }

    @Test
    void testStringTokenizer3() {
        assertEquals("xyz", st.nextToken());
    }

    @Test
    void testStringTokenizer4() {
        st.nextToken();
        st.nextToken();
        assertFalse(st.hasMoreTokens());
    }
}
