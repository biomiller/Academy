
public class Person {
	
	
	//private String species;
	private String name;
	private int age;
	private String jobTitle;
	
	public Person() {
		//species = "Human";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public Person(String name, int age, String jobTitle) {
		//System.out.println("You made a new human. Treat it well.");
		//this.species = "Human";
		this.name = name;
		this. age = age;
		this.jobTitle = jobTitle;
				
	}
	
	public String information() {
		return(name + " " + age + " " + jobTitle);
	}
	

	public String toString() {
		return(name + " " + age + " " + jobTitle);
	}
	
	
}


