package middleearth;


//The Elf class which inherits from MiddleEarthCharacter
public class Elf extends MiddleEarthCharacter {
	
	//Constructor for creating an elf.
	//Will call the parent class (MiddleEarthCharacter) constructor to initialize the fields. 
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}
	
	//Overriding the parent method of attack.
	//This implements the attack behavior of the Elf race.
	//They cannot attack other Elves or Dwarfs
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		//Checking if the target is an Elf or Dwarf. If so, returns false.
		if(target instanceof Elf || target instanceof Dwarf) {
			System.out.println(name + "'s attack was ineffective! Cannot harm their own kin!");
			return false;
		}
	}

}
