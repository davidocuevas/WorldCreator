/**
 *
 * Bear class: Concrete object extends AnimalObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

// impact -60 to -100
public class Bear extends AnimalObject {
	public Bear() {
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
		impact = ran.nextInt(41) -100;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "BEAR";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "Bear Impact: " + getImpact();
	}
}
