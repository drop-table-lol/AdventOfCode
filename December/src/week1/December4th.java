package week1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/*
 * A new system policy has been put in place that requires all accounts to use a passphrase instead of simply a password. A passphrase consists of a series of words (lowercase letters) separated by spaces.

To ensure security, a valid passphrase must contain no duplicate words.

For example:

    aa bb cc dd ee is valid.
    aa bb cc dd aa is not valid - the word aa appears more than once.
    aa bb cc dd aaa is valid - aa and aaa count as different words.

 */




public class December4th {
	
	//get file
	//open file
	//read in line
		//use 2 for loops on a line
		//compare each item with all the next items
	//profit
	
	
	
	
	public static void main(String[] args) throws IOException {
		int answer = 0;
		int total = 0;
		boolean dub = false;
		try {
			//get file
            File f = new File("src/week1/december4th.txt");
            //open file
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            System.out.println("Reading file using Buffered Reader");

            //loop through file
            while ((readLine = b.readLine()) != null) {
            	total++;
            	dub = false;
            	String[] password = readLine.split(" ");
            	for (int i=0; i<password.length; i++)
            	{
            		if(dub == true)
            		{
            			break;
            		}
            		for (int j=i+1; j<password.length; j++)
            		{
            			if (password[i].equals(password[j]))
            			{
            				answer++;
            				dub = true;
            				break;
            			}
            		}
            	}
            	
            }

		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		answer = total - answer;
		System.out.println(total);
		System.out.println(answer);
	}
	
	

}
