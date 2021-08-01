/**
 *
 * MineralObject class: Serves as an interface for all mineral products
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
public abstract class MineralObject extends TerraObject{ //implements
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	/**
	 *  Returns class description
	 *  @Override toString()
	 *  @return String
	 */
	public String toString() {
		return "CheckInput Class is designed to serve as an interface for all mineral products";
	}
}
