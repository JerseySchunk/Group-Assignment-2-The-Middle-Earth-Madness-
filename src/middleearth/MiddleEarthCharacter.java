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
}
