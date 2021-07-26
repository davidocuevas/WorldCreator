/**
 *
 * Vines class: Concrete object extends PlantObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 10 to 20
public class Vines extends PlantObject {
	public Vines() {
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
		impact = ran.nextInt(11) + 10;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "VINES";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	return "Vines Impact: " + getImpact();
	}
}
