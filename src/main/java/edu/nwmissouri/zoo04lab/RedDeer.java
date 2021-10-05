package edu.nwmissouri.zoo04lab;
/**
 * This class is about RedDeer extends Animal
 *
 * @author Hari Hara Mummadi
 */
public class RedDeer extends Animal {

    /**
     * Constructor for RedDeer
     *
     * @param name name of instance of RedDeer
     */
    public RedDeer(String name) {
        super(name);
    }

    /**
     * Method for move()
     */
    @Override
    public void move() {
        System.out.println("I run on my 4 legs!");
    }

    /**
     * Method for sound()
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s.I'm an Deer!\n", this.name);
    }
