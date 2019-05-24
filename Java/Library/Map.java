
public class Map extends Item implements Updateable {

	private String location;

	public Map(String name, String isbn, String publisher, String condition, String location) {
		super(name, isbn, publisher, condition);
		this.location = location;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
