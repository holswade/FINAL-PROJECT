/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author lauren.holswade319
 */
public class Catworld {

    public static void main(String[] args) {
        Cat tabby = new Cat();
        tabby.age = "Age is 1 year old";
        tabby.size = "Fishy is very small";
        tabby.sleeping = true;
        tabby.climbing = true;  
        tabby.name = "Fishy";
           
        Cat sunny= new Cat();
        sunny.age = "Age is 5 years old";
        sunny.size = "Sunny is very big ";
        sunny.sleeping= false;
        sunny.climbing= false; 
        sunny.name= "Sunny";
        
        Cat missy = new Cat();
        tabby.age = "Age is 2 year old";
        tabby.size = "Missy is a normal size";
        tabby.sleeping = false;
        tabby.climbing = true;  
        tabby.name = "Missy";
        
        tabby.displayTabby();
        dispalyanyCatObject(tabby.name,tabby.age, tabby.size,tabby.sleeping,tabby.climbing);
        
        sunny.displaySunny();
        dispalyanyCatObject(sunny.name,sunny.age, sunny.size,sunny.sleeping,sunny.climbing);
        
        missy.displayMissy();
       
        dispalyanyCatObject(missy.name,missy.age, missy.size,missy.sleeping,missy.climbing);
        tabby.giveCatFood();
        tabby.dontGiveCatFood();
        
        
        
    }
    
     public static void dispalyanyCatObject(String name, String age, String size,boolean sleep, boolean climb){
        System.out.println("~~~~~~~~~~~~~What is "+name+" doing?~~~~~~~~~~~~~");
        System.out.println(age + " " +  size);
        System.out.println("The kitty sleeping? " + sleep);
        System.out.println("Did they Climb? " + climb);
        System.out.println("-----------------------------------------------");
    
    } // close displayanyCatObject
     
}// close 

