import java.util.Scanner;
public class Q3 {

	public static void main(String args[]) {
		// Define a method to calculate the power of a number raised to another i.e. ab using
		//recursion where the numbers 'a' and 'b' are to be entered by the user.
		
		Scanner dan = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = dan.nextInt();
		System.out.println("Enter b : ");
        int b = dan.nextInt();
        System.out.println(power(a, b));
	}

    public static int power(int a, int b) {
    	if (b != 0) {
    		return(a * power(a,b-1));
    	}
    	else {
    		return 1;
    	}
    		
    }
    }
