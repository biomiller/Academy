
public abstract class Item implements Updateable{
	
	private int id;
	private static int idcounter = 1;
	private String name;
	private int isbn;
	private String publisher;
	
	
	
	public Item(String name, int isbn, String publisher) {
		this.id = idcounter++;
		this.setName(name);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
