
public class TestBook {
	   public static void main(String[] args) {
		      // We need an Author instance to create a Book instance
		      Authour dan = new Authour("Daniel Owusu Appiah", "danielowusuappiah26@gmail.com", 'm');
		      System.out.println(dan);  // Author's toString()
		      //Daniel Owusu Appiah (m) at danielowusuappiah@gmail.com

		      // Test Book's constructor and toString()
		      Book dummyBook = new Book("Java for beginnners", dan, 10, 150);
		      System.out.println(dummyBook);  // Book's toString()
		      //'Java for beginners' by Daniel Owusu Appiah (m) at danielowusuappiah@gmail.com

		      // Test Setters and Getters
		      dummyBook.setPrice(10);
		      dummyBook.setQty(150);
		      System.out.println("name is: " + dummyBook.getName());
		      //name is: Java for beginners
		      System.out.println("price is: " + dummyBook.getPrice());
		      //price is: 10.0
		      System.out.println("qty is: " + dummyBook.getQty());
		      //qty is: 150
		      System.out.println("author is: " + dummyBook.getAuthor());  // invoke Author's toString()
		      //author is: Daniel Owusu Appiah (m) at danielowusuappiah@gmail.com
		      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
		      //author's name is: Daniel Owusu Appiah
		      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
		      //author's email is: danielowusuappiah@gmail.com
		      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
		      //author's gender is: m

		      // Using an anonymous Author instance to create a Book instance
		      Book moreDummyBook = new Book("Java for more dummies",
		            new Authour("Kwame Owusu", "kwameowusu@gmail.com", 'm'), // an anonymous Author's instance
		            61.6, 21);
		      System.out.println(moreDummyBook);  // Book's toString()
		      //'Java for more dummies' by Peter Lee (m) at peter@nowhere.com
		   }
		}


