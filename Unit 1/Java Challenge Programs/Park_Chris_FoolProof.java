/*
Christopher Park
February 15, 2022
This program will recieve inputs of numerators and denominators and find the quotient. If the user inputs 
characters that start with "q' or "Q" then the program will quit.
*/

import java.util.*;

public class Park_Chris_FoolProof {

    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);

        // Creating variables
        boolean exit = false;
        boolean correct = true;
        String numerator;
        String denominator;
        double numNumerator = 0;
        double numDenominator = 0;
        double answer; 
        
        // Creating loop
        while (exit == false) {
        
            // Getting user input
            System.out.print("Enter the numerator: ");
            numerator = input.next();
            
            // Checking for q or Q
            if (numerator.startsWith("q") || numerator.startsWith("Q")) {
                break;
            }
            
            // Trying to convert input to double
            try { 
                numNumerator = Double.parseDouble(numerator);
                }
            
                // Indicating that bad data was inputed
                catch (Exception e) { 
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                correct = false; 
            }
            
            // Indicating that good data was inputed
            if (correct == true) { 
                // Getting input for divisor
                System.out.print("Enter the divisor: ");
                denominator = input.next();
                
                try { 
                    numDenominator = Double.parseDouble(denominator);
                    
                    // Number cannot be divided by 0
                    if (numDenominator == 0) { 
                        System.out.println("You cant divide " + numNumerator + " by 0.");
                    }
                    
                    // Dividing and rounding the answer
                    if (numDenominator != 0) { 
                        answer = numNumerator / numDenominator; 
                        answer = Math.round(answer * 100); 
                        answer = answer / 100;
                        System.out.println(numNumerator + " / " + numDenominator + " is " + answer); 
                    }
                
                } 
                
                    // Indicating that bad data was inputed
                    catch (Exception e) { 
                    System.out.println("You entered bad data.");
                    System.out.println("Please try again.");
                    correct = false;
                }  
                                            
            }
                
            // Adding a space    
            System.out.println(""); 
        }
        
    }
     
}