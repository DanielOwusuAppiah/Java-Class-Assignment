package inheritance;

class Rectangle {
	int length= 3;
	int width = 4;
	
	public int Rectangle(int l, int w) {
		length = l;
		width = w;
		return l * w;
	}
	public void printArea() {
		System.out.println(length*width);
	}
	public void printPerimeter() {
		System.out.println(2*(length + width));
	}
}


public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rectangle c = new Rectangle();
     
     System.out.print("The area of the rectangle with sides(3,4) is:");c.printArea();
     System.out.print("The perimeter of the rectangle with sides(3,4) is:");c.printPerimeter();
	}

}
