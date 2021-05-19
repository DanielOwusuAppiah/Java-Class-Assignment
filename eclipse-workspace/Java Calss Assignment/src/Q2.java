
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Triangle tr=new Triangle();
    tr.side1=5;
    tr.side2=4;
    tr.side3=3;
    System.out.println("the area of the triangle is:"+tr.getArea()+"\n");
    System.out.println("the perimeter of the triangle is:"+tr.getPerimeter()+"\n");
	}
  
}
class Triangle {
	int side1;
	int side2;
	int side3;
	public double getArea() {
	  double sum = (side1+side2+side3)/2.0;
	  return Math.pow(sum*(sum-side1)*(sum-side2)*(sum-side3),.5);
	}
	public double getPerimeter() {
		return(side1+side2+side3);
	}
}
	