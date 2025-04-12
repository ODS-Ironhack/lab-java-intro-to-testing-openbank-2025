public class Warrior extends Player{
    private int force;

    public Warrior(int lives, int strength, int health, int force) {
        super(lives, strength, health);
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public Elf convertToElf(){
        return new Elf(getLives(),getStrength() ,getHealth(),getForce());
    }
}
