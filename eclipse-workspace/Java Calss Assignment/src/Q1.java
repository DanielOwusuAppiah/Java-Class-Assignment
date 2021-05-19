
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student();
     s1.roll_on = 2;
     s1.name = "John";
     System.out.println(s1.roll_on+ " " +s1.name);
	}

}
class Student {
	int roll_on;
	String name;
}