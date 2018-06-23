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
void setDrink(String name)
{
this.name=name;
}
void setPrice(){
if(name.equalsIgnoreCase("pepsi")){
price=15;
}
else if(name.equalsIgnoreCase("fanta")){
price=16;
}
else if(name.equalsIgnoreCase("7up")){
price=17;
}
}
int getPrice()
{
return price;
}
}
