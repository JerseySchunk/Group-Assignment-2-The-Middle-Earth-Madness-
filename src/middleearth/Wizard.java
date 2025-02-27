package middleearth;

public class Wizard extends MiddleEarthCharacter {
	
	/**
	 * Constructor for creating a Wizard.
	 * Calls the parent class (MiddleEarthCharacter) constructor to intialize the fields.
	 * @param name - Name of the Wizard.
	 * @param health - Initial health of the Wizard.
	 * @param power - Attack power of the Wizard.
	 */
	public Wizard(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * Overrides the parent method of attack from MiddleEarthCharacter
	 * Implements the attack behavior of Wizards
	 * Wizards cannot attack their own kin. Wizards or Humans.
	 * Wizards deal 1.5x damage to Dwarfs.
	 * Normal damage to other targets. 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		//Checking if the target is a Wizard or Human. If so, returns false.
		if(target instanceof Human || target instanceof Wizard) {
			System.out.println(name + "'s attack was ineffective! Cannot harm their own kin!");
			return false;
		}
		
		//Increases damage by 1.5 if target is Dwarf
		double damage = power;
		if(target instanceof Dwarf) {
			damage = power * 1.5;
		}
		
		//Apply damage to target
		target.setHealth(target.getHealth() - damage);
		System.out.println(name + " attacks " + target.getName() + " dealing " + damage + " damage!");
		return true;
	}
	
	
	/** Getter method for Wizard health.
	 * @return The current health of the Wizard character
	 */
	public double getHealth() {
		return health;
	}
	
	/**
	 * Setter for the Wizard health.
	 * @param health - The new health value.
	 */
	public void setHealth(double health) {
		this.health = health;
	}
	
	/**
	 * Returns the race of the character.
	 * @return "Wizard"
	 */
	@Override
	public String getRace() {
		return "Wizard";
	}
}
