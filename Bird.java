/**
 *
 * Bird class: Concrete object extends AnimalObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact -10 to -20
public class Bird extends AnimalObject {
	public Bird() {
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
		impact = ran.nextInt(11) - 20;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "BIRD";
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
