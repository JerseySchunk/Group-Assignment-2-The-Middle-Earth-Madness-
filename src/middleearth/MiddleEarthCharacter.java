package middleearth;


/**
 * Abstract class that represents a character in MiddleEarth
 * This will define common properties that all characters will have.
 */
public abstract class MiddleEarthCharacter {
	//Protected variables to encourage inheritance to subclasses
	protected String name;
	protected double health;
	protected double power;
	
	/**
	 * Constructor to initialize common fields for subclasses
	 * @param name - The name of the character
	 * @param health - The initial health of the character
	 * @param power - The attack power of the character
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	/**
	 * Abstract method for attacking another character.
	 * Subclasses will implement this method with unique attributes.
	 * @param target - Character being attacked
	 * @return true if the attack was successful, false if it failed.
	 */
	public abstract boolean attack(MiddleEarthCharacter target);
	
	/**
	 * Abstract method to return the race of the character.
	 * Subclasses must implement this.
	 * @return the race of the character as a string.
	 */
	public abstract String getRace();
	
	/**
	 * Displays character information.
	 */
	public void displayInfo() {
		System.out.println("Name: " + name + ", Race: " + getRace() + ", Health" + health + "Power: " + power);
	}
	
	/**
	 * GETS the current health of the character.
	 * @return The current health value.
	 */
	public double getHealth() {
		return health;
	}
	
	
	/**
	 * SETS the health of the character.
	 * @param health - The new health value.
	 */
	public void setHealth(double health) {
		this.health = health;
	}
}
