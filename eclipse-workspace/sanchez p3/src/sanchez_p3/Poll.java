package sanchez_p3;

import java.util.Scanner;

public class Poll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	    final int NUM_ROWS = 5;
	    final int NUM_COLUMNS = 11;
	    
	    int i, j, choice;
	    int voter;

	    int maxPoints = 0, minPoints = 1000000, maxNumOfTopic = 0, minNumOfTopic = 0;

	    String[] topic = {"Political", "Food", "Environmental", "Technology", "Family" };
	    int[][] votes = new int[NUM_ROWS][NUM_COLUMNS];

	    //create a for loop for the 2-D array
	    for( i = 0;  i < 4; i++ )  {
	      for( j = 1; j < 10; j++ ) {
	        votes[i][j] = 0;
	      }
	    }//end 2-D array of forming table

	    System.out.print("How many voter(s) are present: ");
	    voter = scnr.nextInt();
	    
	    //have the counter start at 1
	    i = 1;
	    while( i <= voter ) {
	      for(j = 0; j < NUM_ROWS; j++ )  {
	        System.out.print("" + "Voter #" + i + ": " +  topic[j] + ": ");
	        choice = scnr.nextInt();
	        votes[j][choice] = votes[j][choice] + 1;
	      }
	      i++;
	    }//end while loop of voters voting

	    System.out.println(" ");
	    System.out.println("Topic " + "    Total Rating " + "    Average Rating");
	    //create a for loop to keep track of the points and number of responses.
	    int sum, counter;
	    for( i = 0; i < NUM_ROWS; i++ ) {
	      sum = 0;
	      counter = 0;

	      for( j = 1; j <= 10; j++ )  {
	        sum = sum + ( j*votes[i][j] );
	        counter = counter + votes[i][j];
	      }//end inner for loop

	      //create if conditions based on the total score of the topics
	      if( maxPoints < sum ) {
	        maxPoints = sum;
	        maxNumOfTopic = i;
	      }//end 1st if statement

	      if( minPoints > sum ) {
	        minPoints = sum;
	        minNumOfTopic = i;
	      }//end 2nd if statement
	    System.out.println(topic[i] + " " + sum + " " + (sum + 0.0) / counter);
	    }//end outer for loop

	    //display results
	    System.out.println(" ");
	    System.out.println("Topic with the most points " + "Total number of ratings");
	    System.out.println( topic[maxNumOfTopic] + "                     " + maxPoints);
	    System.out.println(" ");
	    System.out.println("Topic with the least points " + "Total number of ratings");
	    System.out.printf(topic[minNumOfTopic] + "                   " + minPoints);

	}

}
