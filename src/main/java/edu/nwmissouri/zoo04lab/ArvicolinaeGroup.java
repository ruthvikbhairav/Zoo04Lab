package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * This is my custom group class
 * Provides methods to create and run a group of Arvicolinae
 * @author NIKHIL KUMAR AKARAPU
 */
public class ArvicolinaeGroup {
    
    private static ArrayList<Arvicolinae> myGroup;

    /**
     * Create a static group of Arvicolinae
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Arvicolinae a = new Arvicolinae("Abbie");
        myGroup.add(a);
        myGroup.add(new Arvicolinae("Boss"));
        myGroup.add(new Arvicolinae("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Arvicolinae!");
        myGroup.forEach(Arvicolinae -> {
            Arvicolinae.speak();
            Arvicolinae.move();
        });
        System.out.println("Nice Arvicolinae - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    
    
}
