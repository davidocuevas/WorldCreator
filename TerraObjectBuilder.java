/**
 *
 * TerraObjectBuilder class: Calls on the specific type of factory to construct a specific
 * type of object as requested by the user
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
public class TerraObjectBuilder {

	public static <Type> TerraFactory getFactory(Type type) { // Creates terra object type
		switch(TerraType.valueOf(type.toString())){
	    case PLANT:
	        return new PlantFactory();
	    case ANIMAL:
	        return new AnimalFactory();
	    case WATER:
	        return new WaterFactory();
	    case MINERAL:
	        return new MineralFactory();
	    default:
	       return null;
	}
	}

	/**
	 *  Returns class description
	 *  @Override toString()
	 *  @return String
	 */
	public String toString() {
		return "CheckInput Class is designed to call on the specific type of factory to construct a specific" +
				" * type of object as requested by the user";
	}
}
