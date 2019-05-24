
public class Book extends Item implements Updateable {

	private String author;
	private String genre;
	
	public Book(String name, String isbn, String publisher, String condition, String author, String genre) {
		super(name, isbn, publisher, condition);
		this.author = author;
		this.genre = genre;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	}
		
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


}
