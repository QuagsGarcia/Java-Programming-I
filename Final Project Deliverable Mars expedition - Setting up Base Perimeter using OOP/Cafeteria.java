import java.util.Scanner; // Importing the Scanner class from java.util package
public class Cafeteria extends Pod { // Defining a class named Cafeteria that extends Pod class
    static Main main = new Main(); // Creating an instance of the Main class
    private int capacity; // Declaring a private integer variable named capacity
    public String entryCode; // Declaring a public String variable named entryCode
    public int constructionDuration; // Declaring a public integer variable named constructionDuration
    public String color; // Declaring a public String variable named color
    public Cafeteria(String name, String entryCode, String color, int constructionDuration, int capacity) { // Constructor with parameters to initialize instance variables
        super(name, entryCode, color, constructionDuration); // Invoking the constructor of the superclass with specified parameters
        this.capacity = capacity; // Assigning the value of capacity parameter to the instance variable
        this.entryCode = entryCode; // Assigning the value of entryCode parameter to the instance variable
        this.color = color; // Assigning the value of color parameter to the instance variable
        this.constructionDuration = constructionDuration; // Assigning the value of constructionDuration parameter to the instance variable
    }
    public String getRoomColor() { // Method to get the color of the room
        return color; // Returning the value of color
    }
    public int getConstructionDuration() { // Method to get the construction duration of the cafeteria
        return constructionDuration; // Returning the value of constructionDuration
    }
    public String getEntryCode() { // Method to get the entry code of the cafeteria
        return entryCode; // Returning the value of entryCode
    }
    public void exploreCafeteria(Scanner scanner) { // Method to explore the cafeteria
        System.out.println("Welcome to the Cafeteria! What would you like to do?"); // Displaying welcome message and options
        System.out.println("1. Order food");
        System.out.println("2. Sit and eat");
        System.out.println("3. Check available seats");
        System.out.println("4. Exit Cafeteria");
        System.out.print("Enter your choice: "); // Prompting user to enter their choice

        int choice = scanner.nextInt(); // Reading user's choice

        switch (choice) { // Switch statement to handle user's choice
            case 1:
                orderFood(scanner); // Calling method to order food
                break;
            case 2:
                sitAndEat(scanner); // Calling method to sit and eat
                break;
            case 3:
                checkAvailableSeats(scanner); // Calling method to check available seats
                break;
            case 4:
                System.out.println("Exiting Cafeteria."); // Displaying exit message
                break;
            default:
                System.out.println("Invalid choice."); // Displaying message for invalid choice
                exploreCafeteria(scanner); // Recursive call to exploreCafeteria method to prompt user again
        }
    }

    private void orderFood(Scanner scanner) { // Method to order food
        System.out.println("You order food from the cafeteria."); // Displaying message
        double decimalValue = (double) 10 / 60; // Calculating time in decimal hours for food ordering
        Main.passTime(decimalValue); // Calling passTime method with the time taken for food ordering
        exploreCafeteria(scanner); // Recursive call to exploreCafeteria method
    }

    private void sitAndEat(Scanner scanner) { // Method to sit and eat
        System.out.println("You find a seat and enjoy your meal."); // Displaying message
        double decimalValue = (double) 30 / 60; // Calculating time in decimal hours for eating
        Main.passTime(decimalValue); // Calling passTime method with the time taken for eating
        exploreCafeteria(scanner); // Recursive call to exploreCafeteria method
    }

    private void checkAvailableSeats(Scanner scanner) { // Method to check available seats
        System.out.println("There are " + capacity + " seats available in the cafeteria."); // Displaying number of available seats
        exploreCafeteria(scanner); // Recursive call to exploreCafeteria method
    }
}