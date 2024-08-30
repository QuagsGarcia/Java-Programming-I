public class Lifeform { // Class called Lifeform
    private String description; // Private string variable to hold a description

    // Constructor to initialize the description property
    public Lifeform(String description) {
        this.description = description;
    }

    // Method to display the description on the screen, using Lifeform Description: to distinquish the Lifeform or Spaceship descriptions
    public void displayDescription() {
        System.out.println("Lifeform Description: " + description);
    }
}