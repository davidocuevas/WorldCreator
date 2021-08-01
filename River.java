/**
 *
 * River class: Concrete object extends WaterObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 10 to 60
public class River extends WaterObject { //inherits
	public River() {
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
		impact = ran.nextInt(51) + 10;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "RIVER";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "River Impact: " + getImpact();
	}
}
