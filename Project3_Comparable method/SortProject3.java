/**Name: Arjina Khanom
 * CST3613
 * Project - 3
 * Due Date: Thursday, February 13, 2020 at 6:00 PM
 */



package project3;


public class SortProject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableTriangle[] triangles = {
				new ComparableTriangle(3.4, 5.5),
				new ComparableTriangle(13.25, 55.4),
				 new ComparableTriangle(7.5, 35.3),
				 new ComparableTriangle(9.4, 20.4)};
				 java.util.Arrays.sort(triangles);
				 for (Triangle triangle: triangles) {
				 System.out.print(triangle + " ");
				 System.out.println();
				 }
	}

}
