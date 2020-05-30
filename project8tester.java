/**
 * Name: Arjina Khanom
 * CST 3613
 * Assignment - 8
 * Due Date: Tuesday, March 3, 2020 at 6:00 PM
 * Question: (Distinct elements in ArrayList ) Write the following method that returns a newArrayList.
 * The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */



package project8;

import java.util.ArrayList;
import java.util.Arrays;

public class project8tester {
	
	    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
	       
	    	ArrayList<E> newList = new ArrayList<>();
	    	
	        for(int i = 0; i < list.size(); ++i) {
	            if(!newList.contains(list.get(i))) {
	                newList.add(list.get(i));
	            }
	        }
	        return newList;
	    }

	    public static void main(String[] args) {
	    	//Arraylist with Integer type
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(3);
	        numbers.add(5);
	        numbers.add(6);
	        numbers.add(3);
			
	        System.out.println("Original list: " + numbers);
	        System.out.println("List after removing duplicates: " + removeDuplicates(numbers));
	        System.out.println();
	        
            //Arraylist with String type with different ways to put list in the method.
	        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Arjina", "Nicolas", "Bobi", "Derick","Bobi", "John", "Bobi", "Derick"));
	        System.out.println("Original list: " + strings);
	        System.out.println("List after removing duplicates: " + removeDuplicates(strings)); 
	        System.out.println();
	        
	      //Arraylist with Double type
	        ArrayList<Double> doubles = new ArrayList<Double>(Arrays.asList(14.0, 24.4, 14.0, 42.13, 25.6, 14.0, 25.5));
	        System.out.println("Original list: " + doubles);
	        System.out.println("List after removing duplicates: " + removeDuplicates(doubles));
	        
	        
	    }
	}
