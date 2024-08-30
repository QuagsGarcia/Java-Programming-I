import java.time.LocalDateTime; // Importing the LocalDateTime class from the java.time package for handling date and time
import java.time.format.DateTimeFormatter; // Importing the DateTimeFormatter class for formatting date and time
import java.util.Scanner; // Importing the Scanner class for user input
public class Main { // Declaring a public class named Main
    private static double timePassed = 0; // Default value set to 0 for a static variable to track time passed
    // This has to be listed here so it can be accessed by the other files.
    static Dormitory dormitory = new Dormitory("Dormitory", "1234", "Blue", 12, 50, 10); // Creating a static instance of Dormitory class named 'dormitory' with specified parameters
    static Laboratory laboratory = new Laboratory("Laboratory", "1234", "Blue", 68); // Creating a static instance of Laboratory class named 'laboratory' with specified parameters
    static Storage storage = new Storage("Storage Room", "1234", "Blue", 43); // Creating a static instance of Storage class named 'storage' with specified parameters
    static Cafeteria cafeteria = new Cafeteria("Cafeteria", "1234", "Blue", 37, 125); // Creating a static instance of Cafeteria class named 'cafeteria' with specified parameters
    static CommandCenter commandCenter = new CommandCenter("Command Center", "1234", "Blue", 25); // Creating a static instance of CommandCenter class named 'commandCenter' with specified parameters
    public static void main(String[] args) { // Main method to start the program
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input
        System.out.println("Welcome to the Mars Base! You are currently in the main area."); // Printing a welcome message
        Options(scanner); // Calling the Options method to display user options
    }

    public static void exploreDormitory(Scanner scanner) { // Method to explore the dormitory
        boolean hasAccess = false; // Variable to track if user has access to the dormitory
        while (!hasAccess) { // Loop until user enters correct passcode
            System.out.print("Enter the passcode to access the Dormitory: "); // Prompting user to enter passcode
            String passcode = scanner.nextLine(); // Reading user input for passcode
            if (passcode.equals(dormitory.getEntryCode())) { // Checking if entered passcode matches dormitory entry code
                hasAccess = true; // Setting access to true
                System.out.println("Passcode accepted. Welcome to the Dormitory!"); // Printing a confirmation message
                System.out.println("You entered the Dormitory."); // Printing a message indicating entry
                System.out.println("The lights are currently off, and you decide to turn them on."); // Printing an action message
                System.out.println("There are " + dormitory.getBedCount() + " beds in the room."); // Printing the number of beds in the dormitory
                System.out.println("The room looks messy with scattered clothes and personal belongings."); // Printing a description of the room
                System.out.println("What would you like to do in the Dormitory?"); // Prompting user for action
                dormitory.exploreDormitory(scanner); // Calling the exploreDormitory method of the dormitory
            } else {
                System.out.println("Incorrect passcode. Access denied."); // Printing a message indicating incorrect passcode
            }
        }
    }
    public static void exploreLaboratory(Scanner scanner) { // Declaring a method to explore the Laboratory
        boolean hasAccess = false; // Initializing a boolean variable to track access status
        while (!hasAccess) { // Starting a loop until access is granted
            System.out.print("Enter the passcode to access the Laboratory: "); // Prompting the user to enter a passcode
            String passcode = scanner.nextLine(); // Reading the passcode entered by the user
            if (passcode.equals(laboratory.getEntryCode())) { // Checking if the entered passcode matches the laboratory's entry code
                hasAccess = true; // Setting access status to true
                System.out.println("Passcode accepted. Welcome to the Laboratory!"); // Displaying a welcome message
                System.out.println("You entered the Laboratory."); // Providing information about entering the Laboratory
                System.out.println("The laboratory within the Mars Base is a bustling nexus of scientific discovery, adorned with advanced equipment, holographic displays, and containment chambers housing bioluminescent flora, all enveloped in an atmosphere of innovation and exploration."); // Describing the Laboratory environment
                System.out.println("What would you like to do in the Laboratory?"); // Prompting the user for actions in the Laboratory
                laboratory.exploreLaboratory(scanner); // Invoking the exploreLaboratory method recursively to continue exploration
            } else {
                System.out.println("Incorrect passcode. Access denied."); // Displaying a message for incorrect passcode
            }
        }
    }

