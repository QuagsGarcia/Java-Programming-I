import java.util.Scanner; // Importing the Scanner class from java.util package

public class Laboratory extends Pod { // Declaring a class named Laboratory that extends Pod class
    static Main main = new Main(); // Creating a static instance of Main class
    
    public String entryCode; // Declaring a public String variable named entryCode
    public int constructionDuration; // Declaring a public integer variable named constructionDuration
    public String color; // Declaring a public String variable named color
    
    // Constructor for the Laboratory class
    public Laboratory(String name, String entryCode, String color, int constructionDuration) {
        super(name, entryCode, color, constructionDuration); // Calling the constructor of the superclass
        this.entryCode = entryCode; // Initializing entryCode with the passed value
        this.color = color; // Initializing color with the passed value
        this.constructionDuration = constructionDuration; // Initializing constructionDuration with the passed value
    }
    
    // Getter method for entryCode
    public String getEntryCode() {
        return entryCode;
    }
    
    // Getter method for color
    public String getRoomColor() {
        return color;
    }
    
    // Getter method for constructionDuration
    public int getConstructionDuration() {
        return constructionDuration;
    }
    
    // Method to explore the Laboratory
    public void exploreLaboratory(Scanner scanner) {
        System.out.println("Welcome to the Laboratory!"); // Displaying a welcome message
        System.out.println("1. Look at beakers"); // Displaying option 1
        System.out.println("2. Look at unique organisms"); // Displaying option 2
        System.out.println("3. Look at equipment cabinet"); // Displaying option 3
        System.out.println("4. Talk to scientists"); // Displaying option 4
        System.out.println("5. Exit Laboratory"); // Displaying option 5
        System.out.print("Enter your choice: "); // Prompting the user to enter a choice
        int exploreChoice = scanner.nextInt(); // Reading user's choice
        
        switch (exploreChoice) { // Switch statement based on user's choice
            case 1:
                lookAtBeakers(scanner); // Calling the method to look at beakers
                exploreLaboratory(scanner); // Exploring the laboratory again
                break;
            case 2:
                lookAtUniqueOrganisms(scanner); // Calling the method to look at unique organisms
                exploreLaboratory(scanner); // Exploring the laboratory again
                break;
            case 3:
                lookAtEquipment(scanner); // Calling the method to look at equipment
                exploreLaboratory(scanner); // Exploring the laboratory again
                break;
            case 4:
                talkToScientists(scanner); // Calling the method to talk to scientists
                exploreLaboratory(scanner); // Exploring the laboratory again
                break;
            case 5:
                Main.Options(scanner); // Calling the Options method in Main class to return to main menu
            default:
                System.out.println("Invalid choice. No scientist selected."); // Displaying message for invalid choice
                exploreLaboratory(scanner); // Exploring the laboratory again
                break;
        }
    }

    // Method to talk to scientists
    private void talkToScientists(Scanner scanner) {
        // Displaying options to select a scientist
        System.out.println("You see several scientists in the laboratory. Who would you like to talk to?");
        System.out.println("1. Dr. Smith");
        System.out.println("2. Dr. Johnson");
        System.out.println("3. Dr. Garcia");
        System.out.println("4. Dr. Kim");
        System.out.println("5. Dr. Patel");
        System.out.println("6. Exit Choices");
        System.out.print("Enter the number of the scientist you want to talk to: ");

        int scientistChoice = scanner.nextInt(); // Reading user's choice
        scanner.nextLine(); // Consume newline

        String question = ""; // Initializing question string
        
        switch (scientistChoice) { // Switch statement based on user's choice
            case 1:
                // Starting conversation with Dr. Smith
                System.out.println("You start a conversation with Dr. Smith.");
                question = "What do you think is the most promising area of research in our field?"; // Setting question
                Response(question, scanner); // Calling the method to get response
                break;
            case 2:
                // Starting conversation with Dr. Johnson
                System.out.println("You start a conversation with Dr. Johnson.");
                question = "How do you see technology advancing our research in the next decade?"; // Setting question
                Response(question, scanner); // Calling the method to get response
                break;
            case 3:
                // Starting conversation with Dr. Garcia
                System.out.println("You start a conversation with Dr. Garcia.");
                question = "What challenges do you anticipate in our current project?"; // Setting question
                Response(question, scanner); // Calling the method to get response
                break;
            case 4:
                // Starting conversation with Dr. Kim
                System.out.println("You start a conversation with Dr. Kim.");
                question = "What inspired you to pursue a career in science?"; // Setting question
                Response(question, scanner); // Calling the method to get response
                break;
            case 5:
                // Starting conversation with Dr. Patel
                System.out.println("You start a conversation with Dr. Patel.");
                question = "How do you think our discoveries could impact society?"; // Setting question
                Response(question, scanner); // Calling the method to get response
                break;
            case 6:
                break; // Exiting choices
            default:
                System.out.println("Invalid choice. No scientist selected."); // Displaying message for invalid choice
                talkToScientists(scanner); // Talking to scientists again
                break;
        }
    }
    
    // Method to get response from scientists
    private void Response(String question, Scanner scanner) {
        System.out.println(question); // Displaying the question
        System.out.print("Your response: "); // Prompting for response
        scanner.nextLine(); // Consume newline
        System.out.println("Interesting! Thank you for your insights."); // Displaying gratitude
        double decimalValue = (double) 10 / 60; // Calculating time passed for conversation
        Main.passTime(decimalValue); // Passing time
        talkToScientists(scanner); // Talking to scientists again
    }

