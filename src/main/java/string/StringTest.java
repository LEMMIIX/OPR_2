package string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    private String s;

    @BeforeEach
    void setUp() {
        s = "Weihnachtsbaum";
    }

    /*
    erwartet: true, "baum" = "baum"
     */
    @Test
    void testSubstringEquals() {
        assertEquals("baum", s.substring(10, 14));
    }

    /*
    erwartet: false, "baum" = "baum"
     */
    @Test
    void testSubstringNotEquals() {
        assertNotEquals("baum", s.substring(9, 14));
    }

    /*
    erwartet: true, nicht selbe Identität
     */
    @Test
    void testSubstringSame() {
        assertNotSame("baum", s.substring(9, 13));
    }

    /*
    erwartet: out of bounds: 1
     */
    @Test
    void testSubstringOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> s.substring(9, 15));
    }
}
