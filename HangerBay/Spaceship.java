public class Spaceship {
    private String description; // Private string variable to hold a description

    // Constructor to initialize the description property
    public Spaceship(String description) {
        this.description = description;
    }

    // Method to display the description on the screen
    public void displayDescription() {
        System.out.println("Spaceship Description: " + description);
    }
}