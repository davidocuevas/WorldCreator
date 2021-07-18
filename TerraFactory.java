/**
 *
 * TerraFactory class: Serves as the concrete factory for terra objects
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
public abstract class TerraFactory {
	public abstract <Type> TerraObject create(Type type); // Creates terra object type

	/**
	 *  Returns class description
	 *  @Override toString()
	 *  @return String
	 */
	public String toString() {
		return "CheckInput Class is designed to serve as the concrete factory for terra objects";
	}
}
