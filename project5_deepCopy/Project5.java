/**
 *Name: Arjina Khanom
 *CST3613
 *Project-5 
 * 
 * Question: (Revise the MyStack class) 
 * and Rewrite the MyStack class in Listing 11.9 to perform a deep copy of the list field.**/

package project5Correction;
public class Project5 {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyStack stack = new MyStack();

		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));

		System.out.println(stack);
		System.out.println("Clone The Stack");
		MyStack stack2 = (MyStack)stack.clone();
		//System.out.println(stack);
		stack.pop();
		stack.peek();
		stack2.push(new Integer(5));
		System.out.print("Stack List:");
		System.out.println(stack);
		System.out.print("Stack2 List");
		System.out.println(stack2);
		System.out.println("Compare the two List: " + (stack == stack2));
	}
}