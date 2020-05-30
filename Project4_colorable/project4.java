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

public class project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // creating an array of 5 RectangleFromSimpleGeometricObject objects

        RectangleFromSimpleGeometricObject array[] = new RectangleFromSimpleGeometricObject[5];

        // looping and filling array with 5 rectangles

        for (int i = 0; i < array.length; i++) {

            // using width=10*i and height=5*i (just for the sake of making

            // rectangles different

            array[i] = new RectangleFromSimpleGeometricObject(10 * i, 5 * i);

            //calling howToColor method

            array[i].howToColor();

        }

   }

	}


