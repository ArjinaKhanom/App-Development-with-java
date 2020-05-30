
/**
 * Name: Arjina Khanom
 * CST 3613
 * Assignment - 11
 * Due Date: April 21, 2020
 * Question: Implement the body of 5 methods in the MyLinkedList.java attached. 
 * You will see below println for those methods you need implement in the file.
 * System.out.println("Implementation left as an exercise");
 * Only submit  MyLinkedList.java file and Project11.java file which you need to test your list (create, add, delete items). 
 */


package project11;


public class project11 {

	public static void main(String[] args) {
	
		// Create a list for strings
	    MyLinkedList<String> list = new MyLinkedList<String>();

	    // Add elements to the list
	    list.add("America"); // Add it to the list
	    System.out.println("(1) " + list);

	    list.add(0, "Canada"); // Add it to the beginning of the list
	    System.out.println("(2) " + list);

	    list.add("Russia"); // Add it to the end of the list
	    System.out.println("(3) " + list);

	    list.addLast("France"); // Add it to the end of the list
	    System.out.println("(4) " + list);

	    list.add(2, "Germany"); // Add it to the list at index 2
	    System.out.println("(5) " + list);

	    list.add(5, "Norway"); // Add it to the list at index 5
	    System.out.println("(6) " + list);

	    list.add(0, "Poland"); // Same as list.addFirst("Poland")
	    System.out.println("(7) " + list);

	    // Remove elements from the list
	    list.remove(0); // Same as list.remove("Poland") in this case
	    System.out.println("(8) " + list);

	    list.remove(2); // Remove the element at index 2, which is "Germany"
	    System.out.println("(9) " + list);

	    list.remove(list.size() - 1); // Remove the last element, which is "Norway"
	    System.out.print("(10) " + list + "\n(11) ");
	    
	    // if the list contains "France" then it will return true. 
	    System.out.println(list.contains("France"));
	    for (String s: list)
	      System.out.print(s.toUpperCase() + " ");

        // After clear the list, the list size will be zero. 
	    list.clear();
	    System.out.println("\nAfter clearing the list, the list size is " 
	      + list.size());
	  }

	}


