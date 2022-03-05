/**
 * Name: Christopher Park
 * Teacher: Mr Lee
 * Date: Mar 01 2022
 * Description:
 * Create 1 humans
 * Create 1 vegetable
 * Create 3 cookies (use each of the constructors)
 * One of the cookies should be packaged
 * Person should try to eat packaged cookie
 * Person should try to eat too much of a vegetable
 * Person should eat a cookie and gain energy
 */

public class Park_Christopher_OOQuiz1 {
   public static void main (String []args) {

    Human human1 = new Human ("Chris", 70, 50);

    Vegetable lettuce = new Vegetable ("Lettuce", 10, 100);

    Cookie chipsAhoy = new Cookie("ChipsAhoy", 250, 68, false);
    Cookie oreo = new Cookie("Oreos", 200, 150, false);
    Cookie chocolate = new Cookie("Chocolate", 300, 150, true);

    human1.eat(chocolate);   
    human1.eat(lettuce, 999); 
    human1.eat(oreo);      

    System.out.println("Weight: " + human1.getWeight());
    System.out.println("Energy Level: " + human1.getEnergyLevel());

   }

}