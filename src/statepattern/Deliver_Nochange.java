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
public class Deliver_Nochange implements State{
   public void doAction(VendingMachine context){
 System.out.println("Delivery occured due without any change");
 context.setState(this);
 } 
public String current()
 {
 return "Deliver no change";
 }
  
}
