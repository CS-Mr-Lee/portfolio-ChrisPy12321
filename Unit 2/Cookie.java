/**
 * Name: Christopher Park
 * Teacher: Mr Lee
 * Date: March 1 2022
 * Description: Cookie
 */
 
import java.util.*;

public class Cookie {

   /*
   Attributes
   */
      
   /** The name of the cookie */
   private String name;
   
   /** The weight of the cookie */
   private double weight;

   /** The amount of calories in the cookie */
   private int calories;
   
   /*
   Constructor
   */
   
    public Cookie() {
    }
     
    public Cookie(String name, int calories, double weight) {

        // initializing name
        this.name = name;     

        // initializing calories
        if (calories < 0) {
            this.calories = 0;
        } else {
            this.calories = calories;
        }

        // initializing weight
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }

    }

    /*
    Method
     */

    /**
     * get the cookie name
     * @return the vegetable name
     */
    public String getName() {
        return this.name;
    }

    /**
     * get the calories
     * @return the calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * get the weight
     * @return the weight
     */
    public double getWeight() {
        return this.weight;
    }
    
    /*
    Mutators
     */

    /**
     * Gets the amount of calories eaten
     * @return caloriesEaten
     */

    public void eaten(double weight) {
      if (weight > this.weight) {
      } else {
         int caloriesEAten = (weight/this.weight) + caloriesEaten;
         return caloriesEaten;
        
}

    /**
    Returns all the attributes of the cookie in a String
    */
  
    public String toString() {
    return " Name: " + name + " Weight: " + weight + " Calories: " + calories;
      
    
    }
    

