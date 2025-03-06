package middleearth;
//allows user to interact with the console
import java.util.Scanner;
/**
 * MiddleEarthApp acts as the main class for the application
 * Allowing users to add characters, update and delete them
 * Also showing a battle simulation between predefined characters
 */
public class MiddleEarthApp {
	public static void main(String[] args) {
		CharacterManager manager = new CharacterManager();
		Scanner scanner = new Scanner(System.in);
		

		boolean quit = false;
		//Loop to display the menu
		do {
			System.out.println("1. Add a new character.");
			System.out.println("2. View all characters.");
			System.out.println("3. Update a character.");
			System.out.println("4. Delete a Character");
			System.out.println("5. Battle Simulation.");
			System.out.println("6. Exit.");
			int choice;
			//reads the users choice
			choice = scanner.nextInt();
			//Switch case to the menu options
			switch(choice) {
			
			//First Case which is for Add a new character
			case 1:
				
				System.out.println("Enter the name of the character");
				String name = scanner.next();
				System.out.println("Enter a health amount");
				double health = scanner.nextDouble();
				System.out.println("Enter a attack power amount");
				double power = scanner.nextDouble();
				//what subclass you are using
				System.out.println("Please enter a characters race");
				System.out.println("1. Dwarf.");
				System.out.println("2. Elf.");
				System.out.println("3. Human.");
				System.out.println("4. Orc");
				System.out.println("5. Wizard");
				int race = scanner.nextInt();
				
				MiddleEarthCharacter newCharacter = null;
				//Actually applies what the user input to create a character
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
					//In case a user inputs a invalid number
				default:
					System.out.println("Please enter a valid number");
					break;
					
				}
			//Case to Display all characters the users made
			case 2:
				manager.displayAllCharacters();
				break;
				
			case 3:
				System.out.println("Enter a characters name to update");
				manager.displayAllCharacters();
				String characterName = scanner.next();
				
				MiddleEarthCharacter updatedCharacter = manager.getCharacter(characterName);
				//makes sure you entered something
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
				//get the character to delete from the manager
				MiddleEarthCharacter deletedCharacter = manager.getCharacter(deletedName);
				if (deletedName != null) {
					manager.deleteCharacter(deletedCharacter);
				}
				else {
					System.out.println("No Character found with that name");
				}
				break;
				
			case 5:
				System.out.println("Battle Simulation");
				//Characters are only in the Battle Simulation
				MiddleEarthCharacter elf = new Elf("Elfo", 55, 10);
				MiddleEarthCharacter orc = new Orc("BigRed", 550, 10);
				MiddleEarthCharacter human = new Human("Lucy", 559, 10);
				MiddleEarthCharacter dwarf = new Dwarf("Luck", 200, 5);
				MiddleEarthCharacter wizard = new Wizard("Sorcerio", 90, 10);
				
				manager.addCharacter(elf);
				manager.addCharacter(orc);
				manager.addCharacter(human);
				manager.addCharacter(dwarf);
				manager.addCharacter(wizard);
				
				elf.attack(elf);
				orc.attack(orc);
				human.attack(human);
				dwarf.attack(dwarf);
				wizard.attack(wizard);
				elf.attack(orc);
				elf.attack(human);
				elf.attack(dwarf);
				elf.attack(wizard);
				orc.attack(elf);
				orc.attack(human);
				orc.attack(dwarf);
				orc.attack(wizard);
				human.attack(elf);
				human.attack(orc);
				human.attack(dwarf);
				human.attack(wizard);
				wizard.attack(dwarf);
				wizard.attack(human);
				wizard.attack(orc);
				wizard.attack(elf);
				manager.displayAllCharacters();
			
			//exits the applications
			case 6:
				quit = true;
				break;
				
				
			}
		}
		while(!quit);
		//closes scanner once main stops running. Kinda of don't need it but if we did a menu class we would
		scanner.close();

	}
}
