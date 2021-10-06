package edu.nwmissouri.zoo04lab;

/**
 * Floppy class (derived subclass of the superclass Animal)
 * 
 * @author S545243 Satheesh Eppalapelli
 */
public class Floppy extends Animal {

    /**
     * Floppy constructor 
     * @param name - the name of this Floppy
     */
    public Floppy(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Floppy! ", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.\n");
    }

}
