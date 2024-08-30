import java.time.LocalDateTime; // Importing LocalDateTime class from java.time package
import java.time.format.DateTimeFormatter; // Importing DateTimeFormatter class from java.time.format package
import java.util.Scanner; // Importing Scanner class from java.util package

public class CommandCenter extends Pod { // Declaring a class named CommandCenter that extends Pod class
    static Main main = new Main(); // Creating an instance of the Main class
    public int constructionDuration; // Declaring a public integer variable named constructionDuration
    public String color; // Declaring a public String variable named color
    public String entryCode; // Declaring a public String variable named entryCode

    public CommandCenter(String name, String entryCode, String color, int constructionDuration) { // Constructor with parameters to initialize instance variables
        super(name, entryCode, color, constructionDuration); // Invoking the constructor of the superclass with specified parameters
        this.color = color; // Assigning the value of color parameter to the instance variable
        this.entryCode = entryCode; // Assigning the value of entryCode parameter to the instance variable
        this.constructionDuration = constructionDuration; // Assigning the value of constructionDuration parameter to the instance variable
    }

    public String getRoomColor() { // Method to get the color of the room
        return color; // Returning the value of color
    }

    public int getConstructionDuration() { // Method to get the construction duration of the command center
        return constructionDuration; // Returning the value of constructionDuration
    }

    public String getEntryCode() { // Method to get the entry code of the command center
        return entryCode; // Returning the value of entryCode
    }

    public void exploreCommandCenter(Scanner scanner) { // Method to explore the command center
        System.out.println("Welcome to the Command Center"); // Displaying welcome message
        System.out.println("1. Look at diagnostics"); // Displaying options
        System.out.println("2. Change Dormitory Temperature");
        System.out.println("3. Camera View");
        System.out.println("4. Exit Command Center");
        System.out.print("Enter your choice: "); // Prompting user to enter their choice

        int choice = scanner.nextInt(); // Reading user's choice

        switch (choice) { // Switch statement to handle user's choice
            case 1:
                baseDiagnostics(scanner); // Calling method to display base diagnostics
                exploreCommandCenter(scanner); // Recursive call to exploreCommandCenter method
                break;
            case 2:
                Main.dormitory.setTemperature(scanner); // Calling method to change dormitory temperature
                exploreCommandCenter(scanner); // Recursive call to exploreCommandCenter method
                break;
            case 3:
                cameraChoice(scanner); // Calling method to view camera feed
                exploreCommandCenter(scanner); // Recursive call to exploreCommandCenter method
                break;
            case 4:
                break; // Exiting the command center
            default:
                System.out.println("Invalid choice."); // Displaying message for invalid choice
                exploreCommandCenter(scanner); // Recursive call to exploreCommandCenter method
        }
    }

    public void baseDiagnostics(Scanner scanner) { // Method to display base diagnostics
        System.out.println("Base Statistics:"); // Displaying header
        System.out.println("Construction Times:"); // Displaying subheader
        System.out.println("Dormitory: " + Main.dormitory.getConstructionDuration() + " hours"); // Displaying construction time of dormitory
        System.out.println("Cafeteria: " + Main.cafeteria.getConstructionDuration() + " hours"); // Displaying construction time of cafeteria
        System.out.println("Laboratory: " + Main.laboratory.getConstructionDuration() + " hours"); // Displaying construction time of laboratory
        System.out.println("CommandCenter: " + Main.commandCenter.getConstructionDuration() + " hours"); // Displaying construction time of command center
        System.out.println("Storage Room: " + Main.storage.getConstructionDuration() + " hours"); // Displaying construction time of storage room
        System.out.println("Pod Colors:"); // Displaying subheader
        System.out.println("Dormitory: " + Main.dormitory.getRoomColor()); // Displaying color of dormitory
        System.out.println("Cafeteria: " + Main.cafeteria.getRoomColor()); // Displaying color of cafeteria
        System.out.println("Laboratory: " + Main.laboratory.getRoomColor()); // Displaying color of laboratory
        System.out.println("CommandCenter: " + Main.commandCenter.getRoomColor()); // Displaying color of command center
        System.out.println("Storage Room: " + Main.storage.getRoomColor()); // Displaying color of storage room
        System.out.println("Pod Entry Codes:"); // Displaying subheader
        System.out.println("Dormitory: " + Main.dormitory.getEntryCode()); // Displaying entry code of dormitory
        System.out.println("Cafeteria: " + Main.cafeteria.getEntryCode()); // Displaying entry code of cafeteria
        System.out.println("Laboratory: " + Main.laboratory.getEntryCode()); // Displaying entry code of laboratory
        System.out.println("CommandCenter: " + Main.commandCenter.getEntryCode()); // Displaying entry code of command center
        System.out.println("Storage Room: " + Main.storage.getEntryCode()); // Displaying entry code of storage room
        System.out.println("Other Diagnostics:"); // Displaying subheader
        System.out.println("Dormitory Temperature: " + Main.dormitory.getTemperature()); // Displaying dormitory temperature
        Main.passTime(0); // displaying the time
        System.out.println("Oxygen Level: 98%"); // Displaying oxygen level
        System.out.println("Pressure: 1013 hPa"); // Displaying pressure
        System.out.println("Radiation Level: Low"); // Displaying radiation level
        System.out.println("Energy Consumption: 75%"); // Displaying energy consumption
    }

