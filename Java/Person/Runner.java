
public class Runner {
		
	public static void main(String[] args){
		
		//Person john = new Person();
		//john.name = "John";
		//john.age = 27;
		//john.jobTitle = "Chef";
		// john.species = "Fish";
		
		//System.out.println(john.information());
		
		Person person1 = new Person("John", 33, "Doctor");
				
		Person person2 = new Person("Sarah", 41, "Lawyer");
		
		Person person3 = new Person("John", 27, "Chef");
		
		
/*		ArrayList <Person> peopleList = new ArrayList <Person> ();
		
		//peopleList.add(john);
		peopleList.add(person1);
		peopleList.add(person2);
		peopleList.add(person3);


		peopleList
			.stream()
			.forEach( person -> System.out.println(((Person) person).information()));
			
*/
		
		
		PersonManager testPeopleManager = new PersonManager();
		
		testPeopleManager.addPerson(person1);
		testPeopleManager.addPerson(person2);
		testPeopleManager.addPerson(person3);
		
		System.out.println(testPeopleManager.searchPerson("John"));
		testPeopleManager.searchPersonPrint("John");


		
	}
	
}