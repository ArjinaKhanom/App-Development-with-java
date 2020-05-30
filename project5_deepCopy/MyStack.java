/**
 *Name: Arjina Khanom
 *CST3613
 *Project-5 
 * 
 * Question: (Revise the MyStack class) 
 * and Rewrite the MyStack class in Listing 11.9 to perform a deep copy of the list field.**/




package project5Correction;

import java.util.ArrayList;
public class MyStack implements Cloneable {
	private ArrayList<Object> list = new ArrayList<Object>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override 
	public Object clone() throws CloneNotSupportedException {
		MyStack myStackClone = (MyStack)super.clone();
		myStackClone.list = copyList();
		return myStackClone;
	}

	private ArrayList<Object> copyList() {
		ArrayList<Object> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) 
			newList.add(list.get(i));
		return newList;
	}

	@Override 
	public String toString() {
		return " " + list.toString();
	}
}