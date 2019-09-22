package sanchez_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

	    int userNumber;
	    int tempVal;
	    int firstDigit, secondDigit, thirdDigit, fourthDigit;

	    // have the user input their desired userNumber
	    System.out.print("Enter your four digit number: ");
	    userNumber = scnr.nextInt();

	    // extract each digit and add conditions of adding and dividing.
	    fourthDigit = ((userNumber % 10) + 7) % 10;
	    userNumber = userNumber / 10;
	    thirdDigit = ((userNumber % 10) + 7) % 10;
	    userNumber = userNumber / 10;
	    secondDigit = ((userNumber % 10) + 7) % 10;
	    userNumber = userNumber / 10;
	    firstDigit = ((userNumber % 10) + 7) % 10;

	    tempVal = firstDigit;
	    firstDigit = thirdDigit;
	    thirdDigit = tempVal;

	    tempVal = secondDigit;
	    secondDigit = fourthDigit;
	    fourthDigit = tempVal;

	    // display encrypted integer
	    System.out.println("" + "Encrypted number: " + firstDigit + secondDigit + thirdDigit + fourthDigit);

	    Decrypt DecryptObject = new Decrypt();
	    DecryptObject.unlock();
	}

}
