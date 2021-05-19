
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		room room1 = new room();
		room1.setData(210, "Flat", 0, false);
		room1.displayData();
	}

}
class room {
	int roomno;
	String roomType; 
	float roomArea;
	boolean acMachine;
	
	void setData(int rno, String rt, float area, boolean ac) {
		roomno=rno;
	    roomType=rt;
	    roomArea=area;
	    acMachine=ac;
	}
	void displayData() {
		System.out.println("The room is :" +roomno);
		System.out.println("The room type is :" +roomType);
		System.out.println("The room area is :" +roomArea);
		String s= (acMachine)? "yes":"No";
		
		System.out.println("The A/C machine needed: " +s);
		
	}
}