package edu.nwmissouri.zoo04lab;
/**
 *
 * @author Nithin Reddy Kumbham
 */
public class Squirrel extends Animal{
    /**
     * Aardvark constructor
     * @param name1 
     */
    public Squirrel(String name1){
        super(name1);
    }
    
    /**
     * Method which defines type of animal with name
     * @param name 
     */
    public void typeofAnimal(String name){
        System.out.println("Hey I am herbivores and my name is "+name+", I eat only plants ");
    }
    
 
    public void age(){
        System.out.println("My age is 6 years");
    }
    
    
    public void height(){
        System.out.println("My height is 14.3 cm");
    }
    
    
    public void weight(){
        System.out.println("My weight is 16 lbs");
    }
    
    
    public void isDisabled(){
        System.out.println("Are u kidding !, I am perfectly alright");
    }
    
    @Override
    public void speak(){
        System.out.println("I make a keech keech Sound");
    }
    
    @Override
    public void move(){
        System.out.println("I move with four legs");
    }
    
    
    public void sleep(){
        System.out.println("I njoy my sleep, I sleep for 10 hours");
    }
    
    
    public void gender(){
        System.out.println("I am female");
    }
}
