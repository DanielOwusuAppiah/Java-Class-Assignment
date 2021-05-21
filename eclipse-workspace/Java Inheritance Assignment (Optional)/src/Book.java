
public class Book {
	   // The private instance variables
	   private String name;
	   private Authour author;
	   private double price;
	   private int qty;
	 
	   /** Constructs a Book instance with the given author */
	   public Book(String name, Authour author, double price, int qty) {
	      this.name = name;
	      this.author = author;
	      this.price = price;
	      this.qty = qty;
	   }
	 
	   // Getters and Setters
	   /** Returns the name of this book */
	   public String getName() {
	      return name;
	   }
	   /** Return the Author instance of this book */
	   public Authour getAuthor() {
	      return author;  // return member author, which is an instance of the class Author
	   }
	   /** Returns the price */
	   public double getPrice() {
	      return price;
	   }
	   /** Sets the price */
	   public void setPrice(double price) {
	      this.price = price;
	   }
	   /** Returns the quantity */
	   public int getQty() {
	      return qty;
	   }
	   /** Sets the quantity */
	   public void setQty(int qty) {
	      this.qty = qty;
	   }
}
