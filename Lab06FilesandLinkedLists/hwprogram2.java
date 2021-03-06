package HW06FilesandLinkedLists;
import java.util.*;
import java.io.*;
public class Problem2 {
	
	public static File inputFile;
	public static Scanner fileScanner; // scans the file
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			inputFile = new File("/Users/andrewyip/Downloads/Breakfast.txt"); // input file // reading into eclipse
			fileScanner = new Scanner(inputFile); // scans the file
			
			// INSTANTIATE AN OUTPUT FILE STREAM AND LINK IT TO THE OUTPUT FILE
			
			readFile();
			} catch (FileNotFoundException e) {
			System.out.println("Error - This file could not be found.");
			} finally {
			fileScanner.close();
			}

	}
	
	public static void readFile() { // method for reading the file
		String s = "";
		int countS = 0;
		System.out.print("What you had for breakfast:\n");
		
		while(fileScanner.hasNext()) { // this reads the file
		s = fileScanner.next(); 
		System.out.print(s + " ");
		if (s.toLowerCase().charAt(s.length()-1) == 's') // just counting the # of s in the input
		countS++;
		}
		
		System.out.print("\n\nNumber of words ending in s in the Breakfast.txt file: " + countS);
		}
}

