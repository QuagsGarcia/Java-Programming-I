import java.util.Scanner; // Importing the Scanner class from java.util package

public class Starbase13Description { // Declaring a class named Starbase13Description
    public static void main(String[] args) { // Declaring the main method
        System.out.println("I am HAL, what is your name?"); // Printing a message to the console
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input
        System.out.print("Enter your name: "); // Prompting the user to enter their name
        String userName = scanner.nextLine(); // Reading the user's name from input
        System.out.println("Hi " + userName + ", welcome to Starbase 13."); // Greeting the user
        
        // Printing descriptions of Starbase 13
        System.out.println("As you approach Starbase 13 in your shuttle, you are greeted by a magnificent sight.");
        System.out.println("The space station looms large, its metallic structure glinting in the sunlight.");
        System.out.println("You can see sleek spacecraft docking and departing, bustling with activity.");
        System.out.println("Clusters of lights adorn the exterior, indicating various facilities and living quarters.");
        System.out.println("Overall, Starbase 13 emanates a sense of advanced technology and exploration.");
        System.out.println("You hear the faint hum of thrusters as ships navigate around the station.");
        System.out.println("A holographic display nearby shows real-time space traffic and upcoming events.");
        System.out.println("The station's AI announces upcoming arrivals and departures, ensuring smooth operations.");

        // Prompting the user for further exploration
        System.out.println("\n" + userName + ", do you wish to explore the station further? (Yes/No)");
        String exploreChoice = scanner.nextLine();

        // Responding based on user's choice with a lore description
        if (exploreChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Great! There are many areas to explore within the station. Enjoy your adventure!");
        } else {
            System.out.println("That's alright, " + userName + ". If you change your mind, feel free to explore anytime!");
        }

        // Prompting the user to learn about Starbase 13's history
        System.out.println("\n" + userName + ", would you like to learn more about Starbase 13's history? (Yes/No)");
        String learnHistoryChoice = scanner.nextLine();

        // Responding based on user's choice with a lore description
        if (learnHistoryChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Starbase 13 has a rich history of space exploration and scientific discovery. You can delve deeper into its archives at the central library.");
        } else {
            System.out.println("No problem, " + userName + ". If you ever want to learn more, the historical archives are always available.");
        }

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

        // Displaying descriptions of all ship and lifeform objects
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

        // Creating Area objects using a name/title then a description
        Area quarksBar = new Area("Quark's Bar", "A bustling social hub with various alien delicacies and drinks.");
        Area holodeck = new Area("Holodeck", "An immersive virtual reality environment for recreation and training.");
        Area hangar = new Area("Hangar", "A massive hangar bay housing various spacecraft for maintenance and deployment.");
        Area securedRoom = new Area("Secured Room", "A restricted area requiring a password for access.");

        // Menu for exploring different areas
        int choice; // Declaring a variable to store user's choice
        boolean accessGranted = true; // Declaring a variable to track access to secured room
        do { // Beginning of do-while loop
            // Displaying menu options
            System.out.println("\n" + userName + ", choose an area to explore:");
            System.out.println("1. Quark's Bar");
            System.out.println("2. Holodeck");
            System.out.println("3. Hangar");
            System.out.println("4. Secured Room");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): "); // Prompting the user for choice
            choice = scanner.nextInt(); // Reading user's choice
            
            // Consume newline character
            scanner.nextLine();

            // Switch statement for handling user's choice
            switch (choice) {
                case 1: // Case for exploring Quark's Bar
                    System.out.println("Entering " + quarksBar.getName() + ": " + quarksBar.getDescription());
                    break;
                case 2: // Case for exploring Holodeck
                    System.out.println("Entering " + holodeck.getName() + ": " + holodeck.getDescription());
                    break;
                case 3: // Case for exploring Hangar
                    System.out.println("Entering " + hangar.getName() + ": " + hangar.getDescription());
                    break;
                case 4: // Case for exploring Secured Room
                    if (accessGranted) { // Checking if the user has access to the room
                        int attempts = 0; // Declaring a variable to track password attempts
                        while (attempts < 5) { // Beginning of password attempts loop
                            // Prompting the user for password
                            System.out.print("Enter the password to access the secured room: ");
                            if (attempts == 0) {
                                scanner.nextLine(); // Clearing the input buffer
                            }
                            String password = scanner.nextLine(); // Reading user's password
                            if (password.equals("password")) { // Checking if password is correct
                                accessGranted = true; // Setting access to secured room to true
                                System.out.println("Correct password! Entering " + securedRoom.getName() + ": " + securedRoom.getDescription());
                                // Additional logic for interacting with Secured Room
                                break; // Exiting the loop
                            } else { // Executed if password is incorrect
                                attempts++; // Incrementing password attempts
                                if (attempts < 5) { // Checking if attempts are within limit
                                    System.out.println("Incorrect password. You have " + (5 - attempts) + " attempts left."); // Displaying remaining attempts
                                } else { // Executed if maximum attempts are reached
                                    accessGranted = false; // Setting access to secured room to false if attempts are 5 or greater
                                }
                            }
                        } // End of password attempts loop
                        if (!accessGranted) { // Executed if access is not granted
                            System.out.println("Access denied. You have exceeded the maximum number of attempts."); // Displaying access denied message
                        }
                    } else { // Executed if access is already denied
                        System.out.println("Access denied. You have exceeded the maximum number of attempts."); // Displaying access denied message
                    }
                    break;
                case 5: // Case for exiting the menu
                    break;
                default: // Default case for handling invalid choices
                    System.out.println("Invalid choice. Please enter a number between 1 and 5."); // Displaying invalid choice message
            }
        } while (choice != 5); // End of do-while loop

        // After exiting the loop, the user will be prompted to meet some people
        System.out.println("\n" + userName + ", do you want to meet some of the prominent figures on Starbase 13? (Yes/No)");
        String meetCharactersChoice = scanner.nextLine();

        if (meetCharactersChoice.equalsIgnoreCase("Yes")) { // Checking to see if user wants to further explore
            Starbase13Story.meetProminentFigures(); // triggers function to meet more figures
        } else {
            System.out.println("Enjoy your stay!"); // Printing farewell message
        }
        scanner.close(); // Closing the Scanner object
    }
}