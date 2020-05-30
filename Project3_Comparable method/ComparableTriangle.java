/**Name: Arjina Khanom
 * CST3613
 * Project - 3
 * Due Date: Thursday, February 13, 2020 at 6:00 PM
 */

/* Question: Using your project 1 TriangleFromSimpleGeometricObject class, 
 * make that class comparable using the Interface we learned in the class.
 *  Test your object by creating array of TriangleFromSimpleGeometricObject classes 
 *  and soring them with java.util.Arrays.sort method.
 * 
 */



package project3;

public class ComparableTriangle extends Triangle 
implements Comparable<ComparableTriangle> {
/** Construct a ComparableTriangle with specified properties */
public ComparableTriangle(double base, double height) {
super(base, height);
}

//@Override // Implement the compareTo method defined in Comparable
public int compareTo(ComparableTriangle o) {
if (getArea() > o.getArea())
return 1;
else if (getArea() < o.getArea())
return -1;
else
return 0;
}

@Override // Implement the toString method in GeometricObject
public String toString() {
return super.toString() + " Area: " + getArea();
}
}