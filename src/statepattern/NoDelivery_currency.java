/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author lenovo pc
 */
public class NoDelivery_currency implements State{
  public void doAction(VendingMachine context){
 System.out.println("Delivery couldn't occur due to insufficient currency");
 context.setState(this);
 } 
public String current()
 {
 return "NoDelivery currency state";
 }
   
}
