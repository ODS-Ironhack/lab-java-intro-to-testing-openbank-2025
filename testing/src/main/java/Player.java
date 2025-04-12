public abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int originalHealth;

    public Player(int lives, int strength, int health) {
        this.lives = lives;
        this.strength = strength;
        this.health = health;
        this.originalHealth = health;

    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void decrementLive(){
        lives --;
        if (lives <= 0 ){
            System.out.println("This character is DEAD");
        } else {
            health = originalHealth;
        }
    }

    public void attack(Player playerToAttack){
       int targetHealth =  playerToAttack.getHealth();
       playerToAttack.setHealth(targetHealth-strength);
    }

    public void checkHealth(){
        if(health <= 0){
            decrementLive();
        }
    }
}
