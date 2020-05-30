

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


public class project9 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Create a string MyPriorityQueue and 4 state names
		MyPriorityQueue<String> q1 = new MyPriorityQueue<>();
		
		q1.offer("Oklahoma");
		q1.offer("Indiana");
		q1.offer("Georgia");
		q1.offer("Texas");
	
		
		// Display queues   
		System.out.println("Queue1: "+q1);   
		
		// Clone q1 to q2
		MyPriorityQueue<String> q2 = q1.clone();

		// Add 2 more state names to q1
		q1.offer("New York");
		q1.offer("New Jersey");

		
		// Remove 1 state from q2
		q2.remove();
		
		// Display queues
	     System.out.print("Queue1: ");
		while (q1.size() > 0) {
			
			System.out.print(q1.remove() + " ");
		}
		System.out.println();

		System.out.print("Queue2: ");
		while (q2.size() > 0) {
			System.out.print(q2.remove() + " ");
		}
		System.out.println();
	}
}
