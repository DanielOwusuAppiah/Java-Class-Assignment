package inheritance_4;

class Rectangle {
	int length;
	int width;
	
	public Rectangle(int l, int w) {
		length=l;
		width=w;
	}
	public void printArea() {
		System.out.println(length * width);
	}
	public void printPerimeter() {
		System.out.println(2*(length + width));
	}
}
    class Square extends Rectangle {
    	int side;
    	public Square(int s) {
    		super(s,s);
    	}
    }

public class Q4 {

	public static void main(String[] args) {
		
		Rectangle c = new Rectangle(3,4);
		c.printArea();
		c.printPerimeter();
		
		Square sq = new Square(3);
		sq.printArea();
		sq.printPerimeter();
		
		Square[]a=new Square[10];
		int k=5;
		for(int i=0;i<10;i++) {
			a[i]=new Square(k);
			k++;
		}
				
		for(int i=0;i<10;i++) {
			a[i].printArea();
			a[i].printPerimeter();
		}

	}

}
