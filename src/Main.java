public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "TELEPORT"),
                new Medic(120, 15, "HEALING", 50),
                new Warrior(150, 25, "CRITICAL DAMAGE")
        };
        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                ((Medic) hero).increaseHealPoints();
            }
        }
    }
}