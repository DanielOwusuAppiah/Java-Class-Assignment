import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// Write a program to print the area of a rectangle by creating a class named 'Area' taking
		// the values of its length and breadth as parameters of its constructor and having a
		// method named 'returnArea' which returns the area of the rectangle. The length and
		// breadth of the rectangle are entered through the keyboard.

		Scanner dan = new Scanner(System.in);
		double l,w;
		System.out.print("Enter the length of the rectangle: ");
		l=dan.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		w=dan.nextDouble();
		Area ar = new Area(l,w);
		System.out.println("The area of the rectangle is: " +ar.getArea());
		
	}

}
class Area {
	double length, width;
	public Area(double l, double w) {
		length = l;
		width  = w;
	}
	public double getArea() {
		return length * width;
	}
}