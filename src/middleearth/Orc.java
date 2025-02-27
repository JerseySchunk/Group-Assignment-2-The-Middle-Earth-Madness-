package middleearth;

public class Orc extends MiddleEarthCharacter {
	
	/**
	 * Constructor for creating a Orc.
	 * Calls the parent class (MiddleEarthCharacter) constructor to intialize the fields.
	 * @param name - Name of the Orc.
	 * @param health - Initial health of the Orc.
	 * @param power - Attack power of the Orc.
	 */
	public Orc(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * Overrides the parent method of attack from MiddleEarthCharacter
	 * Implements the attack behavior of Orcs
	 * Orcs cannot attack their own kin. Elf or Orc.
	 * Orcs deal 1.5x damage to Humans.
	 * Normal damage to other targets. 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		//Checking if the target is an Elf or Orc. If so, returns false.
		if(target instanceof Elf || target instanceof Orc) {
			System.out.println(name + "'s attack was ineffective! Cannot harm their own kin!");
			return false;
		}
		
		//Increases damage by 1.5 if target is Human
		double damage = power;
		if(target instanceof Human) {
			damage = power * 1.5;
		}
		
		//Apply damage to target
		target.setHealth(target.getHealth() - damage);
		System.out.println(name + " attacks " + target.getName() + " dealing " + damage + " damage!");
		return true;
	}
	
	
	/** Getter method for Orc health.
	 * @return The current health of the Orc character
	 */
	public double getHealth() {
		return health;
	}
	
	/**
	 * Setter for the Orc health.
	 * @param health - The new health value.
	 */
	public void setHealth(double health) {
		this.health = health;
	}
	
	/**
	 * Returns the race of the character.
	 * @return "Orc"
	 */
	@Override
	public String getRace() {
		return "Orc";
	}
}
