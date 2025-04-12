import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class OddIntegersTest {
    @Test
    public void testGetOddNumbersUpTo10(){
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        assertEquals(expected, OddNumbers.getOddNumbers(10));
    }
    @Test
    public void testGetOddNumbersThrowsExceptionOnZero(){
        assertThrows(IllegalArgumentException.class, () -> {OddNumbers.getOddNumbers(0);});
    }
}
