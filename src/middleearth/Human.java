package middleearth;

public class Human extends MiddleEarthCharacter {
	
	/**
	 * Constructor for creating a Human.
	 * Calls the parent class (MiddleEarthCharacter) constructor to intialize the fields.
	 * @param name - Name of the Human.
	 * @param health - Initial health of the Human.
	 * @param power - Attack power of the Human.
	 */
	public Human(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * Overrides the parent method of attack from MiddleEarthCharacter
	 * Implements the attack behavior of Humans
	 * Humans cannot attack their own kin. Orcs or Humans.
	 * Humans deal 1.5x damage to Wizards.
	 * Normal damage to other targets. 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		//Checking if the target is a Human or Orc. If so, returns false.
		if(target instanceof Orc || target instanceof Human) {
			System.out.println(name + "'s attack was ineffective! Cannot harm their own kin!");
			return false;
		}
		
		//Increases damage by 1.5 if target is Wizard
		double damage = power;
		if(target instanceof Wizard) {
			damage = power * 1.5;
		}
		
		//Apply damage to target
		target.setHealth(target.getHealth() - damage);
		System.out.println(name + " attacks " + target.getName() + " dealing " + damage + " damage!");
		return true;
	}
	
	
	/** Getter method for Human health.
	 * @return The current health of the Human character
	 */
	public double getHealth() {
		return health;
	}
	
	/**
	 * Setter for the Human health.
	 * @param health - The new health value.
	 */
	public void setHealth(double health) {
		this.health = health;
	}
	
	/**
	 * Returns the race of the character.
	 * @return "Human"
	 */
	@Override
	public String getRace() {
		return "Human";
	}
}
