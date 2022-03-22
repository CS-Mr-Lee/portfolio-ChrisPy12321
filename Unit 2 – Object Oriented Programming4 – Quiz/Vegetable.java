/**
 * Name: Christopher Park
 * Teacher: Mr Lee
 * Date: March 1 2022
 * Description: Vegtable
 */

public class Vegetable {

    /**
    Attributes
    Used to describe a object
     */
     
    /** 
     * the name of the vegetable 
     */
    private String name;

    /** 
     * the amount of calories of the vegetable
     */
    private int calories;

    /** 
     * the weight of the vegetable
     */
    private double weight;

    /**
    Constructor
     */
     
    public Vegetable() {
    }
     
    /**
     * Vegetable
     * @param name
     * @param calories
     * @param weight
     */

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

    /**
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
    
    /**
    Mutators
     */

    /**
     * Gets the amount of calories eaten
     * @return caloriesEaten
     */

    public int eaten(double weight) {
        if (weight > this.weight) {
        this.calories = -1;
    } else if (weight > 0 && weight < this.weight) { 
        this.calories = (int)((this.weight-weight)/this.weight)*this.calories;
        this.weight = this.weight - weight;
    } else {
        this.weight = 0;
    }
    return this.calories;
}

     public String toString(){
        return " Name: " + name + " Weight: " + weight + " Calories: " + calories;
        }   

}


