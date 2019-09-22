
package finalproject;

import java.util.Random;

public class U2 extends Rocket{

    public U2() {
        cost = 120000000;
        rocketweight=18000;
        maxweight=29000;
        currentweight=18000;
    }
    @Override
    public boolean launch(){
        System.out.println("LANCHING...");
        
         // take a random value 
        Random rand=new Random();
        double r1=rand.nextDouble();
        
        // the equation which the course gave to us to check the success of lanching
        Chanceoflaunchexplosion=0.04*(currentweight/maxweight);
        if(Chanceoflaunchexplosion>=r1){
            System.out.println("U2 EXPLODED!!!");
            return false;
        }
        else{
            System.out.println("U2 launched successfully");
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
        Chanceoflandingcrash=0.08*(currentweight/maxweight);
        if(Chanceoflaunchexplosion>=r1){
            System.out.println("U2 EXPLODED!!!");
            return false;
        }
        else{
            System.out.println("U2 landed successfully");
            return true;
        }
    }
    
    
}
