package middleearth;

public class CharacterManager {
    private MiddleEarthCharacter[] characters; // Array 
    private int size; 
    private int capacity; // Tracks size of array

    //initializes the array at size 9
    public CharacterManager() {
        this.capacity = 9;  // Default capacity
        this.characters = new MiddleEarthCharacter[capacity]; // Create the array
        this.size = 0; // No characters initially

    }
 // Adds character to array
    public boolean addCharacter(MiddleEarthCharacter c) {
        if (size == capacity) {  // checks size against capacity 
            capacity = capacity * 2;  // Double the capacity
            MiddleEarthCharacter[] newCharacters = new MiddleEarthCharacter[capacity];  // Create a new larger array
            for (int i = 0; i < size; i++) {
                newCharacters[i] = characters[i];  // Copy characters to new array
            }
            characters = newCharacters;  // Makes old array point to new array
        }
        characters[size] = c;  // Add new character
        size++;  // Increase size
        return true;
    }
 // Get a character
    public MiddleEarthCharacter getCharacter(String name) {
        for (int i = 0; i < size; i++) {
            if (characters[i].getName().equals(name)) {
                return characters[i];  // Return the character
            }
        }
        return null;  // Return null
    }
 // Removes a character from the array
    public boolean deleteCharacter(MiddleEarthCharacter character) {
        for (int i = 0; i < size; i++) {
            if (characters[i] == character) {  // Find the character
                for (int j = i; j < size - 1; j++) {
                    characters[j] = characters[j + 1];  // Shift elements to the left
                }
                characters[size - 1] = null;  // Set final element to null
                size--;  // Decrease size
                return true;  // True
            }
        }
        return false;  // Return false
    }
    
    // Updates a character's stats
    public boolean updateCharacter(MiddleEarthCharacter character, String name, double health, double power) {
        for (int i = 0; i < size; i++) {
            if (characters[i] == character) {  // If the character is found
                characters[i].setName(name);  // Update name
                characters[i].setHealth(health);  // Update health
                characters[i].setPower(power);  // Update power
                return true;  // Success
            }
        }
        return false;  // Return false if not found
        
    }

    // Displays all characters in the array
    public void displayAllCharacters() {
        for (int i = 0; i < size; i++) {
            characters[i].displayInfo(); 
        }
    }

}
