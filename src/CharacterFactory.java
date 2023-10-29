public class CharacterFactory {
    public static Character createCharacter(String characterType) {
        Character character = null;

        if (characterType.equalsIgnoreCase("Warrior")) {
            character = new Warrior(120);
            character.addObserver(new HealthRegeneration());
            character.addObserver(new Immortality());
        } else if (characterType.equalsIgnoreCase("Mage")) {
            character = new Mage(80);
            character.addObserver(new ShieldGeneration());
            character.addObserver(new EnergyBlast());
        }

        return character;
    }
}