    public void cameraChoice(Scanner scanner) { // Method to choose a camera for viewing
        System.out.println("Select a camera to view a scene (1-25):"); // Displaying prompt
        System.out.println("26: Exit Camera View");  // Exit option
        System.out.print("Enter the camera number: "); // Prompting user to enter camera number
        int cameraNumber = scanner.nextInt(); // Reading user's choice

        // Displaying scene based on selected camera
        switch (cameraNumber) {
            case 1:
                System.out.println("Camera 1: A view of the Martian landscape with towering red rock formations.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 2:
                System.out.println("Camera 2: A close-up of a robotic rover collecting soil samples.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 3:
                System.out.println("Camera 3: An overhead view of the Mars Base with solar panels glinting in the sunlight.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 4:
                System.out.println("Camera 4: A panoramic view of the Martian sky as a dust storm approaches in the distance.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 5:
                System.out.println("Camera 5: A time-lapse of Martian flora growing in the greenhouse, reaching towards the artificial sunlight.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 6:
                System.out.println("Camera 6: An infrared view of underground Martian caverns, with geological formations illuminated.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 7:
                System.out.println("Camera 7: A live feed of scientists conducting experiments on Martian soil samples in the laboratory.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 8:
                System.out.println("Camera 8: A bird's-eye view of Martian rovers navigating across rocky terrain, searching for signs of life.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 9:
                System.out.println("Camera 9: A thermal imaging scan of the Martian surface, detecting variations in temperature across different regions.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 10:
                System.out.println("Camera 10: A close-up of a Martian dust devil swirling across the horizon, picking up red sand particles.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 11:
                System.out.println("Camera 11: A view of the Martian sunrise, casting a warm glow over the horizon.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 12:
                System.out.println("Camera 12: An underwater camera capturing the movements of aquatic life in a Martian underground lake.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 13:
                System.out.println("Camera 13: A high-altitude view of Martian clouds drifting lazily across the sky.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 14:
                System.out.println("Camera 14: A live feed of astronauts conducting a spacewalk outside the Mars Base, repairing solar panels.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 15:
                System.out.println("Camera 15: A close-up of a Martian dust storm engulfing the landscape, reducing visibility.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 16:
                System.out.println("Camera 16: An ultraviolet camera revealing fluorescent patterns on Martian rocks under sunlight.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 17:
                System.out.println("Camera 17: A time-lapse of Martian sand dunes shifting and reshaping over time.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 18:
                System.out.println("Camera 18: A view of Martian mountains in the distance, with snow-capped peaks reflecting sunlight.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 19:
                System.out.println("Camera 19: A live feed of astronauts testing new spacesuit designs in the simulated Martian environment.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 20:
                System.out.println("Camera 20: A slow-motion video of a meteorite impact crater forming on the Martian surface.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 21:
                System.out.println("Camera 21: An aerial view of Martian valleys carved by ancient rivers, now dry and desolate.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 22:
                System.out.println("Camera 22: A view of the Martian night sky, with distant stars twinkling against the dark expanse.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 23:
                System.out.println("Camera 23: A time-lapse of Martian sandstorms sweeping across the landscape, erasing tracks.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 24:
                System.out.println("Camera 24: An underground camera capturing the growth of fungal colonies in Martian soil samples.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 25:
                System.out.println("Camera 25: A live feed of engineers testing Martian habitat construction techniques using 3D printers.");
                cameraChoice(scanner); // Recursive call to cameraChoice method
                break;
            case 26: 
                break;  // Exiting camera view
            default:
                System.out.println("Invalid camera number."); // Displaying message for invalid camera number
                cameraChoice(scanner); // Recursive call to cameraChoice method
        }
    }
}