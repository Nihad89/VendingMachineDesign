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
public class Drinks {
int price;
String name=new String("");
Drinks(String Name)
{
name=Name;
}
void setPrice(){
if(name.equals("Pepsi")){
price=15;
}
else if(name.equals("Fanta")){
price=16;
}
else if(name.equals("7up")){
price=17;
}
else
{
System.out.println("Not available");
price=99999099;
}
}
int getPrice()
{
return price;
}
}
