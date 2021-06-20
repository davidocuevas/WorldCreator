/**
 *
 * Cow class: Concrete object extends AnimalObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact -100 to -150
public class Cow extends AnimalObject{
	public Cow() {
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
		impact = ran.nextInt(51) - 150;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "COW";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "Cow Impact: " + getImpact();
	}
}