    // Method to look at beakers
    private void lookAtBeakers(Scanner scanner) { // Declaring a method to examine beakers
        System.out.println("You examine the various beakers filled with colorful liquids."); // Displaying the action of examining beakers
        System.out.println("A beaker filled with a bubbling, iridescent liquid, emitting a faint glow."); // Describing a beaker filled with iridescent liquid
        System.out.println("A beaker containing a clear solution with tiny silver particles suspended in it, creating a shimmering effect."); // Describing a beaker containing a clear solution
        System.out.println("A beaker filled with a viscous, purple liquid that seems to change color as you tilt it."); // Describing a beaker filled with purple liquid
        System.out.println("A beaker holding a dark green substance that emits a faint, sweet aroma reminiscent of fresh herbs."); // Describing a beaker holding dark green substance
        System.out.println("A beaker containing a swirling mixture of red and blue liquids, forming intricate patterns as they mix."); // Describing a beaker containing a swirling mixture
        System.out.println("A beaker filled with a transparent gel-like substance, inside of which small, luminous spheres gently float."); // Describing a beaker filled with gel-like substance
        System.out.println("A beaker containing a cloudy liquid with suspended metallic flakes, creating a mesmerizing glittering effect."); // Describing a beaker containing a cloudy liquid
        System.out.println("A beaker holding a bubbling, yellow-green liquid that emits a faint fizzing sound."); // Describing a beaker holding yellow-green liquid
        System.out.println("A beaker filled with a clear liquid that refracts light, casting rainbow-colored patterns on nearby surfaces."); // Describing a beaker filled with clear liquid
        System.out.println("A beaker containing a thick, milky white liquid that emits a subtle floral fragrance."); // Describing a beaker containing milky white liquid
        double decimalValue = (double) 45 / 60; // Converting minutes to hours
        Main.passTime(decimalValue); // Passing time
        exploreLaboratory(scanner); // Exploring the laboratory again
    }

    private void lookAtUniqueOrganisms(Scanner scanner) { // Declaring a method to observe unique organisms
        System.out.println("You observe the unique organisms in the laboratory."); // Displaying the action of observing organisms
        System.out.println("A tiny microorganism with fluorescent spots, glowing softly under UV light."); // Describing a microorganism
        System.out.println("A large plant-like organism with luminescent petals that emit a gentle glow in the dark."); // Describing a plant-like organism
        System.out.println("A small crustacean-like creature with iridescent exoskeleton, reflecting light in various colors."); // Describing a crustacean-like creature
        System.out.println("A translucent jellyfish-like organism with bioluminescent tentacles that pulsate rhythmically."); // Describing a jellyfish-like organism
        System.out.println("A colony of microscopic organisms forming intricate patterns as they move collectively."); // Describing a colony of microscopic organisms
        System.out.println("A furry mammalian creature with bioluminescent fur, glowing softly in the darkness."); // Describing a furry mammalian creature
        System.out.println("A multi-legged insectoid organism with metallic iridescence, shimmering in the light."); // Describing an insectoid organism
        System.out.println("A gelatinous blob-like creature with phosphorescent patches, emitting a soft glow."); // Describing a blob-like creature
        System.out.println("A bird-like organism with iridescent feathers, reflecting a spectrum of colors as it moves."); // Describing a bird-like organism
        System.out.println("An aquatic organism resembling a deep-sea fish, with bioluminescent spots along its body."); // Describing an aquatic organism
        double decimalValue = (double) 75 / 60; // Converting minutes to hours
        Main.passTime(decimalValue); // Passing time
        exploreLaboratory(scanner); // Exploring the laboratory again
    }
    
    private void lookAtEquipment(Scanner scanner) { // Declaring a method to look at laboratory equipment
        System.out.println("You inspect the closet located in the back of the room."); // Displaying the action of inspecting equipment
        System.out.println("A pristine lab coat, embroidered with the name of a renowned scientist."); // Describing a lab coat
        System.out.println("A pair of safety goggles with adjustable straps and scratch-resistant lenses."); // Describing safety goggles
        System.out.println("A set of gloves made from a flexible, chemical-resistant material."); // Describing a set of gloves
        System.out.println("A protective face shield with a comfortable foam lining."); // Describing a face shield
        System.out.println("A pair of high-quality pipettes for precise liquid measurement."); // Describing pipettes
        System.out.println("A magnetic stirrer with variable speed control for efficient mixing."); // Describing a magnetic stirrer
        System.out.println("A digital pH meter for accurate measurement of acidity and alkalinity."); // Describing a pH meter
        System.out.println("A centrifuge machine capable of separating substances based on density."); // Describing a centrifuge machine
        System.out.println("A spectrophotometer for analyzing the absorption spectrum of various substances."); // Describing a spectrophotometer
        System.out.println("A microcentrifuge for rapid spinning of small samples to separate components."); // Describing a microcentrifuge
        double decimalValue = (double) 25 / 60; // Converting minutes to hours
        Main.passTime(decimalValue); // Passing time
        exploreLaboratory(scanner); // Exploring the laboratory again
    }
}