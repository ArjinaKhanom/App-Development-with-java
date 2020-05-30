/*Name: Arjina Khanom
 * CST3613
 * Project - 4
 * Due: Tuesday, February 18, 2020 at 6:00 PM
 * 
 * (The Colorable interface) Design an interface named Colorable with a void method named howToColor().
 *  Every class of a colorable object mustimplement the Colorable interface. 
 * Modify the RectangleFromSimpleGeometricObject class that extends SimpleGeometricObject and implements Colorable.
 * Implement howToColor to display the message "Color inside of rectangle". 
 * Write a test program in project4.java that creates an array of five RectangleFromSimpleGeometricObject . 
 * For each object in the array, invoke its howToColor method if it is colorable.
 */




package project4;

//Colorable.java (interface)
public interface Colorable {
	public void howToColor();

}
