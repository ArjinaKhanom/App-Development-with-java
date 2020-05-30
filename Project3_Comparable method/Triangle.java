/**Name: Arjina Khanom
 * CST3613
 * Project - 3
 * Due Date: Thursday, February 13, 2020 at 6:00 PM
 */


package project3;


public class Triangle extends SimpleGeometricObject {
	private double base=1;
	private double height=1;
	private double side1=1;
	private double side2=1;
	//private double hypotenuse=1;
	
	
	public Triangle() { }
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public Triangle(
	  double base, double height, String color, boolean filled) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		setColor(color);
		setFilled(filled);
	}
	
	// getArea(), getPerimeter(), toString()
	
	/** Return width */
	public double getBase() {
	return base;
	}
	
	/** Set a new Base */
	public void setBase(double base) {
	this.base = base;
	}
	
	/** Return height */
	public double getHeight() {
	return height;
	}
	
	/** Set a new height */
	public void setHeight(double height) {
	this.height = height;
	}
	
	public double getside1() {
		return side1;	
	}
	public void setside1(double side1) {
		this.side1 =side1;
	}
	public double getside2() {
		return side2;	
	}
	public void setside2(double side2) {
		this.side1 =side2;
	}
	
	/** get area or Return area, Area = (base*height)/2 */
	
	public double getArea() {
	return (base * height)/2; //0.5 * base * height;
	}
	
	
	/**calculate the Perimeter 
	 *  // Perimeter = a(side1) + a(side2) + a(side3) = 3a
	 **/
	
	//get primeter or Return perimeter 
	public double getPerimeter() {
	return base + side1 + side2; 
	}
	
	// to string 
	public String toString() {
		   return super.toString() +
					  " and the Base is " + getBase() 
					  + " and the Height is " + getHeight();
				
		}	
}

