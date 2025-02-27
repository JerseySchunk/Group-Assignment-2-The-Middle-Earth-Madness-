package middleearth;



public abstract class MiddleEarthCharacter {
	//Protected variables to encourage inheritance to subclasses
	protected String name;
	protected double health;
	protected double power;
	
	//Constructor to initialize common fields for the subclasses
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	//Abstract Methods that must be implemented by subclasses
	
	//attack takes a different MiddleEarthCharacter (Character being attacked)
	//Returns true if the attack was successful and false if it failed. 
	public abstract boolean attack(MiddleEarthCharacter target);
	
	//Method to be implemented that returns a character's race
	public abstract String getRace();
	
	//Concrete Method: This will print character details
	public void displayInfo() {
		System.out.println("Name: " + name + ", Race: " + getRace() + ", Health" + health + "Power: " + power);
	}
	
	public double getHealth() {
		return health;
	}
	
	
	
	public void setHealth(double health) {
		this.health = health;
	}
}
