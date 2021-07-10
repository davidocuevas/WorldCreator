/**
 *
 * Ocean class: Concrete object extends WaterObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 50 to 100
public class Ocean extends WaterObject {
	public Ocean() {
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
		impact = ran.nextInt(51) + 50;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "OCEAN";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "Ocean Impact: " + getImpact();
	}
}
