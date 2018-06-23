/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Scanner;

/**
 *
 * @author lenovo pc
 */
public class StatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VendingMachine vendingMachine=new VendingMachine();
        int totalDrinks=100;
        boolean availability=true;
        boolean change=true;
        boolean currency=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your drink : ");
        String drinks=sc.nextLine();
        System.out.println("Insert coin : ");
        String coin=sc.nextLine();
        
        if(availability && change)
        {
          Deliver_Change state=new Deliver_Change();  
          vendingMachine.setState(state);
          System.out.println(vendingMachine.getState().toString());
        }
         if((availability) && !(change))
        {
          Deliver_Nochange state=new Deliver_Nochange();  
          vendingMachine.setState(state);
          System.out.println(vendingMachine.getState().toString());
        } 
         if(!(availability) && !(currency))
        {
          NoDelivery_currency state=new NoDelivery_currency();  
          vendingMachine.setState(state);
          System.out.println(vendingMachine.getState().toString());
        }
          if(!(availability) && (currency))
        {
          NoDelivery_inventory state=new NoDelivery_inventory();  
          vendingMachine.setState(state);
          System.out.println(vendingMachine.getState().toString());
        }
    }
    
}
