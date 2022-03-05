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

    Vegetable vegetable1 = new Vegetable ("Lettuce", 10, 100);

    Cookie cookie1 = new Cookie("ChipsAhoy", 25, 68, false);
    Cookie cookie2 = new Cookie("Oreos", 20, 90, false);
    Cookie cookie3 = new Cookie("Chocolate", 30, 50, true);

    human1.eat(cookie3, 10);   
    human1.eat(vegetable1, 999); 
    human1.eat(cookie2, 5);      

    System.out.println("Weight: " + human1.getWeight());
    System.out.println("Energy Level: " + human1.getEnergyLevel());

   }

}