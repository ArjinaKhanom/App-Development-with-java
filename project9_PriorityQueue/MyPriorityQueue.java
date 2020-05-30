
/**
 * Name: Arjina Khanom
 * CST 3613
 * Assignment - 9
 * Due Date: Thursday, April 2, 2020 at 6:00 PM
 * Question: (Clone PriorityQueue) Define MyPriorityQueue class that extends PriorityQueue to implement the Cloneable interface 
 * and implement the clone() method to clone a priority queue. 
 * And, test you object clone method in your project9.java.
 * Submit MyPriorityQueue.java and project9.java.
 */

package project9;

import java.util.*;
import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {

	/* @Override the protected clone 
		method defined in the Object class */
	
	public MyPriorityQueue<E> clone() throws CloneNotSupportedException {
		
		   MyPriorityQueue<E> qtclone = new MyPriorityQueue<>();   
		   qtclone.addAll((MyPriorityQueue<E>)super.clone());
		   
		return qtclone;
	}

}
