import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator obo = new OffByOne();

    @Test
    public void testOffByOne() {
        // OffByOne obo = new OffByOne();
        assertTrue(obo.equalChars('r', 'q'));
        assertTrue(obo.equalChars('a', 'b'));
        assertFalse(obo.equalChars('a', 'e'));
        assertFalse(obo.equalChars('z', 'a'));
        assertFalse(obo.equalChars('a', 'a'));
        assertTrue(obo.equalChars('&', '%'));
    }
    // Your tests go here.
    // Uncomment this class once you've created your CharacterComparator interface and OffByOne class. **/
}
