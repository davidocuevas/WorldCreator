/**
 *
 * TerraObject class: Serves as the original abstract factory and as the original interface for all products
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
public abstract class TerraObject {
	protected int impact;	
	protected String type;
	protected String name;
	
	
	abstract void setImpact();
	abstract void setType();
	
	public int getImpact() {
		return impact;
	}
	
	public String getType(){
		return type;
	}

	/**
	 *  Returns class description
	 *  @Override toString()
	 *  @return String
	 */
	public String toString() {
		return "CheckInput Class is designed to serve as the original abstract factory and as " +
				"the original interface for all products";
	}
}
