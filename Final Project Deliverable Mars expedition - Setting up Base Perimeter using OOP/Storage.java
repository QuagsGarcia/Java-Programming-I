import java.util.Scanner;
public class Storage extends Pod {
    public String entryCode; // Declaration of entryCode variable for Storage
    public int constructionDuration; // Declaration of constructionDuration variable for Storage
    public String color; // Declaration of color variable for Storage
    static Main main = new Main(); // Static variable main of type Main class

    public Storage(String name, String entryCode, String color, int constructionDuration) {
        super(name, entryCode, color, constructionDuration); // Call to superclass constructor with parameters
        this.entryCode = entryCode; // Initialization of entryCode variable
        this.color = color; // Initialization of color variable
        this.constructionDuration = constructionDuration; // Initialization of constructionDuration variable
    }

    public String getEntryCode() { // Method to get entry code
        return entryCode; // Return the entry code
    }

    public String getRoomColor() { // Method to get room color
        return color; // Return the color of the room
    }

    public int getConstructionDuration() { // Method to get construction duration
        return constructionDuration; // Return the construction duration
    }

    public void exploreStorage(Scanner scanner) { // Method to explore the storage room
            System.out.println("Welcome to the Storage Room."); // Print welcome message
            System.out.println("1. Search for supplies"); // Display option to search for supplies
            System.out.println("2. Organize shelves"); // Display option to organize shelves
            System.out.println("3. Check inventory"); // Display option to check inventory
            System.out.println("4. Exit Storage Room"); // Display option to exit

            System.out.print("Enter your choice: "); // Prompt user for choice
            int choice = scanner.nextInt(); // Read user's choice

            switch (choice) { // Switch statement based on user's choice
                case 1: // If user chooses to search for supplies
                    System.out.println("You search for supplies and find:"); // Print message
                    listSupplies(scanner); // Call method to list supplies
                    exploreStorage(scanner); // Recursive call to exploreStorage method
                    break; // Exit switch statement
                case 2: // If user chooses to organize shelves
                    System.out.println("You start organizing the shelves, placing items neatly to make them more accessible."); // Print message
                    double decimalValue = (double) 215 / 60; // Calculate time passed
                    Main.passTime(decimalValue); // Call method to pass time
                    exploreStorage(scanner); // Recursive call to exploreStorage method
                    break; // Exit switch statement
                case 3: // If user chooses to check inventory
                    System.out.println("You check the inventory list to ensure all essential items are in stock."); // Print message
                    inventorySupplies(scanner); // Call method to list inventory supplies
                    exploreStorage(scanner); // Recursive call to exploreStorage method
                    break; // Exit switch statement
                case 4: // If user chooses to exit storage room
                    break; // Exit switch statement
                default: // If user enters an invalid choice
                    System.out.println("Invalid choice. Please enter a number between 1 and 4."); // Print error message
                    exploreStorage(scanner); // Recursive call to exploreStorage method
            }
    }
    public void listSupplies(Scanner scanner) { // Method to list available supplies
        String[] supplies = { // Array containing list of supplies
            // List of supplies
            "1. Spare oxygen tanks", // Supply: Spare oxygen tanks
            "2. Emergency rations", // Supply: Emergency rations
            "3. Flashlights", // Supply: Flashlights
            "4. Batteries", // Supply: Batteries
            "5. First aid kits", // Supply: First aid kits
            "6. Portable heaters", // Supply: Portable heaters
            "7. Water bottles", // Supply: Water bottles
            "8. Tools (wrenches, screwdrivers, etc.)", // Supply: Tools (wrenches, screwdrivers, etc.)
            "9. Rope and cords", // Supply: Rope and cords
            "10. Duct tape", // Supply: Duct tape
            "11. Fire extinguishers", // Supply: Fire extinguishers
            "12. Protective goggles", // Supply: Protective goggles
            "13. Gloves", // Supply: Gloves
            "14. Respirators", // Supply: Respirators
            "15. Blankets", // Supply: Blankets
            "16. Communication devices", // Supply: Communication devices
            "17. Navigation equipment", // Supply: Navigation equipment
            "18. Solar panels", // Supply: Solar panels
            "19. Solar batteries", // Supply: Solar batteries
            "20. Portable shelters" // Supply: Portable shelters
        };

        for (String supply : supplies) { // Loop through each supply in the array
            System.out.println(supply); // Print the supply
        }
        double decimalValue = (double) 125 / 60; // Calculate time passed
        Main.passTime(decimalValue); // Call method to pass time
    }
    public void inventorySupplies(Scanner scanner) {
        String[] supplies = {  // Array containing list of inventory supplies
            // List of inventory supplies with quantities
            "Spare oxygen tanks [10]",
            "Emergency rations [50]",
            "Flashlights [20]",
            "Batteries [100]",
            "First aid kits [5]",
            "Portable heaters [3]",
            "Water bottles [50]",
            "Tools (wrenches, screwdrivers, etc.) [30]",
            "Rope and cords [25]",
            "Duct tape [15]",
            "Fire extinguishers [5]",
            "Protective goggles [20]",
            "Gloves [50]",
            "Respirators [10]",
            "Blankets [30]",
            "Communication devices [15]",
            "Navigation equipment [10]",
            "Solar panels [5]",
            "Solar batteries [10]",
            "Portable shelters [10]",
            "Signal flares [10]",
            "Whistles [50]",
            "Hand-crank radios [5]",
            "Multitools [30]",
            "Cooking utensils [20]",
            "Freeze-dried meals [100]",
            "Water purification tablets [50]",
            "Portable toilets [5]",
            "Rain ponchos [50]",
            "Tents [10]",
            "Sleeping bags [20]",
            "Camping stoves [10]",
            "Fuel canisters [20]",
            "Matches [100]",
            "Lighters [50]",
            "Tarps [10]",
            "Compasses [20]",
            "Maps [20]",
            "Emergency blankets [50]",
            "Hand warmers [100]",
            "Solar chargers [10]",
            "Lanterns [15]",
            "Glow sticks [50]",
            "Safety vests [10]",
            "Carabiners [50]",
            "Emergency whistles [50]",
            "Personal locator beacons [10]",
            "Fishing kits [25]",
            "Insect repellent [50]",
            "Sunscreen [50]"
        };
    
        for (String supply : supplies) { // Loop through each inventory supply in the array
            System.out.println(supply); // Print the inventory supply
        }
        double decimalValue = (double) 625 / 60; // Calculate time passed
        Main.passTime(decimalValue); // Call method to pass time
    }
}