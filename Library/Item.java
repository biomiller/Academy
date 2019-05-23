
public abstract class Item {
	
	private int id;
	private static int idcounter = 1;
	private String name;
	private int isbn;
	private String publisher;
	
	
	
	public Item(String name, int isbn, String publisher) {
		this.id = idcounter++;
		this.name = name;
		this.isbn = isbn;
		this.publisher = publisher;		
	}

	
	
	public int getId() {
		return id;
	}
		
	public void setId(int id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	
	
}
