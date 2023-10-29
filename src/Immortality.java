public class Immortality implements PassiveAbility {
    @Override
    public void onHealthChanged(Character character, int previousHealth, int newHealth) {
        if (newHealth <= 1) {
            System.out.println("Warrior is Immortal for the next 5 Seconds.");
        }
    }
}