import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// Print the sum, difference, and product of two complex numbers by creating a class
		// named 'Complex' with separate methods for each operation whose real and imaginary
		// parts are entered by the user. Please find the implementation of an operation for your
		// understanding.
		// public static Complex divide (Complex a, Complex b){
		// return new Complex((a.real/b.real),(a.imag/b.imag));
		
		int a, b, c, d;
		Scanner dan = new Scanner(System.in);
 
		System.out.print("Enter the first real number: ");
		a = dan.nextInt();
		System.out.print("Enter the second real number: ");
		b = dan.nextInt();
		System.out.print("Enter the first imaginary number: ");
		c = dan.nextInt();
		System.out.print("Enter the second imaginary number: ");
		d=dan.nextInt();
		
		System.out.print("=========================="+ "\n");
		
		Complex rel= new Complex(a,b);
		Complex ima= new Complex(c,d);
	
		Complex sm = Complex.sum(rel,ima);
		Complex di = Complex.diff(rel, ima);
		Complex pr = Complex.prod(rel, ima);
		
		System.out.print("difference" + "\n");di.printComplex();
		System.out.print("addition" + "\n");sm.printComplex();
		System.out.print("product" + "\n");pr.printComplex();
	}

}

class Complex {
	int r,i;
	public Complex(int R, int I) {
		r=R;
	    i=I;
	}
	public static Complex diff(Complex a, Complex b) {
		return new Complex((a.r-b.r),(a.i-b.i));
	}
	public static Complex sum(Complex a, Complex b) {
		return new Complex((a.r+b.r),(a.i-b.i));
	}
	public static Complex prod(Complex a, Complex b) {
		return new Complex(((a.r * b.r)-(a.i * b.i)),((a.r*b.i)+(a.i*b.r)));
	}
	public void printComplex() {
		if (r==0 && r!=0) {
			System.out.print(r);
		}
		else {
			System.out.print(r +"+"+i+"i"+ "\n");
		}
	}
}