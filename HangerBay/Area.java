public class Area {
    private String name; // Private string variable to hold the name of the area
    private String description; // Private string variable to hold the description of the area

    // Constructor to initialize the name and description properties
    public Area(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Method to return the name of the area
    public String getName() {
        return name;
    }

    // Method to return the description of the area
    public String getDescription() {
        return description;
    }
}