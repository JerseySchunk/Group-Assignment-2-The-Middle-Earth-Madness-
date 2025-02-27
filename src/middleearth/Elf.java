package middleearth;

/**
 * The Elf class that represents an Elf character.
 * It extends MiddleEarthCharacter and determines Elf specific traits. 
 */
public class Elf extends MiddleEarthCharacter {
	
	/**
	 * Constructor for creating an elf.
	 * Calls the parent class (MiddleEarthCharacter) constructor to intialize the fields.
	 * @param name - Name of the Elf.
	 * @param health - Initial health of the Elf.
	 * @param power - Attack power of the elf.
	 */
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * Overrides the parent method of attack from MiddleEarthCharacter
	 * Implements the attack behavior of elves
	 * Elves cannot attack their own kin. Elves or Dwarfs.
	 * Elves deal 1.5x damage to Orcs.
	 * Normal damage to other targets. 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		//Checking if the target is an Elf or Dwarf. If so, returns false.
		if(target instanceof Elf || target instanceof Dwarf) {
			System.out.println(name + "'s attack was ineffective! Cannot harm their own kin!");
			return false;
		}
		
		//Increases damage by 1.5 if target is Orc
		double damage = power;
		if(target instanceof Orc) {
			damage = power * 1.5;
		}
		
		//Apply damage to target
		target.setHealth(target.getHealth() - damage);
		System.out.println(name + " attacks " + target.getName() + " dealing " + damage + " damage!");
		return true;
	}
	
	
	/** Getter method for Elf health.
	 * @return The current health of the Elf character
	 */
	public double getHealth() {
		return health;
	}
	
	/**
	 * Setter for the Elf health.
	 * @param health - The new health value.
	 */
	public void setHealth(double health) {
		this.health = health;
	}
	
	/**
	 * Returns the race of the character.
	 * @return "Elf"
	 */
	@Override
	public String getRace() {
		return "Elf";
	}
}
