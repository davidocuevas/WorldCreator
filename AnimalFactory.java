/**
 *
 * AnimalFactory class: Serves as the concrete factory for animal objects
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
public class AnimalFactory extends TerraFactory {

	public <Type> TerraObject create(Type type) { // Creates terra object type to then add animal type to it
		switch(AnimalType.valueOf(type.toString())){ // Uses enum type to check input
		    case BIRD:
		        return new Bird();
		    case BEAR:
		        return new Bear();
		    case INSECT:
		        return new Insect();
		    case COW:
		        return new Cow();
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
		return "CheckInput Class is designed to serve as the concrete factory for animal objects";
	}
}
