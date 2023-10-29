public class HealthRegeneration implements PassiveAbility {
    @Override
    public void onHealthChanged(Character character, int previousHealth, int newHealth) {
        double previousHealthPercentage = (double) previousHealth / character.getMaxHealth();
        double newHealthPercentage = (double) newHealth / character.getMaxHealth();

        if (previousHealthPercentage > 0.6 && newHealthPercentage <= 0.6) {
            int regeneratedHealth = (int) (newHealth + 0.3 * character.getMaxHealth());
            regeneratedHealth = Math.min(regeneratedHealth, character.getMaxHealth());
            character.setHealth(regeneratedHealth);
            System.out.println("Warrior regenerated 30% of Health. Current health: " + (double) regeneratedHealth / character.getMaxHealth() * 100 + "%");
        }
    }
}