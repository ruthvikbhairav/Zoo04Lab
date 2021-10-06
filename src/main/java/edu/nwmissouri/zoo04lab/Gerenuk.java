/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Tejaswini Challa
 */
public class Gerenuk extends Animal {
   public Gerenuk(String name) 
   {
       super(name);
   }

    /**
     *
     */
    @Override
   public void speak()
    {
        System.out.println("I am an Gerenuk "+this.name);
    }
   @Override
   public void move()
   {
       System.out.println("I can move with four legs");
   }
  
    public void size()
    {
        System.out.println("140 to 160 CENTIMETERS");
    }
    public void place()
    {
        System.out.println("Exists in Kenya");
    }
    
}
