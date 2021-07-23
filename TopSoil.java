/**
 *
 * TopSoil class: Concrete object extends MineralObject
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

//impact 40 to 60
public class TopSoil extends MineralObject {
	public TopSoil() {
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
		impact = ran.nextInt(21) + 40;
	}

	/**
	 * Obtains the String type
	 * @return type
	 */
	public void setType() {
		type = "TOPSOIL";
	}

	/**
	 *  Returns the concrete object's impact
	 *  @Override toString()
	 *  @return String + Integer
	 */
	public String toString() {
	    return "TopSoil Impact: " + getImpact();
	}
}
