package middleearth;

public class MiddleEarthCouncil {
	
	//The Singleton
	private static MiddleEarthCouncil instance;
	
	//
	private CharacterManager characterManager;
	
	// private to prevent making more then one instance of it
	private MiddleEarthCouncil() {
		this.characterManager = new CharacterManager();
		
	}
	
	//checks to see if a instance is already made if not makes a new one
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}

	//allows access to CharacterManager
	public CharacterManager getCharcterManager() {
		return characterManager;
	}


}
