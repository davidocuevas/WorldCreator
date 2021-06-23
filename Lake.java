/**
 *
 * Lake class: Concrete object extends WaterObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 40 to 50
public class Lake extends WaterObject{
	public Lake() {
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
		impact = ran.nextInt(11) + 40;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "LAKE";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
		return "Lake Impact: " + getImpact();
	}
}
