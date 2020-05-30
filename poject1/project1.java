
/*
 * Name: Arjina Khanom
 * Group Member: Russell Mia, Rakib 
 * App. Development with Java
 * Assignemnt -1
 */

/**Add your own  TriangleFromSimpleGeometricObject Class into the project1 we did in the class.

The TriangleFromSimpleGeometricObject class should have following methods:

getArea(), getPerimeter(), toString()

toString() methods should print the parent class's toString() and your TriangleFromSimpleGeometricObject class attributes.
In your main(), you must create the Triangle class and test the printing.

Submit only TriangleFromSimpleGeometricObject.java and project1.java.**/

// due: Due Date: Tuesday, February 4, 2020 by 6:00 PM 
// https://javatutorialhq.com/java/example-source-code/basic/calculate-triangle-area-and-perimeter/


package project1;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGeometricObject G1 = new SimpleGeometricObject();	
		System.out.println(G1.toString());
		G1.setColor("Black");
		G1.setFilled(true);
		System.out.println(G1);

		TriangleFromSimpleGeometricObject  T1 = new TriangleFromSimpleGeometricObject();
		
		T1.toString();
		System.out.println(T1);
		// after setting the value 
		T1.setBase(5);
		T1.setHeight(5);
		T1.setHypotenuse(7);
		System.out.println("Area = "+ T1.getArea());
		System.out.println("Perimeter = "+ T1.getPerimeter());
		
		TriangleFromSimpleGeometricObject  T2 = 
				new TriangleFromSimpleGeometricObject (5.0, 5.1, 7.2,"Black",true);
		System.out.println(T2);
		
	}

}
