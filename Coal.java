/**
 *
 * Coal class: Concrete object extends MineralObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact -50 to -80
public class Coal extends MineralObject {
	public Coal() {
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
		impact = ran.nextInt(31) - 81;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "COAL";
	}


	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
		return "Coal Impact: " + getImpact();
	}
}
