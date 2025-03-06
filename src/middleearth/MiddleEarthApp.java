package middleearth;
import java.util.Scanner;
public class MiddleEarthApp {
	public static void main(String[] args) {
		CharacterManager manager = new CharacterManager();
		Scanner scanner = new Scanner(System.in);
		
		boolean quit = false;
		do {
			System.out.println("1. Add a new character.");
			System.out.println("2. View all characters.");
			System.out.println("3. Update a character.");
			System.out.println("4. Delete a Character");
			System.out.println("5. Executes all characters' attack actions.");
			System.out.println("6. Exit.");
			int choice;
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("Enter the name of the character");
				String name = scanner.next();
				System.out.println("Enter a health amount");
				double health = scanner.nextDouble();
				System.out.println("Enter a attack power amount");
				double power = scanner.nextDouble();
				
				System.out.println("Please enter a characters race");
				System.out.println("1. Dwarf.");
				System.out.println("2. Elf.");
				System.out.println("3. Human.");
				System.out.println("4. Orc");
				System.out.println("5. Wizard");
				int race = scanner.nextInt();
				
				MiddleEarthCharacter newCharacter = null;

				switch(race) {
				case 1:
					newCharacter = new Dwarf(name, health, power);
					manager.addCharacter(newCharacter);
					continue;
				case 2:
					newCharacter = new Elf(name, health, power);
					manager.addCharacter(newCharacter);
					continue;
				case 3:
					newCharacter = new Human(name, health, power);
					manager.addCharacter(newCharacter);
					continue;
				case 4:
					newCharacter = new Orc(name, health, power);
					manager.addCharacter(newCharacter);
					continue;
				case 5:
					newCharacter = new Wizard(name, health, power);
					manager.addCharacter(newCharacter);
					continue;
				default:
					System.out.println("Please enter a valid number");
					break;
					
				}
				
			case 2:
				manager.displayAllCharacters();
				break;
				
			case 3:
				System.out.println("Enter a characters name to update");
				manager.displayAllCharacters();
				String characterName = scanner.next();
				
				MiddleEarthCharacter updatedCharacter = manager.getCharacter(characterName);
				
				if (updatedCharacter != null) {
					System.out.println("Change what you want to update");
					System.out.println("Enter a name");
					String newName = scanner.next();

					System.out.println("Enter a health amount");
					double newHealth = scanner.nextDouble();
					
					System.out.println("Enter a attack power amount");
					double newPower = scanner.nextDouble();
					
					manager.updateCharacter(updatedCharacter, newName, newHealth, newPower);
					break;
					
				}
			case 4:
				System.out.println("Enter a characters name to delete");
				manager.displayAllCharacters();
				String deletedName = scanner.next();

				MiddleEarthCharacter deletedCharacter = manager.getCharacter(deletedName);
				if (deletedName != null) {
					manager.deleteCharacter(deletedCharacter);
				}
				else {
					System.out.println("No Character found with that name");
				}
				break;
				
			case 5:
				
			case 6:
				quit = true;
				break;
				
				
				
			}
		}
		while(!quit);
		scanner.close();

	}
}
