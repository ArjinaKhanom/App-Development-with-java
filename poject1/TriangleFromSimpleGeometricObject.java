/*
 * Name: Arjina Khanom
 * Group Member: Russell Mia, Rakib 
 * App. Development with Java
 * Assignemnt -1
 */

package project1;

/*
 * The formula in calculating 
 * the area of a triangle is A = (base * height)/2 0r A = 0.5 * base * height;
 * while Perimeter = base + height + hypotenuse.  
 * 
 */

public class TriangleFromSimpleGeometricObject extends SimpleGeometricObject {
		private double base=1;
		private double height=1;
		private double hypotenuse=1;
		
		public TriangleFromSimpleGeometricObject() { }
		
		public TriangleFromSimpleGeometricObject(
		  double width, double height) {
			this.base = base;
			this.height = height;
			this.hypotenuse = hypotenuse;
		}
		
		public TriangleFromSimpleGeometricObject(
		  double base, double height, double hypotenuse, String color, boolean filled) {
			this.base = base;
			this.height = height;
			this.hypotenuse = hypotenuse;
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
		
		/** Get hypotenuse */
		/**
		 * // calculate the hypotenuse // a2 + b2 = c2 or (a2+b2)/2 = c
		 hypotenuse = Math.pow(Math.pow(base, 2) + Math.pow(height, 2),0.5);
		**/
		
		public double getHypotenuse () {
			return Math.pow(Math.pow(base, 2) + Math.pow(height, 2),0.5);
		}	
		
		/** set a new hypotenuse*/
		public void setHypotenuse(double hypotenuse) {
			
			this.hypotenuse = hypotenuse;
		}
		
		/** get area or Return area, Area = (base*height)/2 */
		
		public double getArea() {
		return (base * height)/2; //0.5 * base * height;
		}
		
		
		/**calculate the Perimeter 
		 * perimeter = base + height + hypotenuse; // Perimeter = a + a + a = 3a
		 **/
		
		//get primeter or Return perimeter 
		public double getPerimeter() {
		return base + height + hypotenuse; 
		}
		
		// to string 
		public String toString() {
			   return super.toString() +
						  " and the Base is " + getBase() 
						  + " and the Height is " + getHeight()
						  + " and the hypotenuse is "+ getHypotenuse();
			}	
	}

