import java.util.ArrayList;
import java.util.List;

public class Character {
    private int currentHealth;
    private int maxHealth;
    private List<PassiveAbility> passiveAbilities = new ArrayList<>();

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public void getHealth() {
        System.out.println(currentHealth);
    }

    public void addObserver(PassiveAbility passiveAbility) {
        passiveAbilities.add(passiveAbility);
    }

    public void removeObserver(PassiveAbility passiveAbility) {
        passiveAbilities.remove(passiveAbility);
    }

    public void setHealth(int newHealth) {
        int previousHealth = currentHealth;
        currentHealth = newHealth;

        for (PassiveAbility passiveAbility : passiveAbilities) {
            passiveAbility.onHealthChanged(this, previousHealth, newHealth);
        }
    }

    public void takeDamage(int damage) {
        int newHealth = currentHealth - damage;
        if (newHealth < 0) {
            newHealth = 0; // Ensure health doesn't go below 0
        }
        setHealth(newHealth);
    }
}