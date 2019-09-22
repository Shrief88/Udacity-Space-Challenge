
package finalproject;


public abstract class Rocket implements SpaceShip{

    protected int cost;
    protected int maxweight;
    protected int rocketweight;
    protected int currentweight;
    protected double Chanceoflaunchexplosion;
    protected double Chanceoflandingcrash;
    
    @Override
    public boolean launch(){
        return true;
    }
    
    @Override
    public boolean land(){
      return true;  
    }
    
    @Override
    // check if the ricket can carry the item or not 
    public boolean cancarry(Item item){
        return item.getWeigth()+currentweight<=maxweight;
        
    }
    
    // after the check you can add the item to the rocket
    @Override
    public int carry(Item item){
            return currentweight+=item.getWeigth();
    }
    
}
