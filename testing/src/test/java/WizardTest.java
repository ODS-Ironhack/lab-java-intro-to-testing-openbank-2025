import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WizardTest {

    @Test
    public void testCastRandomSpell() {
        SpellLibrary mocklibrary = mock(SpellLibrary.class);
        when(mocklibrary.getRandomSpell()).thenReturn("Fireball");

        Wizard wizard = new Wizard(10,10,10,10,mocklibrary);
        assertEquals("Casting Fireball", wizard.castRandomSpell());
        verify(mocklibrary, times(1)).getRandomSpell();

    }
}
