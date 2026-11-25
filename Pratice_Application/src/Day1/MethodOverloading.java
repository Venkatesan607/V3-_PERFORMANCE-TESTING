package Day1;

public class MethodOverloading {
	String getName(String name) {
		return name;
	}
	
	String getName(String name,int age) {
		return name + "Extra";
	}
}
