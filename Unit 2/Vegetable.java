/**
 * Name: Christopher Park
 * Teacher: Mr Lee
 * Date: March 1 2022
 * Description: Vegtable
 */
 
import java.io.File;  // Import the class
import java.io.*;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files


public class Vegetable {

    /*
    Attributes
    Used to describe a object
     */
     
    /** the name of the vegetable */
    private String name;

    /** the amount of calories of the vegetable */
    private int calories;

    /** the weight of the vegetable */
    private double weight;

    /*
    Constructor
     */
     
    public Vegtable() {
    }
     
    public Vegetable(String name, int calories, double weight) {

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
     * get the vegetable name
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
     * changes the weight and calories of the vegetable, cannot be less than zero or greater than the original weight
     * @param newWeight expected new weight
     */

    public void setWeight(double newWeight) {
        // newWeight can not be bigger than the original weight. must be > 0
        if (newWeight > this.weight){
            this.weight = this.weight;  // do nothing
        } else if (newWeight < 0){      // can not be < 0
            this.weight = 0;
        } else if (newWeight == 0){     // if newWeight is 0
            this.weight = 0;
        } else {                        // all other weights
            this.weight = newWeight;
        }
    }

    public void setCalories(int newCalories) {
        // newCalories can not be greater than original calories or less than zero
        if (newCalories < this.calories) {
            this.calories = newCalories;        // set calories to the new calories
        } else if (newCalories < 0) {           // can not be < 0
            this.calories = 0;
        } else {
            this.calories = this.calories;      // do nothing
        }
    }

}


