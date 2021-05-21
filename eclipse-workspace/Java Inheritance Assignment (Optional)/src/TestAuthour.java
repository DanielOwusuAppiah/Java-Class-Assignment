
public class TestAuthour {

	public static void main(String[] args) {
	      // Test constructor and toString()
	      Authour dan = new Authour("Daniel Owusu Appiah", "danielowusuappiah26@gmail.com", 'm');
	      System.out.println(dan);  // toString()
	      //Tan Ah Teck (m) at teck@nowhere.com

	      // Test Setters and Getters
	      dan.setEmail("danielowusuappiah26@gmail.com");
	      System.out.println(dan);  // toString()
	      //Tan Ah Teck (m) at teck@somewhere.com
	      System.out.println("name is: " + dan.getName());
	      //name is: 
	      System.out.println("gender is: " + dan.getGender());
	      //gender is: m
	      System.out.println("email is: " + dan.getEmail());
	      //email is: teck@somewhere.com
	   }
	}

		

	
