package edu.nwmissouri.zoo04lab;

/**
 * The class Griffin, a subclass of Animal
 *
 * @author Alexander Dieringer
 */
public class Griffin extends Animal {

    /**
     * Define variables to hold data about the Griffin class
     * May refactor variables into super class
     * To be used in additional methods added later
     */
    private final String species_name;
    private final String species_latin;
    private final String locationFound;
    private final int sleepDuration_hours;
    private final int movementSpeed_mph;
    private final boolean isExtinct;
    
    /**
     * Griffin constructor
     * Creates an instance of the Griffin class, requires a name
     * @param name The name we will be giving our new Griffin
     */
    public Griffin(String name) {
        super(name);
        
        this.species_name = "Griffin";
        this.species_latin = "grȳpus";
        this.locationFound = "Fantasy";
        this.sleepDuration_hours = 8;
        this.movementSpeed_mph = 80;
        this.isExtinct = true;
    }

    /**
     * speak() - Presents the types of sounds made by the Griffin
     */
    @Override
    public void speak() {
        System.out.println("I'm a Griffin and I chirp like a bird, but I can "
                + "trumpet loudly if angry.");
    }

    /**
     * move() - Describes the general type of movement the animal Griffin
     */
    @Override
    public void move() {
        System.out.println("I can walk but I really enjoy flying through the sky.");
    }
}
