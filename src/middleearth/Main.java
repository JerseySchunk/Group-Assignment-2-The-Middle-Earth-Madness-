package middleearth;

public class Main {

    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();
        
        MiddleEarthCharacter character1 = new Elf("Legolas", 100, 20);
        MiddleEarthCharacter character2 = new Orc("GazkullThraka", 120, 25);
        
        // Add characters to the manager
        manager.addCharacter(character1);
        manager.addCharacter(character2);
        
        System.out.println("All Characters:");
        manager.displayAllCharacters();
    }
}
