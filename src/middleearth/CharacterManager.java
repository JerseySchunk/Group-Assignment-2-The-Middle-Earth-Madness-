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

}
