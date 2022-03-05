/**
 * Name: Christopher Park
 * Teacher: Mr Lee
 * Date: March 1 2022
 * Description: Human
 */

public class Human {

  //* used to find the name of human */
  private String name;

  //* used to find the weight of human */
  private double weight;

  //* used to find the energy level of human */
  private int energyLevel;
  
  /*
  Constructor of Human    
  */

  public Human() {
  }    

  /**
   * Human
   * @param name
   * @param weight
   * @param energyLevel
   */

  public Human(String name, double weight, int energyLevel){
    
    //initializing the attributes
    this.name = name; 
    this.weight = weight;
    //energyLevel from 0 - 100
    if (energyLevel > 100){
       this.energyLevel = 100;
    } else if (energyLevel < 0){
       this.energyLevel = 0;
    } else {
       this.energyLevel = energyLevel;
    }

  }
    
  /**
  Description: Sets human energy level and ensures that it does not exceed 100 or go below 0
  @param int newEnergyLevel
  @return void
  */

  public void setEnergyLevel(int newEnergyLevel){

    //energyLevel from 0 - 100
    if (newEnergyLevel > 100){
       this.energyLevel = 100;
    } else if (newEnergyLevel < 0){
       this.energyLevel = 0;
    } else {
       this.energyLevel = newEnergyLevel;
    }
  }

  /**
  Gets the name of human
  @return the name of human
  */

  public String getName(){
    return this.name;
  }

  /**
  Gets the weight of humam
  @return the weight of human
  */

  public double getWeight(){
    return this.weight;
  }

  /**
  Gets the energy level of human
  @return the energy level of human
  */

  public int getEnergyLevel(){
    return this.energyLevel;
  }

  /**
  Description: Sets new name of human
  @param String newName
  @return void
  */

  public void setName(String newName){
    this.name = newName;      
  }

  /**
  Description: Sets new weight of human
  @param double newWeight
  @return void
  */

  public void setWeight(double newWeight){
    this.weight = newWeight;
  }

  /**
   Mutators
   */

  /**
  Description:Raises energyLevel by hours * 10%
  @param int hours
  @return void
  */

  public void sleep(int hours){
    if (energyLevel + (10*hours) > 100){
      energyLevel = 100;
    } else {
      energyLevel += (10*hours);
    }
  }

  /**
  Description: Loses energy decreases energyLevel by 8 per km, decreases weight by 0.001 per km
  @param double km
  @return void
  */

  public void run(double km){
    if ((energyLevel - (8*km) < 0)){
      energyLevel = 0;
    } else {
      energyLevel -= (8*km);        
    }
    
    if (weight - (0.001*km) < 0){
      weight = 0;
    } else {
       weight -= (0.001*km);
    }
  }

  /**
   * Eating Vegetable
   * @param veg
   * @param grams
   */

  public void eat(Vegetable veg, double grams) {              
    if (grams > this.weight) {
        System.out.println("I don’t have that much food");  
    } else if (grams < this.weight && grams > 0) {
        this.weight = this.weight + grams;               
        this.energyLevel = (int) ((veg.eaten(grams)/15)/this.energyLevel)+this.energyLevel;     
    } else {   
        grams = 0;
        this.weight = grams;               
    }
}
  
  /**
   * Eating cookie
   * @param food
   * @param grams
   */

  public void eat(Cookie food){            

    double foodinKg;
    foodinKg = food.getWeight() / 1000;

    int calories = food.getCalories();

    if (food.getIsPackaged()) {                            
        System.out.println("I can't eat the bag");
    } else {
        if (foodinKg > this.weight) {
            System.out.println("I don’t have that much food");  
        } else if (foodinKg > 0) {
            this.weight = this.weight + foodinKg;                 
            this.energyLevel = this.energyLevel + (int) (calories/15);     
        }
    }
}

  /**
  Returns all the attributes of the human in a String
  */

  public String toString(){
    return "Name: " + name + "\n" + "Weight: " + weight + "\n" + "EnergyLevel: " + energyLevel;
  }

}

