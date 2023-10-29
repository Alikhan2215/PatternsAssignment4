public class ShieldGeneration implements PassiveAbility {
    @Override
    public void onHealthChanged(Character character, int previousHealth, int newHealth) {
        if (newHealth <= 50 && previousHealth > 50) {
            System.out.println("Mage activated a shield.");
        }
    }
}