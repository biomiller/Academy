import java.util.ArrayList;

public class Member  {
	
	private int id;
	private static int idcounter = 1;
	private ArrayList <Item> itemsLoaned;
	private String name;
	private int age;
	private String address;
	
	public Member(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.itemsLoaned = new ArrayList <Item> ();
		this.id = idcounter++;
	}
	
	

	public ArrayList<Item> getItemsLoaned() {
		return itemsLoaned;
	}
	
	public void setItemsLoaned(ArrayList<Item> itemsLoaned) {
		this.itemsLoaned = itemsLoaned;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
	
	

}
