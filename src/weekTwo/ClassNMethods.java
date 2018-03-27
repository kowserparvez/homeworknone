package weekTwo;

public class ClassNMethods {
	
	int ageHero = 25; 
	String nameHero = "Jon Snow";
	
	static int ageHeroine = 21;
	static String nameHeroine = "Daenerys Targaryen";
	
	public void snowTime() {
		System.out.println("Name of the hero is "+nameHero+ " and he is "+ageHero+" years Old.");
	}
	public static void daenerysTime() {
		System.out.println("Name of the hero is "+nameHeroine+ " and he is "+ageHeroine+" years Old.");
	}
	public static void main(String[] args) {
		
		ClassNMethods obj = new ClassNMethods();
		System.out.println("****************************non static**********************");
		obj.snowTime();
		System.out.println("************************************************************");
		// or can show the same thing like this 
		System.out.println("Name of the hero is "+obj.nameHero+ " and he is "+obj.ageHero+" years Old.");
		System.out.println("********************************static**********************");
		daenerysTime();
		// or can show the same thing like this 
		System.out.println("************************************************************");
		ClassNMethods.daenerysTime();
	}
	

}
