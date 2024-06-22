public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superpower, int healPoints) {
        super(health, damage, superpower);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superpower);
    }

    public void increaseHealPoints() {
        this.healPoints *= 1.1; // Увеличиваем на 10%
    }
}
