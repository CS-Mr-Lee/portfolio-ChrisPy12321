/*
Christopher Park
February 15, 2022
This program outputs the champion with the highest HP and the lowest armor.
*/

import java.io.*;

public class Park_Chris_ChampionFilter {

	public static void main(String[] args) {	
			
		try {
         
         // Input files
			FileReader inputfile = new FileReader("champions.json");
			BufferedReader br = new BufferedReader(inputfile);
			FileWriter outputFile = new FileWriter(new File("MaxChampStats.txt"));
			
         // Creating variables
			String highestHPChampion = null;
			String lowestArmorChampion = null;
         String currentChampionName = null;
         String currentLine;
			double highestHP = 0;
			double lowestArmor = 0;
			double currentArmor = 0;
			double currentHP = 0;

		   // Creating while loop
			while(true) {
				
            // Read line of file
				currentLine = br.readLine();

            // Exit loop
				if(currentLine == null) {
            
					inputfile.close();
					br.close();
					break;
				}

            // Storing the champion
				if(currentLine.contains("\"name\":")) {
					currentChampionName = currentLine.substring(13, currentLine.length() - 2);
				}	
				
				if(currentLine.contains("\"armor\":")) {
					currentArmor = Double.valueOf(currentLine.substring(15, currentLine.length() - 1));
				}
				
				if(currentLine.contains("\"hp\":")) {
					currentHP = Double.valueOf(currentLine.substring(12, currentLine.length() - 1));
				}
				
            // Setting the champion as lowest armor
				if(lowestArmor == 0) {
					lowestArmor = currentArmor;
				}
				
            // Updating the lowest armor
				if(currentArmor < lowestArmor) {
					lowestArmor = currentArmor;
					lowestArmorChampion = currentChampionName;
				}

            // Updating the highest armor
				if(currentHP > highestHP) {
					highestHP = currentHP;
					highestHPChampion = currentChampionName;
				}
				
			}

         // Outputing the champion with the highest HP and lowest armor
			outputFile.write("The champion with the highest HP is " + highestHPChampion + ", who has " + highestHP + " HP.\n");
			outputFile.write("The champion with the lowest armor is " + lowestArmorChampion + ", who has " + lowestArmor + " armor.");
			outputFile.close();
			
		} catch (IOException e) {
			System.out.println("Could not locate file.");
		}
	
	}
}