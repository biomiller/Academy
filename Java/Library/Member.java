
public class Member {
	
	private int id;
	private static int idcounter = 1;
	private Inventory itemsLoaned;
	private String name;
	private int age;
	private String address;
	
	public Member(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.itemsLoaned = new Inventory ();
		this.id = idcounter++;
	}
	
	
	@Override
	public String toString() {
		return ("ID: " + id + " Name: " + name + " Age: " + age + " Address: " + address);
	}
	
	public Inventory loanItem(Item item) {
		itemsLoaned.addItem(item);
		return itemsLoaned;
	}
	
	public Inventory returnItem(Item item) {
		itemsLoaned.removeItem(item);
		return itemsLoaned;
	}
	
	
	
	
	
	
	
	
	
	

	public Inventory getItemsLoaned() {
		return itemsLoaned;
	}
	public void setItemsLoaned(Inventory itemsLoaned) {
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
