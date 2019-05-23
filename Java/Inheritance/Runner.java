
public class Runner {
	
	public static void main (String[] args) {
		
		Bird Bird1 = new Bird(77,10,1,22,2,"Female");
		
		System.out.println(Bird1.getSex());
		
		Bird1.eat();
		Bird1.layEgg();
		Bird1.reproduce();
		
	}

}
