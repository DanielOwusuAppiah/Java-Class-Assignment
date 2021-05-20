package inheritance;

class Member {
	String name;
	int age;
	String number;
	String address;
	double salary;
	
	public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member {
	String specialization;
}

class Manager extends Member {
	String department;
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee mp = new Employee();
		mp.name ="Daniel Owusu";
		mp.age=25;
		mp.number = "0244169831";
		mp.address="P.O. Box  PMB 44, Tema";
		mp.salary= 1740.50;
		mp.specialization="Data Scientist";
		
		Manager md = new Manager();
		md.name ="Daniel Owusu Appiah";
		md.age=33;
		md.number = "0550411414";
		md.address="P.O. Box  PMB 444, Tema";
		md.salary= 3400.55;
		md.department="Operations";
		
		System.out.println("==========Employee's Information===============");
		System.out.println("-----------------------");
		
		System.out.println("Name: " + mp.name + "Age: "+ mp.age + "Tel Number:" +  mp.number + "Address:"+ mp.address + "Salary: $" + mp.salary + "Speciatialization:"+ mp.specialization);

		System.out.println("==========Manager's Information===============");
		System.out.println("-----------------------");
		
		System.out.println("Name:" +md.name+ "Age: "+md.age+ "Tel Number:"+md.number+ "Address:"+md.address+ "Salary: $"+md.salary+ "Department:"+md.department);

	}

}
