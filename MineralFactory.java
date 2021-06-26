/**
 *
 * MineralFactory class: Serves as the concrete factory for Mineral objects
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
public class MineralFactory extends TerraFactory {

	public <Type> TerraObject create(Type type) { // Creates terra object type to then add mineral type to it
		switch(MineralType.valueOf(type.toString())){ // Uses enum type to check input
		    case COAL:
		        return new Coal();
		    case LEAD:
		        return new Lead();
		    case SALT:
		        return new Salt();
		    case TOPSOIL:
		        return new TopSoil();
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
		return "CheckInput Class is designed to serve as the concrete factory for Mineral objects";
	}
}
