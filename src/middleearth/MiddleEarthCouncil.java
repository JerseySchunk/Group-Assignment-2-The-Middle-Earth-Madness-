package middleearth;

public class MiddleEarthCouncil {
	
	/**
	 * Singleton class
	 * Makes sure only one instance of Middle Earth Council can exist
	 */
	private static MiddleEarthCouncil instance;
	
	//
	private CharacterManager characterManager;
	
	// private to prevent making more then one instance of it
	private MiddleEarthCouncil() {
		this.characterManager = new CharacterManager();
		
	}
	/**
	 * If the Instance is not yet created it will make one
	 * @return
	 */
	//checks to see if a instance is already made if not makes a new one
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	

	/**
	 * Provides access to the Characters Managers instance
	 * @return The Character Managers instance
	 */
	public CharacterManager getCharacterManager() {
		return characterManager;
	}


}
