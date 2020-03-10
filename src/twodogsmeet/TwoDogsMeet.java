 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;

/**
 *
 * @author aamir7110
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog = new Dog();
        Dog dog2;
        
        boolean done = dog.Done();
        double d1Aggression,d1Hunger,d2Aggression,d2Hunger;
        
        d1Aggression = dog.ChangeAggression();
        d1Hunger = dog.GetHunger();
       
        if(done == true){
            dog2 = new Dog();
            d2Aggression = dog2.ChangeAggression();
            d2Hunger = dog2.GetHunger();
            
            if(d1Aggression <= 50 && d2Aggression <=50){
                System.out.println("The dogs are friendly to eachother");
                
                if(d1Hunger <= 50 && d2Hunger <= 50){
                    System.out.println("The dogs are not hungry");
                }
            }
            if(d1Aggression >50 && d2Aggression >50){
                System.out.println("The dogs are aggressive towards one another");
                
                if(d1Hunger > 50 && d2Hunger > 50){
                    System.out.println("They eat eachother");
                }
            }
        }
    }   
}
