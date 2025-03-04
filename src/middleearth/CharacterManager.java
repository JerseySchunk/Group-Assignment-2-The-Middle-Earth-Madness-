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
 // Adds character to the array
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
        
        
        

}
