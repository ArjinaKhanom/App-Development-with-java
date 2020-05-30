/**
 * Name: Arjina Khanom
 * CST 3613
 * Assignment - 10
 * Due date: Tuesday, April 14, 2020 at 6:00 PM
 * Question: (Count the occurrences of words in a text file) Rewrite Listing 23.9 to read the text from a text file. 
 * The text file is passed as a command-line argument. Words are delimited by whitespace, punctuation marks (,;.:?), 
 * quotation marks ('"),and parentheses. 
 * Count words in case-insensitive fashion (e.g., consider Good and good to be the same word). 
 * The words must start with a letter. Display the output in alphabetical order of words, 
 * with each word preceded by its occurrence count.
 * 
 */


package project10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class project10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sample example 21.4 and 21.9 in 10th edition text book and page 809, 815
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("(File path example: C:\\Users\\arjin\\Desktop\\input.txt)");
	     System.out.print("Enter the file path and press enter: ");
	        // my file path is below
	        // C:\Users\arjin\Desktop\input.txt
	     
	     File file = new File(input.next());
	     
	     if (!file.isFile()) {
	          System.out.println(file + " is not a file.");
	        }
	        
	     String[] words;
	     
	    try (BufferedReader in = new BufferedReader(new FileReader(file))) {
	    	StringBuilder buffer = new StringBuilder(10000);
	            String s;
	       while ((s = in.readLine()) != null)
	           buffer.append(s).append("\n");
	           words = buffer.toString().split("[0-9]+|\\W+");
	        } 
	    catch (IOException ex) {
	         words = new String[1];
	         System.out.println("Error opening file...");
	         System.exit(0);
	        }

	   // Creating a TreeMap to hold words as key and count as value
	        Map<String, Integer> map = new TreeMap<>();

	        for (String wordone : words) {
	            String key1 = wordone.toLowerCase();

	            if (key1.length() > 0) {
	                if (!map.containsKey(key1)) {
	                    map.put(key1, 1);
	                    } 
	                else {
	                    int value = map.get(key1);
	                    value++;
	                    map.put(key1, value);
	                }
	            }
	        }

	    // Display key and value for each entry
	        map.forEach((k, v) -> System.out.println(k + "\t" + v));

	}

}
