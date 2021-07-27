/**
 *
 * WaterFactory class: Serves as the concrete factory for water objects
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
public class WaterFactory extends TerraFactory {
	public <Type> TerraObject create(Type type) { // Creates terra object type to then add water type to it
		switch(WaterType.valueOf(type.toString())){ // Uses enum type to check input
		    case POND:
		        return new Pond();
		    case LAKE:
		        return new Lake();
		    case RIVER:
		        return new River();
		    case OCEAN:
		        return new Ocean();
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
		return "CheckInput Class is designed to serve as the concrete factory for water objects";
	}
}
