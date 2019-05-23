
public class Book extends Item implements Updateable {

	private String author;
	private String genre;
	
	public Book(String name, int isbn, String publisher, String author, String genre) {
		super(name, isbn, publisher);
		this.author = author;
		this.genre = genre;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	}

	@Override
	public void read() {
		System.out.println("Title: " + this.getName() + " ISBN: " + this.getIsbn() + " Publisher: " + this.getPublisher() + " Author: " + this.author + " Genre: " + this.genre);
		
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
