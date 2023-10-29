public class EnergyBlast implements PassiveAbility {
    @Override
    public void onHealthChanged(Character character, int previousHealth, int newHealth) {
        if (newHealth <= 10) {
            System.out.println("Mage blasted energy to the nearby enemies.");
        }
    }
}
