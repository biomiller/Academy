import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {
	
	public ArrayList <Person> personList;

	public PersonManager() {
		this.personList =  new ArrayList <Person> ();
	}
		
	public ArrayList<Person> addPerson(Person person1){
		personList.add(person1);
		return personList;	
	}
		
	public List<Person> searchPerson(String name) {
		return(personList
				.stream()
				.filter(p -> p.getName().equals(name))
				.collect(Collectors.toList())
				);
	}
	
	public void searchPersonPrint(String name) {
		System.out.println(personList
				.stream()
				.filter(p -> p.getName().equals(name))
				.collect(Collectors.toList())
				);
	}

}
