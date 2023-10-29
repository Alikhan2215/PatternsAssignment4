public class Main {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("Warrior");
        Character mage = CharacterFactory.createCharacter("Mage");

        System.out.print("HP before damaging: ");
        warrior.getHealth();
        warrior.takeDamage(105); // Health reaches below 60%, triggers health regeneration
        System.out.print("HP after passive regeneration: ");
        warrior.getHealth();
        warrior.takeDamage(50); // Health reaches 1 HP, triggers immortality

        mage.setHealth(40);    // Health reaches 40%, activates shield
        mage.setHealth(5);     // Health reaches 10%, triggers energy blast
    }
}