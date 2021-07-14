/**
 *
 * Driver class: Main
 * @author Rainier Getuaban, David Cuevas, Ernesto Diaz, Josh Reyes
 * Designed to test out the project, in the future a driver class should be created.
 */
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean quit = false;
    boolean menu = false;
    boolean planetmenu = false;

    String planetName = null;

    int planetSize = 0;
    String[] planetSizes = {"Small", "Medium", "Large", "ExtraLarge"};

    // water, plant, animal, mineral
    int[] percentages = {0,0,0,0};
    String[] text = {"Water", "Plant", "Animal", "Mineral"};

    Scanner sc = new Scanner(System.in);

    System.out.println("------------------------------------------------");
    System.out.println("WELCOME TO OUR ULTIMATE PLANET TERRAFORM PROGRAM");
    System.out.println("------------------------------------------------");
    System.out.println("Did Earth get boring? Create your own world just \n the way you like it!");
    System.out.println("------------------------------------------------");
    while (!quit) {
    	while (!menu) {

		    System.out.print("Enter the name of your new planet: ");
		    planetName = sc.nextLine();
		    
		    planetSize = getPlanetSize();
		    
		    int percent = 100;

			System.out.println("\n--------------------------------------------------------------");
		    System.out.println("How do you want to distribute the categories (use percentage):");
        // used for loop to store the percent in an easier way using an array
        // initialized array on line 14
        // line 15 stores the name of the the terraObjects, so you can pass those when creating the terraObjects
		    for (int i = 0; i < 4; i ++) {
				System.out.println("--------------------------------------------------------------");
		    	System.out.print("Percentage remaining: " + percent +
		    			"\n\tEnter " + text[i] + " Percentage: ");
			    percentages[i] = CheckInput.getIntRange(0,percent);
          // create each terra object here
			    percent = percent - percentages[i];
		    }

			System.out.println("--------------------------------------------------------------");
		    System.out.println("YOU CHOSE THE FOLLOWING:\n"
		    		+ "Planet Name: " + planetName
		    		+ "\nPlanet Size: " + planetSizes[planetSize -1]
		    		+ "\nterraObject distribution:\n"
		    		+ "	water: " + percentages[0] + "%"
		    		+ "	plant: " + percentages[1] + "%"
		    		+ "	mineral: " + percentages[2] + "%"
		    		+ "	animal: " + percentages[3] + "%");
			System.out.println("----------------------------------------------------------------------");
		    System.out.println("Enter (yes) to continue with these choices and (no) to return to the menu.");
			System.out.print(": ");
		    menu = CheckInput.getYesNo();
    	}
    	
    	Planet planet = new Planet(planetSize, percentages, planetName);
    	
    	int terraObjects = planet.getTotalObj(); // replace with getTerraObjects method or something
    	int impactScore = planet.getTotalImpact(); // replace with getTerraObjects method or something
    	while (!planetmenu){
    		System.out.println("Planet Name: " + planetName + ", TerraObjects: " + terraObjects + ", Impact Score: " + impactScore);
    		
            int option = terraformingMenu();
    		if (option == 1) {
    			System.out.println(planet.listWaterObjects());
    		} else if (option == 2) {
    			System.out.println(planet.listPlantObjects());
    		} else if (option == 3) {
    			System.out.println(planet.listMineralObjects());
    		} else if (option == 4) {
    			System.out.println(planet.listAnimalObjects());
    		} else {
          //quits terraforming menu
    			planetmenu = true;
    		}
        }
		System.out.println("\n-------------------------------------");
    	System.out.println("Would you like to create a new world?"
    			+ "\n\t(Y)es to create new world"
    			+ "\n\t(N)o to exit program");
		System.out.println("-------------------------------------");
		System.out.print(":");
		quit = !CheckInput.getYesNo();
		menu = quit;
		planetmenu = quit;
    }
  }

	/**
	 *  Displays planet sizes available
	 *  @return int
	 */
  public static int getPlanetSize(){
    int planetSize = 0;
    System.out.println("\n-------------------------------");
    System.out.println("What size planet do you want?" +
    	"\n1) small" + 
    	"\n2) medium" + 
    	"\n3) large" +
        "\n4) extra large");
	  System.out.println("-------------------------------");
	  System.out.print(":");
    planetSize = CheckInput.getIntRange(1,4);
    return planetSize;
  }


	/**
	 *  Serves as the option choices for menu
	 *  @return int
	 */
  public static int terraformingMenu(){
	    int option = 0;
	    System.out.println("\n-------------------------");
	    System.out.println("1) List all water objects" + 
	    	"\n2) List all plant objects" + 
	    	"\n3) List all mineral objects" +
	    	"\n4) List all animal objects" +
	    	"\n5) Exit Menu");
	    System.out.println("-------------------------");
	    System.out.print(":");
	    option = CheckInput.getIntRange(1,5);
	    return option;
	}
  
}
