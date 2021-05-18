
public class Q1 {

	public static void main(String[] args) {
		// Print the multiplication table of 15 using recursion
		
		int N=15;
		
		mul_table(N, 1);
				

	}
    static void mul_table(int N, int i) {
    	if(i>10)
    		return;
    	System.out.println(N+"*"+i+ "="+N*i);
    	mul_table(N,i+1);
    }
}
