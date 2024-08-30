public class Pod {
    // Declaration of instance variables
    public String name; // Variable to hold the name of the pod
    public String entryCode; // Variable to hold the entry code of the pod
    public String color; // Variable to hold the color of the pod
    public int constructionDuration; // Variable to hold the construction duration of the pod

    // Constructor to initialize instance variables
    public Pod(String name, String entryCode, String color, int constructionDuration) {
        this.name = name; // Initialize name with the value passed to the constructor
        this.entryCode = entryCode; // Initialize entryCode with the value passed to the constructor
        this.color = color; // Initialize color with the value passed to the constructor
        this.constructionDuration = constructionDuration; // Initialize constructionDuration with the value passed to the constructor
    }
}
