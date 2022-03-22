/**
 * Name: Christopher Park
 * Teacher: Mr Lee
 * Date: March 1 2022
 * Description: Cookie
 */

public class Cookie {

    /** 
    Attributes
    */
       
    /** 
     * The name of the cookie 
     */
    private String name;
    
    /** 
     * The weight of the cookie 
     */
    private double weight;
 
    /** 
     * The amount of calories in the cookie 
     */
    private int calories;

    /** 
     * Indicates if packaged
     */
    private boolean isPackaged;
    
    /**
    Constructor
    */
    
    public Cookie() {
    }
      
    /**
     * Cookie
     * @param name
     * @param calories
     * @param weight
     */
 
    public Cookie(String name, int calories, double weight, boolean isPackaged) {
 
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
 
        // initializing packaged
        this.isPackaged = isPackaged;

    }
 
    /**
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
     
    /**
     * gets if packaged
     * @return if packaged
     */
    public boolean getIsPackaged() {
        return this.isPackaged;
    }
    
    /**
    Mutators
     */
 
    /**
     * Gets the amount of calories eaten
     * @return caloriesEaten
     */

     public void open() {
         isPackaged = false;
     }

     /**
      * eaten
      * @param weight
      * Verfies the calories and if packaged
      */
      
        public int eaten(double weight) {
 
            if(this.isPackaged) {
                this.isPackaged = true;
 
            if (weight > this.weight) {
                this.calories = -1;

    } else if (weight > 0 && weight < this.weight) { 

        this.calories = (int)((this.weight-weight)/this.weight)*this.calories;
        this.weight = this.weight - weight;

    } else {
        this.weight = 0;
    }
 
    } else {
        return -2;
    }
        return this.calories;
}
 
    /**
    Returns all the attributes of the cookie in a String
    */
   
    public String toString() {
        return " Name: " + name + " Weight: " + weight + " Calories: " + calories;
    }     
     
    }

     

 
 