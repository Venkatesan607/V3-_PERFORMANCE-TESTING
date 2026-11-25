package Day1;

public class Demo {

	
	
	

	public static void main(String[] args) {
		System.out.println("hello world for demo class");
		
		DemoMethods person = new DemoMethods();
		
		System.out.println(person.myName());
		
		DemoMethods2 person1 = new DemoMethods2();
		System.out.println(person1.getNamesofag("Venkat"));
		
		MethodOverloading Mov = new MethodOverloading();
		
		System.out.println(Mov.getName("venkat"));;
		System.out.println(Mov.getName("Venkat",0));
		// -----------------------------------------//
		
		DemoMethods2 one = new DemoMethods2();
		MethodOverriding two = new MethodOverriding();
		
		System.out.println(one.getNamesofag("Venkat"));;
		System.out.println(two.getNamesofag("Venkat"));;
	}

}
