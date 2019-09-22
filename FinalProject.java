
package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class FinalProject {
    
    public static void main(String[] args) throws FileNotFoundException {
    
    File phase_1 =new File("D:\\MyGithub\\Udacity-OOP in Java\\phase-1.txt");
    File phase_2 =new File("D:\\MyGithub\\Udacity-OOP in Java\\phase-2.txt");
    Simulation simulator =new Simulation ();
    
    ArrayList<? extends Rocket> t   = simulator.loadU1(simulator.loadItems(phase_1));
    int budgetphase1U1=simulator.runSimulation((ArrayList<Rocket>) t);
    t   = simulator.loadU1(simulator.loadItems(phase_2));
    int budgetphase2U1=simulator.runSimulation((ArrayList<Rocket>) t);
    t   = simulator.loadU2(simulator.loadItems(phase_1));
    int budgetphase1U2 =simulator.runSimulation((ArrayList<Rocket>) t);
    t   = simulator.loadU2(simulator.loadItems(phase_2));
    int budgetphase2U2 =simulator.runSimulation((ArrayList<Rocket>) t);
    System.out.println("Total budget for U1 rockets : "+(budgetphase1U1+budgetphase2U1));
    System.out.println("Total budget for U2 rockets : "+(budgetphase1U2+budgetphase2U2));
    
    
    
    
    
    
    
    
    
    
    
    
             
     
               
    }
 }
