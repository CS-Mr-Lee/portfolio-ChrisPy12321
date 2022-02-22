/* 
Christopher Park
February 15, 2022
This program encrypts the line of code entered.
*/

// Scanner
import java.util.Scanner;

public class Park_Chris_Encryption {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // Settings variables  
        String originalLine = ""; 
        String encryptedLine = "";
        String[] words;

        // Getting user input
        System.out.println("Please enter a line of code to be encoded: ");
        originalLine = sc.nextLine();

        // Splitting word
        words = originalLine.split(" ");

        // Loop for each set of words
        for (String currentWord : words) {
            String newWord = "";            
            newWord += currentWord.charAt(currentWord.length()-1);    

            for (int i = 1; i < currentWord.length() -1; i++) {
                if (currentWord.charAt(i) > 124) {
                    newWord += (char)((currentWord.charAt(i) + 2)%126 + 31);    
                }
                else {
                    newWord += (char)(currentWord.charAt(i) + 2);    
                }
            }

            // Variable for encrypted line
            newWord += currentWord.charAt(0);       
            newWord += " ";                     
            encryptedLine += newWord;    
        }
        
        // Outputs the encrypted line
        System.out.println(encryptedLine.substring(0, encryptedLine.length()-1));

        sc.close();
    }

}