package weekTwo;

public class ConstructorHW {
	

	int age;
	String name;
	// just added this to check branch
	public ConstructorHW(){
		System.out.println("This is the Default Constructor");
	}
	public ConstructorHW(int age){
		this.age=age;
		System.out.println("This is the Constructor wiht one argument and got the "+age+".");
	}
	public ConstructorHW(int age, String bigName){
		this.age=age;
		name = bigName;
		System.out.println("This is the Constructor with multiple argument where name is "+name+" and age is "+age+"." );
	}
	
	public static void main(String[] args) {
		ConstructorHW ob1 = new ConstructorHW();
		ConstructorHW ob2 = new ConstructorHW(40);
		ConstructorHW ob3 = new ConstructorHW(40,"Tupac");


	}

}
