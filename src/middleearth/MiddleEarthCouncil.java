package middleearth;

public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance;
	
	private MiddleEarthCouncil() {
		
	}
	
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}


	public static void setInstance(MiddleEarthCouncil instance) {
		MiddleEarthCouncil.instance = instance;
	}

}
