
/**
 * Name: Arjina Khanom
 * CST 3613
 * Assignment - 2
 * Tuesday, February 11, 2020 at 6:00 PM
 **/

package project2;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue qt = new MyQueue();
		System.out.println("(True/False).The Queue is empty. Ans: " + qt.isEmpty());
		System.out.println();
		qt.offer("10");
		qt.offer("5");
		qt.offer("15");
		qt.offer("31");
		System.out.println("(True/False).The Queue is empty. Ans: " + qt.isEmpty());
		System.out.println("The size of the Queue is " + qt.getSize()+".");
		System.out.println(qt.toString()); //print from toString method
		System.out.println();
		System.out.println("By using poll() method, we got the head of the Queue is " + qt.poll()+".");
		System.out.println(qt.toString()); 
		
		System.out.println("The head of the Queue is " + qt.peek()+".");// returns head of the queue
		System.out.println("The new head of the Queue is " + qt.poll()+".");//the head of this queue, or null if this queue is empty
		System.out.println(qt.toString()); //print from toString method
	 
		qt.offer("-39");
		qt.offer("-50");
		qt.offer("12");
		System.out.println("The head of the Queue is " + qt.peek()+".");
		System.out.println();
		System.out.println("After adding some new items; "+qt.toString());
		
	}

}
