/**
 *Name: Arjina Khanom
 *CST3613
 *Project-5 
 * 
 * Question: (Revise the MyStack class) 
 * and Rewrite the MyStack class in Listing 11.9 to perform a deep copy of the list field.**/

package project5;
//import java.util.ArrayList;

public class MyStack implements Cloneable {
 
	private java.util.ArrayList list = new java.util.ArrayList();

public boolean isEmpty() {
 return list.isEmpty();
 }

 public int getSize() {
 return list.size();
 }
public void push(Object o){
	list.add(o);
}

public Object pop()
{
	Object o = list.get(getSize() -1);
	list.remove(getSize() -1);
	return o;
}

public Object peek(){
	return list.get(getSize() -1);
}
public int search (Object o)
{
	return list.lastIndexOf(o);
}
public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
//@Override
public String toString(){
	return "Stack: " +list.toString();
}

 }