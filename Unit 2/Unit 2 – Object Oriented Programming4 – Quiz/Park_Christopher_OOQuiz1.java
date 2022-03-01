/**
 * Name: Christopher Park
 * Teacher: Mr Lee
 * Date: March 1 2022
 * Description: OOQuizMain
 */

public class Park_Christopher_OOQuiz1 {
   public static void main (String [] args) { 

      /**
      Human One attributes, energy levels and sleep
      */
     
      Human humanOne = new Human("Clair", 62, 98, "female", 192); // create humanOne object
      System.out.println(humanOne.getName()); //outputs humanOne name
      System.out.println(humanOne.getName() + " is now " + humanOne.getWeight() + "kg and their energy level is at " + humanOne.getEnergyLevel() + "%."); //outputs the humanOne name, weight and energy level
      humanOne.run(5); //perform humanOne method run() with 5km
      System.out.println(humanOne.getName() + " is now " + humanOne.getWeight() + "kg and their energy level is at " + humanOne.getEnergyLevel() + "%."); //outputs the humanOne name, weight and energy level
      humanOne.sleep(10); //perform humanOne method sleep() with 10 hours
      System.out.println(humanOne.getName() + "'s energy level is at" + humanOne.getEnergyLevel() + "%."); //outputs the humanOne name and energy level
      System.out.println(humanOne.toString()); //perform humanOne method toString()
      System.out.println();

   }
}