public abstract class Hero implements HavingSuperAbility {
    protected int health;
    protected int damage;
    protected String superpower;

    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperpower() {
        return superpower;
    }
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
}
