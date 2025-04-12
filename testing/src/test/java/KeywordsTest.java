import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class KeywordsTest {
    @Test
    @DisplayName("Comprobamos si es true que hay palabras clave de java en uso")
    public void testDetectJavaKeywordTrue(){
        String stringSentence =  "Don't break my heart";

        boolean result = KeywordDetector.detectJavaKeyword(stringSentence);
        assertTrue(result);

    }

    @Test
    public void testDetectJavaKeywordFalse(){
        String stringSentence =  "I love to breakdance";

        boolean result = KeywordDetector.detectJavaKeyword(stringSentence);
        assertFalse(result);

    }

}

