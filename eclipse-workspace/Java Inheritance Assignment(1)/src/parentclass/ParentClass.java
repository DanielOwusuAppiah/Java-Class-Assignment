package parentclass;

//  1. Create a class with a method that prints "This is parent class" and its subclass with
//   another method that prints "This is child class". Now, create an object for each of the
//   class and call
//  a. 1 - method of parent class by the object of the parent class
//  b. 2 - method of child class by the object of the child class
//  c. 3 - method of parent class by the object of the child class

 class  ParenClass {
	public void parentmethod() {
		System.out.println("This is parent class");
		
	}
	
}
class Childclass extends ParenClass {
	public void childmethod() {
		System.out.println("This is child class");
	}
}

public class ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParenClass m =new ParenClass();
		Childclass n= new Childclass();
		
		m.parentmethod();
		n.childmethod();
		n.parentmethod();

	}

}
