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
        int change;
        int Money;
        int totalDrinks=0;
       String name;
        boolean availability=true;
        //boolean change=true;
        //boolean currency=true;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
         if(totalDrinks<=0)
             availability=false;    
        System.out.println("Choose your drink : ");
        name=sc.nextLine();
        System.out.println("Insert Money : ");
        Money= sc.nextInt();
        
        Drinks drinks=new Drinks(name);
        drinks.setPrice();
        if(availability && drinks.getPrice() <=  Money)
        {
        change=Money-drinks.getPrice();    
        if(change>0)
        { 
          totalDrinks--;
          Deliver_Change state=new Deliver_Change();
          vendingMachine.setState(state);
          System.out.println(vendingMachine.getState().toString());
          System.out.println(drinks.name+"was delivered with change : "+change);
        }
         if(change==0)
        {
            totalDrinks--;
            Deliver_Nochange state=new Deliver_Nochange();  
          vendingMachine.setState(state);
          System.out.println(vendingMachine.getState().toString());
        System.out.println(drinks.name+"was delivered with no change .");
        } 
        
        }
        if(availability && drinks.getPrice() <=  Money)
        {
          NoDelivery_currency state=new NoDelivery_currency();  
          vendingMachine.setState(state);
          System.out.println(vendingMachine.getState().toString());
          System.out.println(drinks.name+"was not delivered due to insufficient amount of money .");
          break;
        }
          if(!(availability))
        {
          NoDelivery_inventory state=new NoDelivery_inventory();  
          vendingMachine.setState(state);
          System.out.println(vendingMachine.getState().toString());
          System.out.println(drinks.name+"was not delivered due to insufficient inventory .");
          break;
         }
        
    }
 sc.close();
}
}