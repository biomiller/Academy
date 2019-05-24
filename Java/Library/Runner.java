
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library myLibrary = new Library();
		
		Member member1 = new Member("John", 34, "123 New Street");
		
		myLibrary.addMember(member1);
		
		Book Book1 = new Book("1984", "9780141393049", "Penguin Classics", "New", "George Orwell", "Political");
		
		myLibrary.addNewItem(Book1);
		
		
		System.out.println(myLibrary.getMembers().getMemberById(1));
		

	}

}
