/**
 *
 * Planet class: Serves as the client class that takes orders from the user and calls upon the factories to create
 * the object that the user has requested
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 *
 */
import java.util.*;

public class Planet {
	private int[] percentages = {0,0,0,0};
	private int[] amountOfObj = {0,0,0,0};
	private String name;
	private int totalObj = 0;
	private int totalImpact = 0;
	
	public Random ran = new Random();
	
	private ArrayList<TerraObject> waterObj = new ArrayList<TerraObject>();
	private ArrayList<TerraObject> plantObj = new ArrayList<TerraObject>();
	private ArrayList<TerraObject> mineralObj = new ArrayList<TerraObject>();
	private ArrayList<TerraObject> animalObj = new ArrayList<TerraObject>();
	
	private int[] waterNum = {0,0,0,0};
	private int[] plantNum = {0,0,0,0};
	private int[] mineralNum = {0,0,0,0};
	private int[] animalNum = {0,0,0,0};
	
	
	private TerraFactory waterFac = TerraObjectBuilder.getFactory(TerraType.WATER);
	private TerraFactory plantFac = TerraObjectBuilder.getFactory(TerraType.PLANT);
	private TerraFactory mineralFac = TerraObjectBuilder.getFactory(TerraType.MINERAL);
	private TerraFactory animalFac = TerraObjectBuilder.getFactory(TerraType.ANIMAL);

	/**
	 * Sets the size, percentage and name of the planet for the user
	 * @param planetSize size of the planet
	 * @param percentages percentage
	 * @param name Name of the planet
	 */
	public Planet(int planetSize, int[] percentages, String name) { // Constructor
		totalObj = calcPlanetTerraObjects(planetSize);
		this.percentages = percentages;
		this.name = name;

		for (int i = 0; i < 4; i++) {
			amountOfObj[i] = (int) ((double)percentages[i] / 100 * totalObj);
		}
		
		calcObjectAmounts(amountOfObj[0], waterNum);
		calcObjectAmounts(amountOfObj[1], plantNum);
		calcObjectAmounts(amountOfObj[2], mineralNum);
		calcObjectAmounts(amountOfObj[3], animalNum);
		
		waterObj = addWaterObjects(waterObj, waterFac);
		plantObj = addPlantObjects(plantObj, plantFac);
		mineralObj = addMineralObjects(mineralObj, mineralFac);
		animalObj = addAnimalObjects(animalObj, animalFac);
		
		for (int i = 0; i < 4; i++) {
			totalImpact += waterObj.get(i).getImpact();
			totalImpact += plantObj.get(i).getImpact();
			totalImpact += animalObj.get(i).getImpact();
			totalImpact += mineralObj.get(i).getImpact();
		}
		
	}

	/**
	 * Gets the total impact from the planet objects chosen by the user
	 * @return int
	 */
	public int getTotalImpact() {
		return totalImpact;
	}

	/**
	 * Gets the objects created by the user
	 * @return int
	 */
	public int getTotalObj() {
		return totalObj;
	}

	/**
	 * Calculates the amount of objects per the planet size
	 * @param planetSize Size of planet
	 * @return int
	 */
	private int calcPlanetTerraObjects(int planetSize) {
		switch(planetSize) {
		case 1:
			return 10 + ran.nextInt(10);
		case 2:
			return 21 + ran.nextInt(20);
		case 3:
			return 1001 + ran.nextInt(500);
		case 4:
			return 1501 + ran.nextInt(1000);
		default:
			return 0;
		}
	}

	/**
	 * Calculates the object amounts for the objects chosen by the user
	 * @param amountOfObj The amount of objects
	 * @param objType The types of objects
	 */
	private void calcObjectAmounts(int amountOfObj, int[] objType) {
		while (amountOfObj > 0) {
			for (int i = 0; i < 3; i++) {
				objType[i] = ran.nextInt(amountOfObj) + 1;
				amountOfObj -= objType[i];
			}
			objType[3] = amountOfObj;
			amountOfObj = 0;
		}
	}

	/**
	 * Creates an arraylist of TerraObjects
	 * @param objects Arraylist
	 * @param fac Object
	 * @return Object type
	 */
	private ArrayList<TerraObject> addWaterObjects(ArrayList<TerraObject> objects, TerraFactory fac) {
		objects.add(fac.create(WaterType.POND));
		objects.add(fac.create(WaterType.LAKE));
		objects.add(fac.create(WaterType.RIVER));
		objects.add(fac.create(WaterType.OCEAN));
		return objects;
	}

	/**
	 * @param objects Arraylist
	 * @param fac Object
	 * @return Object type
	 */
	private ArrayList<TerraObject> addPlantObjects(ArrayList<TerraObject> objects, TerraFactory fac) {
		objects.add(fac.create(PlantType.APPLETREE));
		objects.add(fac.create(PlantType.FLOWER));
		objects.add(fac.create(PlantType.GRASS));
		objects.add(fac.create(PlantType.VINES));
		return objects;
	}

	/**
	 * @param objects Arraylist
	 * @param fac Object
	 * @return Object type
	 */
	private ArrayList<TerraObject> addMineralObjects(ArrayList<TerraObject> objects, TerraFactory fac) {
		objects.add(fac.create(MineralType.COAL));
		objects.add(fac.create(MineralType.LEAD));
		objects.add(fac.create(MineralType.SALT));
		objects.add(fac.create(MineralType.TOPSOIL));
		return objects;
	}

	/**
	 * @param objects Arraylist
	 * @param fac Object
	 * @return Object type
	 */
	private ArrayList<TerraObject> addAnimalObjects(ArrayList<TerraObject> objects, TerraFactory fac) {
		objects.add(fac.create(AnimalType.BIRD));
		objects.add(fac.create(AnimalType.BEAR));
		objects.add(fac.create(AnimalType.INSECT));
		objects.add(fac.create(AnimalType.COW));
		return objects;
	}

	/**
	 * Meant to return and output all of the water objects created
	 * @return String
	 */
	public String listWaterObjects() {
		String s = "";
		for (int i = 0; i < waterObj.size(); i++) {
			s += "\t" + waterObj.get(i).toString() + "\tNumber of " + waterObj.get(i).getType() + ": " + waterNum[i] + "\n";
		}
		
		return s;
	}

	/**
	 * Meant to return and output all of the plant objects created
	 * @return String
	 */
	public String listPlantObjects() {
		String s = "";
		for (int i = 0; i < waterObj.size(); i++) {
			s += "\t" + plantObj.get(i).toString() + "\tNumber of " + plantObj.get(i).getType() + ": " + plantNum[i] + "\n";
		}
		
		return s;
	}

	/**
	 * Meant to return and output all of the animal objects created
	 * @return String
	 */
	public String listAnimalObjects() {
		String s = "";
		for (int i = 0; i < waterObj.size(); i++) {
			s += "\t" + animalObj.get(i).toString() + "\tNumber of " + animalObj.get(i).getType() + ": " + animalNum[i] + "\n";
		}
		
		return s;
	}

	/**
	 * Meant to return and output all of the mineral objects created
	 * @return String
	 */
	public String listMineralObjects() {
		String s = "";
		for (int i = 0; i < waterObj.size(); i++) {
			s += "\t" + mineralObj.get(i).toString() + "\tNumber of " + mineralObj.get(i).getType() + ": " + mineralNum[i] + "\n";
		}
		
		return s;
	}

	/**
	 *  Returns class description
	 *  @Override toString()
	 *  @return String
	 */
	public String toString() {
		return "CheckInput Class is designed to serve as the client class that takes orders from the user and calls " +
				"upon the factories to create the object that the user has requested";
	}
}
