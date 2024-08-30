import java.util.Scanner; // Importing the Scanner class for user input
import java.util.Random; // Importing the Random class for generating random numbers

public class Dormitory extends Pod { // Declaring a class named Dormitory which extends Pod
    private int bedCount; // Declaring a private integer variable named bedCount
    private int showerCount; // Declaring a private integer variable named showerCount
    public String entryCode; // Declaring a public string variable named entryCode
    public int constructionDuration; // Declaring a public integer variable named constructionDuration
    public String color; // Declaring a public string variable named color
    public double temperature; // Declaring a public double variable named temperature
    static Main main = new Main(); // Creating a static instance of the Main class named 'main'

    public Dormitory(String name, String entryCode, String color, int constructionDuration, int bedCount, int showerCount) {
        // Constructor method with parameters: name, entryCode, color, constructionDuration, bedCount, and showerCount
        super(name, entryCode, color, constructionDuration); // Calling the constructor of the superclass Pod
        this.bedCount = bedCount; // Assigning the value of bedCount parameter to the instance variable
        this.entryCode = entryCode; // Assigning the value of entryCode parameter to the instance variable
        this.showerCount = showerCount; // Assigning the value of showerCount parameter to the instance variable
        this.color = color; // Assigning the value of color parameter to the instance variable
        this.constructionDuration = constructionDuration; // Assigning the value of constructionDuration parameter to the instance variable
        this.temperature = 68.0; // Initializing temperature to 68.0
    }

    // Getter methods to access private variables
    public int getBedCount() { // Method to get the bed count
        return bedCount; // Returning the value of bedCount
    }
    
    public int getShowerCount() { // Method to get the shower count
        return showerCount; // Returning the value of showerCount
    }
    
    public String getEntryCode() { // Method to get the entry code
        return entryCode; // Returning the value of entryCode
    }
    
    public String getRoomColor() { // Method to get the room color
        return color; // Returning the value of color
    }
    
    public double getTemperature() { // Method to get the temperature
        return temperature; // Returning the value of temperature
    }
    
    public int getConstructionDuration() { // Method to get the construction duration
        return constructionDuration; // Returning the value of constructionDuration
    }

    // Method to explore the dormitory
    public void exploreDormitory(Scanner scanner) { // Method to explore the dormitory
        System.out.println("1. Look at the closet"); // Printing option 1
        System.out.println("2. Search the nightstand"); // Printing option 2
        System.out.println("3. Look out the window"); // Printing option 3
        System.out.println("4. Set the temperature in Fahrenheit"); // Printing option 4
        System.out.println("5. Rest in bed"); // Printing option 5
        System.out.println("6. Shower"); // Printing option 6
        System.out.println("7. Watch Downloaded TV Shows"); // Printing option 7
        System.out.println("8. Exit Dormitory"); // Printing option 8
        System.out.print("Enter your choice: "); // Prompting user for choice

        int choice = scanner.nextInt(); // Reading user choice

        switch (choice) { // Switch statement based on user choice
            case 1:
                lookAtCloset(scanner); // Calling lookAtCloset method
                break;
            case 2:
                searchNightstand(scanner); // Calling searchNightstand method
                break;
            case 3:
                lookOutWindow(scanner); // Calling lookOutWindow method
                break;
            case 4:
                setTemperature(scanner); // Calling setTemperature method
                exploreDormitory(scanner); // Exploring dormitory again
                break;
            case 5:
                SleepInBed(scanner); // Calling SleepInBed method
                break;
            case 6:
                Shower(scanner); // Calling Shower method
                break;
            case 7:
                WatchTV(scanner); // Calling WatchTV method
                break;
            case 8:
                break; // Exiting dormitory
            default:
                System.out.println("Invalid choice."); // Handling invalid choice
                exploreDormitory(scanner); // Exploring dormitory again
        }
    }

    // Method to set the temperature
    public void setTemperature(Scanner scanner) {
        boolean validTemperature = false; // Initializing a flag to track temperature validity

        while (!validTemperature) { // Loop until a valid temperature is entered
            System.out.println("Enter the temperature in Fahrenheit (between 40 and 85): "); // Prompting for temperature input
            temperature = scanner.nextDouble(); // Reading temperature input

            if (temperature >= 40 && temperature <= 85) { // Checking if temperature is within valid range
                validTemperature = true; // Marking temperature as valid
            } else {
                System.out.println("Invalid temperature. Temperature must be between 40 and 85 degrees Fahrenheit."); // Handling invalid temperature
            }
            if (validTemperature) { // If temperature is valid
                System.out.println("Temperature set to " + temperature + " degrees Fahrenheit in the Dormitory"); // Confirming temperature setting
            }
        }
        double decimalValue = (double) 1 / 60; // Calculating decimal value for time
        Main.passTime(decimalValue); // Passing time
    }

    // Method to look at the closet
    private void lookAtCloset(Scanner scanner) {
        System.out.println("You looked at the closet and found some spacesuits and spare oxygen tanks."); // Describing the closet
        double decimalValue = (double) 1 / 60; // Calculating decimal value for time
        Main.passTime(decimalValue); // Passing time
        exploreDormitory(scanner); // Exploring dormitory again
    }

    // Method to sleep in bed
    private void SleepInBed(Scanner scanner) {
        int randomNumber = generateRandomNumber(3, 8); // Generating random sleep duration
        System.out.println("You find a bed and fall asleep for: " + randomNumber + " hours."); // Describing sleeping action
        Main.passTime(randomNumber); // Passing time
        exploreDormitory(scanner); // Exploring dormitory again
    }

    // Method to take a shower
    private void Shower(Scanner scanner) {
        int randomNumber = generateRandomNumber(10, 75); // Generating random shower duration
        System.out.println("You shower for: " + randomNumber + " minutes."); // Describing showering action
        double decimalValue = (double) randomNumber / 60; // Calculating decimal value for time
        Main.passTime(decimalValue); // Passing time
        exploreDormitory(scanner); // Exploring dormitory again
    }

    
    private void WatchTV(Scanner scanner) { // Declaring a method to watch TV
        int randomNumber = generateRandomNumber(30, 300); // Generating a random number representing TV watching duration
        System.out.println("You watch TV for: " + randomNumber + " minutes."); // Displaying the duration of TV watching
        double decimalValue = (double) randomNumber / 60; // Converting minutes to hours
        Main.passTime(decimalValue); // Passing time
        exploreDormitory(scanner); // Exploring the dormitory again
    }
    
    private void searchNightstand(Scanner scanner) { // Declaring a method to search the nightstand
        System.out.println("You search the nightstand and find a journal with notes about life on Mars."); // Displaying the action of searching the nightstand
        double decimalValue = (double) 5 / 60; // Converting minutes to hours
        Main.passTime(decimalValue); // Passing time
        exploreDormitory(scanner); // Exploring the dormitory again
    }
    
    private void lookOutWindow(Scanner scanner) { // Declaring a method to look out the window
        System.out.println("You look out the window and see the barren landscape of Mars stretching out before you."); // Displaying the action of looking out the window
        double decimalValue = (double) 3 / 60; // Converting minutes to hours
        Main.passTime(decimalValue); // Passing time
        exploreDormitory(scanner); // Exploring the dormitory again
    }
    
    public static int generateRandomNumber(int min, int max) { // Declaring a method to generate a random number
        if (min >= max) { // Checking if min is greater than or equal to max
            throw new IllegalArgumentException("Max must be greater than min"); // Throwing an exception if min is greater than or equal to max
        }
    
        Random random = new Random(); // Creating a Random object
        return random.nextInt(max - min + 1) + min; // Returning a random number within the specified range
    }
}