/**
 *Name: Arjina Khanom
 *CST3613
 *Project-5 
 * 
 * Question: (Revise the MyStack class) 
 * and Rewrite the MyStack class in Listing 11.9 to perform a deep copy of the list field.**/

package project5;

public class project5 {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		MyStack st = new MyStack();
		st.push("1");
		st.push("5");
		st.push("7");
		st.push("9");
		System.out.println("Original Stack Elements");
		System.out.println(st.toString());
		System.out.println("After Deep copy of the stack elements ");
		System .out.println("Elements in the new Stack");
		MyStack stClone= (MyStack) st.clone();
		System.out.println(stClone);

	}

}
