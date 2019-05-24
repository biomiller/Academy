import java.util.HashMap;

public class Inventory {
	
	private HashMap <Integer,Item> items;
	
	public Inventory() {
		this.items = new HashMap <Integer,Item>();		
	}

	
	
	public HashMap <Integer,Item> addItem(Item item){
		items.put(item.getId(),item);
		return items;
	}
	
	public HashMap <Integer,Item> removeItem(Item item){
		items.remove(item.getId(),item);
		return items;
	}
	
	public Item getItemById(int id){
		items.get(id);
		return items.get(id);
	}


	public HashMap<Integer, Item> getItems() {
		return items;
	}

	public void setItems(HashMap<Integer, Item> items) {
		this.items = items;
	}
	

}
