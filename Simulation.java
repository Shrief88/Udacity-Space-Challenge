
package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Simulation {
    
    public ArrayList<Item> loadItems (File file) throws FileNotFoundException{
        
        //Take the file of items
         Scanner input = new Scanner (file);
         ArrayList<Item> listofitems = new ArrayList();
         
         // Store the values in the file at arraylist of items
         while(input.hasNextLine())
         {
            // Passing Line by Line in the file  
            String line=input.nextLine();
            Item item=new Item();
            String[] name=line.split("=", 2);
            item.setName(name[0]);
            int x=Integer.parseInt(name[1]);
            item.setWeigth(x);
            listofitems.add(item);
         }
         return (listofitems);
    }
    
    public ArrayList<U1> loadU1 (ArrayList<Item> item){    
          ArrayList<U1> rocket=new ArrayList();
          U1 member=new U1();
          int j=0;
          rocket.add(member); 
          for(int i=0;i<item.size();i++)
          {
              // check if the rocket can carry or not , if he can life is Good 
              if(rocket.get(j).cancarry(item.get(i)))
                 rocket.get(j).carry(item.get(i));
              else
              {
                  
              // if he can not , we define a variable x represent the Remaining size in the rocket    
              int x=rocket.get(j).maxweight-rocket.get(j).currentweight;
              
              // Take the Amount x from the item and Put it in the Rocket
              item.get(i).setWeigth(x);
              rocket.get(j).carry(item.get(i));
              
              // Define a variable y represent the Remaining size in the item after we Done
              int y=item.get(i).getWeigth()-x;
              
              //create a new Rocket 
              U1 member1 = new U1();
              rocket.add(member1);
              j++;
              
              // add the Remaining weight from the item to the new Rocket
              item.get(i).setWeigth(y);
              rocket.get(j).carry(item.get(i));        
              }  
          }
          return(rocket);
          }
    
    public ArrayList<U2> loadU2 (ArrayList<Item> item){
          ArrayList<U2> rocket=new ArrayList();
          U2 member=new U2();
          int j=0,k=0;
          rocket.add(member); 
          for(int i=0;i<item.size();i++)
          {
              // check if the rocket can carry or not , if he can life is Good 
              if(rocket.get(j).cancarry(item.get(i)))
                 rocket.get(j).carry(item.get(i));
              else
              {
                  
              // if he can not , we define a variable x represent the Remaining size in the rocket   
              int x=rocket.get(j).maxweight-rocket.get(j).currentweight;
              
              // Take the Amount x from the item and Put it in the Rocket
              item.get(i).setWeigth(x);
              rocket.get(j).carry(item.get(i));
              
              // Define a variable y represent the Remaining size in the item after we Done
              int y=item.get(i).getWeigth()-x;
              
              //create a new Rocket 
              U2 member1 = new U2();
              rocket.add(member1);
              j++;
              
              // add the Remaining weight from the item to the new Rocket
              item.get(i).setWeigth(y);
              rocket.get(j).carry(item.get(i));        
              }
          }
          return(rocket);
          }
    
    public int runSimulation (ArrayList<Rocket> u){
        
        // To represent the number of the rockets that we have after simulation
        int counter=0;
        for(int i=0;i<u.size();)
        {
            counter++;
            // Because if the Rocket can not Launch we Do not need to check Land
            if(!(u.get(i).launch()))
                continue;

            if(!(u.get(i).land()))
                continue;
            i++;
        }
        
        // we will return the cost of the Rockets
        return counter*u.get(0).cost;
    }
}
