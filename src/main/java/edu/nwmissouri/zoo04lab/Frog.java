/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;;

/**
 *
 * @author Manoj Kota
 */
public class Frog extends Animal {

    /**
     *
     * @param name
     * name parameter
     */
    public Frog(String name) {
        super(name);
    }

    /**
     *
     * overrides speak method
     */
    @Override
    public void speak()
    {
       System.out.println("Iam Frog,Iam Frog,Iam Frog");
    }

    /**
     * overrides move method
     */
    @Override
    public void move()
    {
       System.out.println("When i move,I jump,I jump");
    }
    
    /**
     * living method
     */
    public void habitate() {
        System.out.println("It lives both on land and water");
    }

    /**
     * type of animal
     */
    public void type() {
        System.out.println("Its a amphibian");
    }
   
    /**
     * feeding method
     */
    public void feeding()
    {
       System.out.println("Feeds on algae and insects");
    }

    /**
     * live span method
     */
    public void livespan()
    {
        System.out.println("lives upto 10-12 years");
    }
}


