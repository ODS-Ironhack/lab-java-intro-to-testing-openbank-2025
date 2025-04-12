import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
public class WarriorTest {
    @Test
    public void testConstructorAssignsValuesCorrectly(){
        Warrior warrior = new Warrior(100,21,12,1090);

        assertEquals(100, warrior.getLives());
        assertEquals(21, warrior.getStrength());
        assertEquals(12, warrior.getHealth());
        assertEquals(1090, warrior.getForce());

    }

    @Test
    public void testWarriorConvertsToElfCorrectly(){
        Warrior warrior = new Warrior(100,21,12,190);
        Player warriorConverted = warrior.convertToElf();


        assertTrue(warriorConverted instanceof Elf);
        assertEquals(100, warriorConverted.getLives());
        assertEquals(21, warriorConverted.getStrength());

    }

    @Test
    public void testWarriorAttacksCorrectly() throws InstantiationException, IllegalAccessException {
        SpellLibrary mockLibrary = mock(SpellLibrary.class);

        Wizard wizard = new Wizard(30,21,37,89, mockLibrary);
        Warrior warrior = new Warrior(10,21,12,190);

        warrior.attack(wizard);

        assertEquals(16, wizard.getHealth());
    }

}
