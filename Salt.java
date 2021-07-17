/**
 *
 * Salt class: Concrete object extends MineralObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 20 to 40
public class Salt extends MineralObject {
	public Salt() {
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
		impact = ran.nextInt(21) + 20;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "SALT";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "Salt Impact: " + getImpact();
	}
}