    public static void exploreStorage(Scanner scanner) { // Declaring a method to explore the Storage Room
        boolean hasAccess = false; // Initializing a boolean variable to track access status
        while (!hasAccess) { // Starting a loop until access is granted
            System.out.print("Enter the passcode to access the Storage Room: "); // Prompting the user to enter a passcode
            String passcode = scanner.nextLine(); // Reading the passcode entered by the user
            if (passcode.equals(storage.getEntryCode())) { // Checking if the entered passcode matches the storage room's entry code
                hasAccess = true; // Setting access status to true
                System.out.println("Passcode accepted. Welcome to the Storage Room!"); // Displaying a welcome message
                System.out.println("You entered the Storage Room."); // Providing information about entering the Storage Room
                System.out.println("The storage room is a spacious chamber with neatly organized shelves lining the walls, filled with various supplies and equipment essential for survival and exploration on Mars."); // Describing the Storage Room environment
                System.out.println("What would you like to do in the Storage Room?"); // Prompting the user for actions in the Storage Room
                storage.exploreStorage(scanner); // Invoking the exploreStorage method recursively to continue exploration
            } else {
                System.out.println("Incorrect passcode. Access denied."); // Displaying a message for incorrect passcode
            }
        }
    }

    public static void exploreCafeteria(Scanner scanner) { // Declaring a method to explore the Cafeteria
        boolean hasAccess = false; // Initializing a boolean variable to track access status
        while (!hasAccess) { // Starting a loop until access is granted
            System.out.print("Enter the passcode to access the Cafeteria: "); // Prompting the user to enter a passcode
            String passcode = scanner.nextLine(); // Reading the passcode entered by the user
            if (passcode.equals(cafeteria.getEntryCode())) { // Checking if the entered passcode matches the cafeteria's entry code
                hasAccess = true; // Setting access status to true
                System.out.println("Passcode accepted. Welcome to the Cafeteria!"); // Displaying a welcome message
                System.out.println("You entered the Cafeteria."); // Providing information about entering the Cafeteria
                System.out.println("The room is very empty. Where did everyone go?"); // Describing the Cafeteria environment
                System.out.println("What would you like to do in the Cafeteria?"); // Prompting the user for actions in the Cafeteria
                cafeteria.exploreCafeteria(scanner); // Invoking the exploreCafeteria method recursively to continue exploration
            } else {
                System.out.println("Incorrect passcode. Access denied."); // Displaying a message for incorrect passcode
            }
        }
    }

    public static void exploreCommandCenter(Scanner scanner) { // Declaring a method to explore the Command Center
        boolean hasAccess = false; // Initializing a boolean variable to track access status
        while (!hasAccess) { // Starting a loop until access is granted
            System.out.print("Enter the passcode to access the Command Center: "); // Prompting the user to enter a passcode
            String passcode = scanner.nextLine(); // Reading the passcode entered by the user
            if (passcode.equals(commandCenter.getEntryCode())) { // Checking if the entered passcode matches the command center's entry code
                hasAccess = true; // Setting access status to true
                System.out.println("Passcode accepted. Welcome to the Command Center!"); // Displaying a welcome message
                System.out.println("You entered the Command Center."); // Providing information about entering the Command Center
                System.out.println("This room is filled with monitors reading diagnostics."); // Describing the Command Center environment
                System.out.println("What would you like to do in the Command Center?"); // Prompting the user for actions in the Command Center
                commandCenter.exploreCommandCenter(scanner); // Invoking the exploreCommandCenter method recursively to continue exploration
            } else {
                System.out.println("Incorrect passcode. Access denied."); // Displaying a message for incorrect passcode
            }
        }
    }

