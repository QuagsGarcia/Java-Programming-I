import java.util.Scanner; // Importing the Scanner class from java.util package to allow user input

public class Starbase13Description { // Declaring a class named Starbase13Description
    public static void main(String[] args) { // Declaring the main method
        // Displaying computer greeting
        System.out.println("I am HAL, what is your name?");

        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter their name
        System.out.print("Enter your name: ");

        // Reading user input for name
        String userName = scanner.nextLine(); // Storing the user's input name into the variable userName

        // Displaying welcome message with user's name
        System.out.println("Hi " + userName + ", welcome to Starbase 13.");
        
        // Displaying description of Starbase 13 as seen from a shuttle
        System.out.println("As you approach Starbase 13 in your shuttle, you are greeted by a magnificent sight.");
        System.out.println("The space station looms large, its metallic structure glinting in the sunlight.");
        System.out.println("You can see sleek spacecraft docking and departing, bustling with activity.");
        System.out.println("Clusters of lights adorn the exterior, indicating various facilities and living quarters.");
        System.out.println("Overall, Starbase 13 emanates a sense of advanced technology and exploration.");

        // Additional content for enhanced user experience
        System.out.println("You hear the faint hum of thrusters as ships navigate around the station.");
        System.out.println("A holographic display nearby shows real-time space traffic and upcoming events.");
        System.out.println("The station's AI announces upcoming arrivals and departures, ensuring smooth operations.");

        // Asking user a couple of questions
        System.out.println("\n" + userName + ", do you wish to explore the station further? (Yes/No)");
        String exploreChoice = scanner.nextLine(); // Storing the user's choice whether to explore further

        if (exploreChoice.equalsIgnoreCase("Yes")) { // Checking if the user wants to explore further
            System.out.println("Great! There are many areas to explore within the station. Enjoy your adventure!");
        } else {
            System.out.println("That's alright, " + userName + ". If you change your mind, feel free to explore anytime!");
        }

        System.out.println("\n" + userName + ", would you like to learn more about Starbase 13's history? (Yes/No)");
        String learnHistoryChoice = scanner.nextLine(); // Storing the user's choice whether to learn about history

        if (learnHistoryChoice.equalsIgnoreCase("Yes")) { // Checking if the user wants to learn about history
            System.out.println("Starbase 13 has a rich history of space exploration and scientific discovery. You can delve deeper into its archives at the central library.");
        } else {
            System.out.println("No problem, " + userName + ". If you ever want to learn more, the historical archives are always available.");
        }

        // Closing scanner object
        scanner.close(); // Closing the scanner to release system resources

        // Creating 5 Spaceship objects with different descriptions
        Spaceship ship1 = new Spaceship("Large cargo vessel used for interstellar trade.");
        Spaceship ship2 = new Spaceship("Sleek fighter craft equipped for deep space combat.");
        Spaceship ship3 = new Spaceship("Research vessel conducting experiments on cosmic phenomena.");
        Spaceship ship4 = new Spaceship("Passenger liner ferrying travelers to distant star systems.");
        Spaceship ship5 = new Spaceship("Exploration ship mapping uncharted regions of space.");

        // Creating 5 Lifeform objects with different descriptions
        Lifeform lifeform1 = new Lifeform("Friendly alien species from a nearby star cluster.");
        Lifeform lifeform2 = new Lifeform("Sentient robotic beings assisting with station maintenance.");
        Lifeform lifeform3 = new Lifeform("Microscopic organisms thriving in zero-gravity environments.");
        Lifeform lifeform4 = new Lifeform("Ancient alien artifact housing an unknown power source.");
        Lifeform lifeform5 = new Lifeform("Bioluminescent creatures adapted to deep space conditions.");

        // Displaying descriptions of all 10 objects
        ship1.displayDescription();
        ship2.displayDescription();
        ship3.displayDescription();
        ship4.displayDescription();
        ship5.displayDescription();
        lifeform1.displayDescription();
        lifeform2.displayDescription();
        lifeform3.displayDescription();
        lifeform4.displayDescription();
        lifeform5.displayDescription();

        System.out.println("Enjoy the rest of your stay!"); // Displaying a farewell message
    }
}