
/*Name: Arjina Khanom
 * CST3613
 * Project - 4
 * Due: Tuesday, February 18, 2020 at 6:00 PM
 * 
 * (The Colorable interface) Design an interface named Colorable with avoid method named howToColor().
 *  Every class of a colorable object mustimplement the Colorable interface. 
 * Modify the RectangleFromSimpleGeometricObject class that extends SimpleGeometricObject and implements Colorable.
 * Implement howToColor to display the message "Color inside of rectangle". 
 * Write a test program in project4.java that creates an array of five RectangleFromSimpleGeometricObject . 
 * For each object in the array, invoke its howToColor method if it is colorable.
 */

package project4;


//RectangleFromSimpleGeometricObject.java (modified)

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject implements Colorable {

    private double width;

    private double height;

    public RectangleFromSimpleGeometricObject() {

    }

    public RectangleFromSimpleGeometricObject(double width, double height) {

         this.width = width;

         this.height = height;

    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {

         this.width = width;

         this.height = height;

         setColor(color);

         setFilled(filled);

    }

   

    public double getWidth() {

         return width;

    }

   

    public void setWidth(double width) {

         this.width = width;

    }

   

    public double getHeight() {

         return height;

    }

   

    public void setHeight(double height) {

         this.height = height;

    }

   

    public double getArea() {

         return width * height;

    }

    public double getPerimeter() {

         return 2 * (width + height);

    }

    /**

    * implementing howToColor method of Colorable interface

    */

    @Override

    public void howToColor() {

         System.out.println("Color inside of rectangle.");

        

    }

}


