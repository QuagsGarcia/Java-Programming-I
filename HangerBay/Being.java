public class Being { // Declaration of the Being class
    protected String name; // Protected member variable to store the name of the being
    protected String description; // Protected member variable to store the description of the being

    public Being(String name, String description) { // Constructor for initializing name and description
        this.name = name; // Assigning the passed name to the name variable
        this.description = description; // Assigning the passed description to the description variable
    }

    public void displayDescription() { // Method to display the description of the being
        System.out.println(name + ": " + description); // Printing the name and description of the being
    }
}