/**
 *
 * Grass class: Concrete object extends PlantObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 30 to 60
public class Grass extends PlantObject {
	public Grass() {
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
		impact = ran.nextInt(31) + 30;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "GRASS";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	return "Grass Impact: " + getImpact();
	}
}
