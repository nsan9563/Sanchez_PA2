package sanchez_p1;

import java.util.Scanner;

public class Decrypt {
	public void unlock()	{
		Scanner s = new Scanner(System.in);

	    //declare variables
	    int userNumber;
	    int firstDigit, secondDigit, thirdDigit, fourthDigit;
	    int tempVal;

	    //ask for user input integer
	    System.out.print("Enter your four digit number: ");
	    userNumber = s.nextInt();

	    //extract the digits to relocate them back to place
	    fourthDigit = userNumber % 10;
	    userNumber /= 10;
	    thirdDigit = userNumber % 10;
	    userNumber /= 10;
	    secondDigit = userNumber % 10;
	    userNumber /= 10;
	    firstDigit = userNumber % 10;

	    //swap digits back to their original spots
	    tempVal = thirdDigit;
	    thirdDigit = firstDigit;
	    firstDigit = tempVal;

	    tempVal = fourthDigit;
	    fourthDigit = secondDigit;
	    secondDigit = tempVal;

	    //decrypt digit based off conditions
	    fourthDigit = ((fourthDigit * 10) / 10) - 7;
	    userNumber /= 10;
	    thirdDigit = ((thirdDigit * 10) / 10) - 7;
	    userNumber /= 10;
	    secondDigit = ((secondDigit * 10) / 10) - 7;
	    userNumber /= 10;
	    firstDigit = ((firstDigit * 10) / 10) - 7;

	    //test fourth digit
	    System.out.println("" + "Decrypted number: " + firstDigit + secondDigit + thirdDigit + fourthDigit);
	}
}
