public interface PassiveAbility {
    void onHealthChanged(Character character, int previousHealth, int newHealth);
}