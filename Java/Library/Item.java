
public abstract class Item implements Updateable{
	
	private int id;
	private static int idcounter = 1;
	private String name;
	private String isbn;
	private String publisher;
	private String condition;
	
	
	
	public Item(String name, String isbn, String publisher, String condition) {
		this.id = idcounter++;
		this.name = name;
		this.isbn = isbn;
		this.publisher = publisher;	
		this.condition = condition;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static int getIdcounter() {
		return idcounter;
	}



	public static void setIdcounter(int idcounter) {
		Item.idcounter = idcounter;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getCondition() {
		return condition;
	}



	public void setCondition(String condition) {
		this.condition = condition;
	}

	
	

	
	
	
}
