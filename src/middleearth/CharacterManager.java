package middleearth;

public class CharacterManager {
    private MiddleEarthCharacter[] characters; // Array 
    private int size; 
    private int capacity; // Tracks size of array
/**
 * Creates an MiddleEarthCharacter
 * sets starter value of array
 * 
 */
    //initializes the array at size 9
    public CharacterManager() {
        this.capacity = 9;  // Default capacity
        this.characters = new MiddleEarthCharacter[capacity]; // Create the array
        this.size = 0; // No characters initially

        

    }
 // Adds character to array
    
    /**
     * adds a new character to the array of character
     * Doubles the capacity if the array is full
     * 
     * @param c "this is the character being added"
     * @return this return shows true when a character is added
     */
    public boolean addCharacter(MiddleEarthCharacter c) {
        if (size == capacity) {  // checks size against capacity 
            capacity = capacity * 2;  // Double the capacity
            MiddleEarthCharacter[] newCharacters = new MiddleEarthCharacter[capacity];  // Create a new larger array when full
            for (int i = 0; i < size; i++) {
                newCharacters[i] = characters[i];  // Copy characters to new array
            }
            characters = newCharacters;  // Makes old array point to new array
        }
        characters[size] = c;  // Add new character
        size++;  // Increase size
        return true;
    }

    
    /**
     * this finds a character then deletes a character and then resizes the array to avoid an error.
     * 
     * @param character this is the character to be removed from the array
     * @return this is to show if it has deleted a character or not
     */
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
    // Get a character
    
    /**
     * 
     * 
     * @param name finds the name of the character to be got
     * @return either returns the character or null if there is no character under name
     */
    public MiddleEarthCharacter getCharacter(String name) {
        for (int i = 0; i < size; i++) {
            if (characters[i].getName().equals(name)) {
                return characters[i];  // Return the character
            }
           
        }
        return null;  // Return null
    }
    
    // Updates a character's stats
    
    /**
     * updates a characters health power and name
     *
     * @param character
     * @param name-this is the name of the character to be updated
     * @param health-this is the health value to be updated
     * @param power-this is the power value to be updated
     * @return this signals if the update character worked or not
     */
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
    /**
     * displays all characters in the character array
     */
    public void displayAllCharacters() {
        for (int i = 0; i < size; i++) {
            characters[i].displayInfo(); 
        }
    }

}
