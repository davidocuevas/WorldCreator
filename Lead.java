/**
 *
 * Lead class: Concrete object extends MineralObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact -20 to -30
public class Lead extends MineralObject { 
	public Lead() {
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
		impact = ran.nextInt(11) - 30;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "LEAD";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "Lead Impact: " + getImpact();
	}
}
