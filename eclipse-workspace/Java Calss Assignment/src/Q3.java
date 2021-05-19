
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Rectangle r1 = new Rectangle();
      Rectangle r2 = new Rectangle();
      r1.insert(4, 5);
      r2.insert(5, 8);
      r1.calculateArea();
      r2.calculateArea();
	}

}
class Rectangle {
	int length;
	int width;
	void insert(int l, int w) {
		length =l;
		width = w;
	}
	void calculateArea() {System.out.println(length * width);}
}