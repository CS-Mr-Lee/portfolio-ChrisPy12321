/**
 * Name: Christopher Park
 * Teacher: Mr Lee
 * Date: March 1 2022
 * Description: OOQuizMain
 */

public class Park_Christopher_OOQuiz1 {
   public static void main (String [] args) { 

      Human humanOne = new Human("Chris", 65, 90); 
      System.out.println(humanOne.getName()); 
      System.out.println(humanOne.getName() + " is now " + humanOne.getWeight() + "kg and their energy level is at " + humanOne.getEnergyLevel() + "%."); 
      System.out.println(humanOne.getName() + " is now " + humanOne.getWeight() + "kg and their energy level is at " + humanOne.getEnergyLevel() + "% after running for 5km."); 
      System.out.println(humanOne.getName() + "'s energy level is at " + humanOne.getEnergyLevel() + "% after sleeping for 10 hours."); 
      System.out.println(humanOne.toString()); 
      System.out.println();

   }
}