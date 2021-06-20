/**
 *
 * Flower class: Concrete object extends PlantObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 5 to 15
public class Flower extends PlantObject {
	public Flower() {
		setImpact();
		setType();
	}

	/**
	 * Obtains the random Impact value previously set
	 * @Override setImpact()
	 * @return int Impact
	 */
	public void setImpact() {
		Random ran = new Random(); //Creates a random object
		impact = ran.nextInt(11) + 5;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "FLOWER";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	  return "Flower Impact: " + getImpact();
	}
}
