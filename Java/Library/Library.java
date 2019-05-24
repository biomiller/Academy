
public class Library {
	
	private Inventory inItems;
	private Inventory outItems;
	private MemberManager members;
	
	
	public Library () {
		this.inItems = new Inventory ();
		this.outItems = new Inventory ();
		this.members = new MemberManager ();	
	}


	
	public Inventory addNewItem(Item i) {
		inItems.addItem(i);
		return inItems;
	}
	
	public Inventory permanentlyRemoveItem(Item i) {
		inItems.removeItem(i);
		return inItems;
	}
	
	
	public void loanItem(Item i, Member m) {
		inItems.removeItem(i);
		outItems.addItem(i);
		members.getMemberById(m.getId()).loanItem(i);
				
	}
	
	
	public void returnItem(Item i, Member m) {
		inItems.addItem(i);
		outItems.removeItem(i);
		members.getMemberById(m.getId()).returnItem(i);
				
	}
	
	public void addMember(Member m) {
		members.addNewMember(m);
	}
	
	public void removeMember(Member m) {
		members.addNewMember(m);
	}
	
		
	
	
	
	
	
	
	
	public Inventory getInItems() {
		return inItems;
	}

	public void setInItems(Inventory inItems) {
		this.inItems = inItems;
	}

	public Inventory getOutItems() {
		return outItems;
	}

	public void setOutItems(Inventory outItems) {
		this.outItems = outItems;
	}

	public MemberManager getMembers() {
		return members;
	}

	public void setMembers(MemberManager members) {
		this.members = members;
	}
	
	
	

}
