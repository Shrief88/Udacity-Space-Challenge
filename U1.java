
package finalproject;

import java.util.Random;

public class U1 extends Rocket {

    public U1() {
        cost = 100000000;
        rocketweight=10000;
        maxweight=18000;
        currentweight=10000;    
    }

    @Override
    public boolean launch(){
        System.out.println("LANCHING...");
        
        // take a random value 
        Random rand=new Random();
        double r1=rand.nextDouble();
        
        // the equation which the course gave to us to check the success of lanching
        Chanceoflaunchexplosion=0.05*(currentweight/maxweight);
        if(Chanceoflaunchexplosion>=r1){
            System.out.println("U1 EXPLODED!!! \nSend the Same Rocket again ");
            return false;
        }
        else{
            System.out.println("U1 launched successfully");
            return true;
        }
    }
    
    @Override
    public boolean land(){
        System.out.println("LANDING..");
        
        // take a random value 
        Random rand=new Random();
        double r1=rand.nextDouble();
        
         // the equation which the course gave to us to check the success of landing
        Chanceoflandingcrash=0.01*(currentweight/maxweight);
        if(Chanceoflaunchexplosion>=r1){
            System.out.println("U1 EXPLODED!!! \nSend the Same Rocket again ");
            return false;
        }
        else{
            System.out.println("U1 landed successfully");
            return true;
        }
    }
    
    
    
    
    
    
    
    
}
