
/**
 * Name: Arjina Khanom
 * CST 3613
 * Assignment - 2
 * Tuesday, February 11, 2020 at 6:00 PM
 **/
/* Question: Create your own MyQueue class does following methods:

	1. offer(Obect o) same behavior as push() in MyStack class.

	2. Object poll() same behavior as pop() in MyStack class but it removes the item from the head of queue and it should return null if the Queue is empty.

	3. Object peek() same behavior as peek() in MyStack class but it returns the item from the head of queue.

	4. isEmpty() returns ture or false based on size of queue.

	5. getSize() returns size of queue.

	6. You must test this object in Project2.cpp with main() method.
 * */

package project2;

import java.util.ArrayList;


public class MyQueue {
	private ArrayList<Object> list = new ArrayList<>(); //An array list is created to store the elements in the stack
    
		public boolean isEmpty() { //returns ture or false based on size of queue.
			return list.isEmpty(); 
			}

		public int getSize() { //returns size of queue.
			return list.size(); 
			}
		
	
		public Object peek(){ // This one displays the first Item on the list and then removes it.
	        Object item1 = list.get(0);
	        System.out.println("Item 1 of the queue is " + item1);
	        return item1;  
	    }

		public Object poll(){ //this one removes the first item on the list
	        if (list.size() == 0)
	            return null;
	        else{
	            Object undo = list.remove(0);
	            return undo;
	        }                     
	    }

	// offer method: adds the specified element to the queue. 
		// it's like same behavior as push() of a stack	
		public void offer(Object o) { 
		 list.add(o);	
		}
	
	@Override
	public String toString() {
				return "The Queue is: " + list.toString()+".";
			 }
	 }
