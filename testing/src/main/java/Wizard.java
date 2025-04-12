import java.util.ArrayList;

public class Wizard extends Player{
    private int spell;
    private final SpellLibrary spellLibrary;

    public Wizard(int lives, int strength, int health, int spell, SpellLibrary spellLibrary) {
        super(lives, strength, health);
        this.spell = spell;
        this.spellLibrary = spellLibrary;
    }

    public int getSpell() {
        return spell;
    }
    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Elf convertToElf(){
        return new Elf(getLives(),getStrength() ,getHealth(), getSpell());
    }

    public String castRandomSpell(){
        return "Casting " + spellLibrary.getRandomSpell();
    }
}
