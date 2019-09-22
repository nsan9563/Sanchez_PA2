package sanchez_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	    
	    //first answer the problem in US standards

	    //declare variables
	    double weight;
	    double height;
	    double BMI;
	    String userInput;
	    char option;

	    //create a 2 choice prompt to have user find info in metric or US customary units
	    System.out.print("Select unit measurements: (A) for US or (B) for metric: ");
	    userInput = scnr.next();
	    option = userInput.charAt(0);

	    if( option == 'A' || option == 'a')  {
	      System.out.println("Enter your weight (lbs): ");
	      weight = scnr.nextDouble();
	      System.out.println("Enter your height (inches): ");
	      height = scnr.nextDouble();

	      //create math expression for BMI
	      BMI = (703 * weight) / (height * height);

	    }//end option A coding
	    else  {
	      //ask for the user input
	      System.out.println("Enter your weight (kg): ");
	      weight = scnr.nextDouble();
	      System.out.println("Enter your height (m): ");
	      height = scnr.nextDouble();

	      //create math expression for BMI
	      BMI = weight / (height * height);

	    }//end else condition

	    //display chart
	    System.out.println("Underweight <= 18.5");
	    System.out.println("Normal weight =  18.5-24.9");
	    System.out.println("Overweight = 25-29.9");
	    System.out.println("Obesity = BMI of 30 or greater");

	    System.out.println("---------------------------");
	    if(BMI < 18.5)  {
	      System.out.printf("Your BMI is: %.1f\n", BMI);
	      System.out.println("Underweight");
	    }
	    else if((18.5 <= BMI) && (BMI <= 24.9)) {
	      System.out.printf("Your BMI is: %.1f\n", BMI);
	      System.out.println("Normal weight");
	    }
	    else if((25.0 < BMI) && (BMI < 29.9)) {
	      System.out.printf("Your BMI is: %.1f\n", BMI);
	      System.out.println("Overweight");
	    }
	    else  {
	      System.out.printf("Your BMI is: %.1f\n", BMI);
	      System.out.println("Obesity");
	    }
	    System.out.println("---------------------------");

	}

}
