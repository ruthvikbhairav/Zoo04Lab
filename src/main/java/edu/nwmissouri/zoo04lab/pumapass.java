  public class Puma extends Animal {
        public Puma(String name){
         super(name);
    }
    
    @Override
    public void speak() {
        System.out.println("I'm an puma!");
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    
}

