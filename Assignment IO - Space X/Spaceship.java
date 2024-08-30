public class Spaceship { // Class called Spaceship
    private String description; // Private string variable to hold a description

    // Constructor to initialize the description property
    public Spaceship(String description) {
        this.description = description;
    }

    // Method to display the description on the screen, using Spaceship Description: to distinquish the Lifeform or Spaceship descriptions
    public void displayDescription() {
        System.out.println("Spaceship Description: " + description);
    }
}