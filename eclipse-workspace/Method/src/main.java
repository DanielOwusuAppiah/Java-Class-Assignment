import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		 System.out.print("Enter your name and age: ");
		  System.out.println(getName()+" "+ getAge());
		 

	}
   public static String getName() {
	   
	   
	   return new Scanner(System.in).nextLine();
	   
	   
	   
   }
   public static Double getAge() {
	
	   return new Scanner(System.in).nextDouble();
   }
}
