import java.util.Scanner; // Importing the Scanner class from java.util package

public class Starbase13Story { // Declaring a class named Starbase13Story
    private static final Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input

    public static void meetProminentFigures() { // Declaring a method to introduce and interact with prominent figures
        // Create Human and Alien characters
        Human captain = new Human("Captain John", "Experienced captain of the starship Odyssey.");
        Human engineer = new Human("Engineer Sarah", "Skilled engineer responsible for maintaining the station's systems.");
        Human scientist = new Human("Dr. Liara", "Renowned scientist conducting research on cosmic phenomena.");
        Alien ambassador = new Alien("Ambassador Zorlon", "Representative of the Galactic Federation.");
        Alien trader = new Alien("Trader Grak", "Merchant specializing in exotic goods from distant planets.");
        Alien researcher = new Alien("Researcher Xel'Nar", "Scholar studying ancient civilizations across the galaxy.");
        Being visitor1 = new Being("Traveler Korg", "Curious traveler seeking knowledge about space exploration.");
        Being visitor2 = new Being("Explorer Lila", "Adventurous explorer eager to discover new worlds.");

        // Display introduction and descriptions
        System.out.println("Welcome aboard the Starbase 13!");
        System.out.println("Today, we have some prominent figures visiting the station.");

        captain.displayDescription(); // Displaying Captain's description
        engineer.displayDescription(); // Displaying Engineer's description
        scientist.displayDescription(); // Displaying Scientist's description
        ambassador.displayDescription(); // Displaying Ambassador's description
        trader.displayDescription(); // Displaying Trader's description
        researcher.displayDescription(); // Displaying Researcher's description
        visitor1.displayDescription(); // Displaying Visitor 1's description
        visitor2.displayDescription(); // Displaying Visitor 2's description

        // Further interaction with the characters
        System.out.println("\nCaptain John says: \"Greetings, traveler! What brings you to Starbase 13?\"");
        String responseToCaptain = getUserResponse(); // Getting user's response to Captain's question
        System.out.println("Ambassador Zorlon says: \"It's an honor to meet you. Are you enjoying your time on our station?\"");
        String responseToAmbassador = getUserResponse(); // Getting user's response to Ambassador's question
        System.out.println("Researcher Xel'Nar says: \"What do you think is the most intriguing aspect of space exploration?\"");
        String responseToResearcher = getUserResponse(); // Getting user's response to Researcher's question
        System.out.println("Trader Grak says: \"Have you ever traveled to any exotic planets?\"");
        String responseToTrader = getUserResponse(); // Getting user's response to Trader's question

        // Ask the user if they want to explore more areas
        System.out.println("Do you want to explore more areas? (Yes/No)");
        String exploreMore = scanner.nextLine(); // Getting user's choice to explore more areas

        if (exploreMore.equalsIgnoreCase("Yes")) { // Checking if user wants to explore more areas
            exploreAreas(); // Invoking the exploreAreas method
        } else {
            System.out.println("That's okay. Enjoy your time on Starbase 13!"); // Printing a farewell message
        }
    }

    private static String getUserResponse() { // Declaring a method to get user's response
        System.out.print("Your response: "); // Prompting the user for response
        return scanner.nextLine(); // Returning the user's response
    }

    public static void exploreAreas() { // Declaring a method to explore different areas
        // Create new areas within Starbase 13
        Area engineeringBay = new Area("Engineering Bay", "Central hub for spacecraft maintenance and repairs.");
        Area observationDeck = new Area("Observation Deck", "Panoramic view of space from within the station.");
        Area alienQuarters = new Area("Alien Quarters", "Living quarters specially designed for alien inhabitants.");
        Area researchLab = new Area("Research Lab", "State-of-the-art facility for scientific experiments and analysis.");

        // Display descriptions of areas
        engineeringBay.getDescription(); // Displaying description of Engineering Bay
        observationDeck.getDescription(); // Displaying description of Observation Deck
        alienQuarters.getDescription(); // Displaying description of Alien Quarters
        researchLab.getDescription(); // Displaying description of Research Lab

        int choice; // Declaring a variable to store user's choice
        do { // Beginning of do-while loop for exploring areas
            // Prompt user to explore an area
            System.out.println("\nChoose an area to explore (1-4), or enter 5 to exit:");
            System.out.println("1. Engineering Bay");
            System.out.println("2. Observation Deck");
            System.out.println("3. Alien Quarters");
            System.out.println("4. Research Lab");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: "); // Prompting the user for choice
            choice = scanner.nextInt(); // Reading user's choice
            scanner.nextLine(); // Consume newline character

            switch (choice) { // Switch statement for handling user's choice
                case 1: // Case for exploring Engineering Bay
                    System.out.println("Exploring Engineering Bay: " + engineeringBay.getDescription()); // Displaying description of Engineering Bay
                    break;
                case 2: // Case for exploring Observation Deck
                    System.out.println("Exploring Observation Deck: " + observationDeck.getDescription()); // Displaying description of Observation Deck
                    break;
                case 3: // Case for exploring Alien Quarters
                    System.out.println("Exploring Alien Quarters: " + alienQuarters.getDescription()); // Displaying description of Alien Quarters
                    break;
                case 4: // Case for exploring Research Lab
                    System.out.println("Exploring Research Lab: " + researchLab.getDescription()); // Displaying description of Research Lab
                    break;
                case 5: // Case for exiting the exploration
                    System.out.println("Exiting exploration of areas."); // Printing message for exiting exploration
                    break;
                default: // Default case for handling invalid choices
                    System.out.println("Invalid choice. Please enter a number between 1 and 5."); // Displaying message for invalid choice
            }
        } while (choice != 5); // End of do-while loop
        System.out.println("Enjoy your stay!"); // Printing farewell message
    }
}