
public class Journal extends Item implements Updateable  {

	private String field;


	public Journal(String name, String isbn, String publisher, String condition, String field) {
		super(name, isbn, publisher, condition);
		this.field = field;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
