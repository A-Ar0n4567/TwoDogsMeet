/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;

import javax.swing.*;
/**
 *
 * @author aamir7110
 */
public class Dog {
 
    private boolean complete = false;
    
    private int age, aggression, hunger;
    private String name,breed;
    public Dog(){
    
        // get dog name and breed
        String nInput,bInput;
        
        nInput = JOptionPane.showInputDialog("Enter The Name of The Dog:");
        name = nInput;
        
        bInput = JOptionPane.showInputDialog("Enter The Breed of The Dog:");
        breed = bInput;
        
        setAge();
    }
    
    //set age
    private void setAge(){
    
        //set age to a random number
        double rand = Math.random() * 10;
        
        age = (int)rand;
        
        System.out.println(name+" is "+age+" Years Old");
        System.out.println(name+" is a "+breed);
        
        Aggression();
        
    }
    //set aggression
    public void Aggression(){
        //set aggression to a random number
        double rand = Math.random()*100;
        
        aggression = (int)rand;
         
    }
    
    //get or change aggression
    public double ChangeAggression(){
        String change;
        
        change = JOptionPane.showInputDialog(name+"'s aggression is "+aggression+". Do you want to change "+name+"'s aggresion?\n leave blank to keep the value or type in a different value");
        //check if value has been changed
        if(!change.equals("")){
            aggression = Integer.parseInt(change);
        }
        //print message depending on the value
        if(aggression > 50 && aggression <80){
            System.out.println(name+" is angry");
        }else if (aggression > 80){
            System.out.println(name+" is a very grumpy camper");
        }else {
            System.out.println(name+" is friendly");
        }
        
        Hunger();
        
        return aggression;
    }
    //set hunger
    public void Hunger(){
    //set hunger to a random value
        double rand = Math.random()*100;
        
        hunger = (int)rand;
        
    }
    //get or change hunger
    public double GetHunger(){
    
        String change;
        
        change = JOptionPane.showInputDialog(name+"'s hunger is "+hunger+". Do you want to change "+name+"'s hunger?\n leave blank to keep the value or type in a different value");
        //check if the value has been changed
        if(!change.equals("")){
            hunger = Integer.parseInt(change);
        }
        //print a message depending on the value
        if(hunger >= 50){
            System.out.println(name+" is hungry");
        }else if(hunger <50){
            System.out.println(name+" is not hungry");
        }
        Done();
        return hunger;
    }
    public boolean Done(){
    
        return true;
    }
}
