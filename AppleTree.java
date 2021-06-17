/**
 *
 * AppleTree class: Concrete object extends PlantObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 20 to 30
public class AppleTree extends PlantObject {
	public AppleTree() {
		setImpact();
		setType();
	}

	/**
	 * Obtains the random Impact value previously set
	 * @Override setImpact
	 * @return int Impact
	 */
	public void setImpact() {
		Random ran = new Random(); //Creates a random object
		impact = ran.nextInt(11) + 20;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "APPLETREE";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "Appletree Impact: " + getImpact();
	}
}
