/* 
Christopher Park
February 15, 2022
This program will return the smlalest angle value of the trangle by usin the inputed 2 sides and 1 angle.
*/

import java.util.*;

public class Park_Chris_SASTriangleSolver
{
    public static void main(String[] args)
    {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Creating variables for the sides and angels of the triange
        double side1;
        double side2;
        double angle1;

        // Sets input for side lengths and angles
        System.out.println("Enter side length 1: ");
        side1 = sc.nextDouble();

        System.out.println("Enter side length 2: ");
        side2 = sc.nextDouble();

        System.out.println("Enter angle in radians: ");
        angle1 = sc.nextDouble();

        System.out.println("The smallest angle of the triangle is : " + sasSolver(side1, side2, angle1) + " degrees");

    }   

    public static double sasSolver (double side1, double side2, double angle3) 
    {
        // Variables
        double side3;
        double angle1;
        double angle2;
        double sinLaw;
        double smallAngle;
        double angleInDegrees;
   
        // Finding the value of side3
        side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)-2*side1*side2*Math.cos(angle3));

        // Finding the value of angle1
        sinLaw = Math.sin(angle3)/side3;
        angle1 = Math.asin(sinLaw*side1);

        // Finding the value of angle2
        angle2 = Math.asin(sinLaw*side2);

        // Sorting to find the smallest angle
        if ((angle1 <= angle2) && (angle1 <= angle3)) 
        {
            smallAngle = angle1;
        }
   
        else if ((angle2 <= angle1) && (angle2 <= angle3)) 
        {
            smallAngle = angle2;
        }
   
        else 
        {
            smallAngle = angle3;
        }

        // Changing the smallest angle to degrees
        angleInDegrees = Math.toDegrees(smallAngle);
        return angleInDegrees;

      }

   }
       