    public static void CheckTime(Scanner scanner) { // Declaring a method named CheckTime which takes a Scanner object as input
        LocalDateTime currentDateTime = LocalDateTime.now(); // Getting the current date and time
        LocalDateTime newDateTime = currentDateTime.plusYears(25); // Adding 25 years to the current date and time
        LocalDateTime newDateTime2 = newDateTime.plusHours((int) timePassed); // Adding 'timePassed' hours to the new date and time
        double minutes = Math.round(((timePassed - (int) timePassed) * 60) * 100.0) / 100.0; // Calculating the minutes part of the time passed
        LocalDateTime newDateTime3 = newDateTime2.plusMinutes((int) minutes); // Adding the minutes to the new date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a"); // Creating a formatter for the date and time
        String formattedDateTime = newDateTime3.format(formatter); // Formatting the new date and time as per the formatter
        System.out.println("Current time: " + formattedDateTime); // Printing the current time in the specified format
        Options(scanner); // Invoking the Options method with the Scanner object as parameter
    }
    
    public static void Options(Scanner scanner) { // Method to display user options
        System.out.println("You see several pods around you. Where would you like to explore?"); // Printing a prompt for user
        System.out.println("1. Dormitory"); // Printing option 1: Dormitory
        System.out.println("2. Cafeteria"); // Printing option 2: Cafeteria
        System.out.println("3. Laboratory"); // Printing option 3: Laboratory
        System.out.println("4. Command Center"); // Printing option 4: Command Center
        System.out.println("5. Storage"); // Printing option 5: Storage
        System.out.println("6. Check Time"); // Printing option 6: Check Time
        System.out.print("Enter the number of the pod you want to explore: "); // Prompting user to enter choice

        int choice = scanner.nextInt(); // Reading user choice
        scanner.nextLine(); // Consume the newline character

        switch (choice) { // Switch statement to handle user choice
            case 1:
                exploreDormitory(scanner); // Calling exploreDormitory method if user chooses 1
                Options(scanner); // Displaying options again after exploring
                break;
            case 2:
                exploreCafeteria(scanner); // Calling exploreCafeteria method if user chooses 2
                Options(scanner); // Displaying options again after exploring
                break;
            case 3:
                exploreLaboratory(scanner); // Calling exploreLaboratory method if user chooses 3
                Options(scanner); // Displaying options again after exploring
                break;
            case 4:
                exploreCommandCenter(scanner); // Calling exploreCommandCenter method if user chooses 4
                Options(scanner); // Displaying options again after exploring
                break;
            case 5:
                exploreStorage(scanner); // Calling exploreStorage method if user chooses 5
                Options(scanner); // Displaying options again after exploring
                break;
            case 6:
                CheckTime(scanner); // Calling CheckTime method if user chooses 6
                break;
            default:
                System.out.println("Invalid choice."); // Printing a message for invalid choice
                Options(scanner); // Displaying options again for invalid choice
        }
    }
    public static void passTime(double hours) { // Declaring a method named passTime which takes a parameter 'hours'
        timePassed += hours; // Incrementing the timePassed variable by the value of 'hours'
        LocalDateTime currentDateTime = LocalDateTime.now(); // Getting the current date and time
        LocalDateTime newDateTime = currentDateTime.plusYears(25); // Adding 25 years to the current date and time
        LocalDateTime newDateTime2 = newDateTime.plusHours((int) timePassed); // Adding 'timePassed' hours to the new date and time
        double minutes = Math.round(((timePassed - (int) timePassed) * 60) * 100.0) / 100.0; // Calculating the minutes part of the time passed
        LocalDateTime newDateTime3 = newDateTime2.plusMinutes((int) minutes); // Adding the minutes to the new date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a"); // Creating a formatter for the date and time
        String formattedDateTime = newDateTime3.format(formatter); // Formatting the new date and time as per the formatter
        System.out.println("Current time: " + formattedDateTime); // Printing the current time in the specified format
    }
}