package noDuplicates;

public class MainApp {

	public static void main(String[] args) {
		
		
		NoDuplicateStringList test = new NoDuplicateStringList();
		
		//5 Element
		test.add("Hello");
		test.add("My");
		test.add("Name");
		test.add("Is");
		test.add("Hello");
		
		System.out.println("Gibt alle Elemente ohne Duplikate aus:");
		test.printAllElements();
		

	}

}
