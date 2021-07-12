/**
 *
 * PlantFactory class: Serves as the concrete factory for plant objects
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
public class PlantFactory extends TerraFactory{

	public <Type> TerraObject create(Type type) { // Creates terra object type to then add plant type to it
		switch(PlantType.valueOf(type.toString())){ // Uses enum type to check input
		    case APPLETREE:
		        return new AppleTree();
		    case GRASS:
		        return new Grass();
		    case FLOWER:
		        return new Flower();
		    case VINES:
		        return new Vines();
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
		return "CheckInput Class is designed to serve as the concrete factory for plant objects";
	}
}
