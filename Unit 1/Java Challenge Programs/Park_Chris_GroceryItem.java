/* 
Christopher Park
February 15, 2022
This program will format 2 grocery items and print them on a list. 
The names must not exceed 20 characters the price will not exceed $99.99.
*/

import java.util.*;

public class Park_Chris_GroceryItem
{
    public static void main(String[] args)
    {
        // Creating variables for items and their price
      String groceryItem1;
      String groceryItem2;
      double itemPrice1;
      double itemPrice2;
      int spaces1;
      int spaces2;
   
      Scanner sc = new Scanner(System.in);
   
      // Gets input for item1
      while(true) 
        {
            System.out.println("Enter Item 1: ");
            groceryItem1 = sc.nextLine();
    
            // Creates loop to ensure the item does not exceed 20 characters
            if (groceryItem1.length()<=20) {
                break;
            }
    
            // Maximum character length message
            else 
            {
                System.out.println("Maximum character length for items must be under 20");  
            }
        }
      
      // Gets input for item1 price
      while(true) 
      {   
            System.out.println("Enter the price of item 1: ");
            itemPrice1 = sc.nextDouble();
    
            // Creates loop to ensure the item does not exceed $100
            if (itemPrice1<100) {
                break;
            }
    
            // Maximum price message
            else { 
                System.out.println("Item price must be under $100");
                }
            }
      
         // Gets input for item2
      while(true) 
      {
            System.out.println("Enter Item 2: ");
            groceryItem2 = sc.next();

            // Creates loop to ensure that item does not exceed 20 characters
            if (groceryItem2.length()<=20) {
                break;
            }
    
            // Maximum character length
            else {
                System.out.println("Maximum character length for items must be under 20");
                }
            }

      // Gets input for item2 price
      while(true) 
      {
            System.out.println("Enter the price of item 2: ");
            itemPrice2 = sc.nextDouble();
    
            //Creates loop to ensure the item does not exceed $100
            if (itemPrice2<100) {
                break;
            }
    
            // Maximum price message
            else {
                System.out.println("Item price must be under $100");
            }
        }

      // Position of the grocery items
      if (itemPrice1<10) {
         spaces1 = -21;
      } 
            
      else {
         spaces1 = -20;
      }
      
      if (itemPrice2<10) {
         spaces2 = -21;
      } 
            
      else {
         spaces2 = -20;
      }
      
      // Output of grocery list
      System.out.printf("--------------------------%n");
      System.out.printf("%"+spaces1+"s", groceryItem1);
      System.out.printf("$%.2f %n", itemPrice1);
      System.out.printf("%"+spaces2+"s", groceryItem2);
      System.out.printf("$%.2f %n", itemPrice2);
      System.out.printf("--------------------------%n");
   
   sc.close();
   }
 
    
}




