/**
 *
 * Pond class: Concrete object extends WaterObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 5 to 10
public class Pond extends WaterObject {
	public Pond() {
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
		impact = ran.nextInt(6) + 5;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "POND";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "Pond Impact: " + getImpact();
	}
}
