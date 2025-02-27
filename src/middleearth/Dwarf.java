package middleearth;

public class Dwarf extends MiddleEarthCharacter {
	
	/**
	 * Constructor for creating a Dwarf.
	 * Calls the parent class (MiddleEarthCharacter) constructor to intialize the fields.
	 * @param name - Name of the Dwarf.
	 * @param health - Initial health of the Dwarf.
	 * @param power - Attack power of the Dwarf.
	 */
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * Overrides the parent method of attack from MiddleEarthCharacter
	 * Implements the attack behavior of Dwarfs
	 * Dwarfs cannot attack their own kin. Wizards or Dwarfs.
	 * Dwarfs deal 1.5x damage to Elves.
	 * Normal damage to other targets. 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		//Checking if the target is an Elf or Dwarf. If so, returns false.
		if(target instanceof Wizard || target instanceof Dwarf) {
			System.out.println(name + "'s attack was ineffective! Cannot harm their own kin!");
			return false;
		}
		
		//Increases damage by 1.5 if target is Elf
		double damage = power;
		if(target instanceof Elf) {
			damage = power * 1.5;
		}
		
		//Apply damage to target
		target.setHealth(target.getHealth() - damage);
		System.out.println(name + " attacks " + target.getName() + " dealing " + damage + " damage!");
		return true;
	}
	
	
	/** Getter method for Dwarf health.
	 * @return The current health of the Dwarf character
	 */
	public double getHealth() {
		return health;
	}
	
	/**
	 * Setter for the Dwarf health.
	 * @param health - The new health value.
	 */
	public void setHealth(double health) {
		this.health = health;
	}
	
	/**
	 * Returns the race of the character.
	 * @return "Dwarf"
	 */
	@Override
	public String getRace() {
		return "Dwarf";
	}
}

