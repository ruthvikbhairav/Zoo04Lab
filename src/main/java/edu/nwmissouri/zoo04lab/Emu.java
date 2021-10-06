/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;
/**
 *
 * @author Venkata Prabhakar Takkellapati (S545407)
 */
public class Emu extends Animal {
    
    public Emu(String name) {
        super(name);
    }

    
    @Override
    public void speak() {
        System.out.println("This endangered species is native to the dense forests of the Congo!");
    }
    
    @Override
    public void move() {
        System.out.println("they've become rare in the wild.");
    }    

}
