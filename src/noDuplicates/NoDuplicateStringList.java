package noDuplicates;

import java.util.LinkedList;

public class NoDuplicateStringList {
	
	private LinkedList<String> list;

	
	//Standard-Constructor
	public NoDuplicateStringList() {
		super();
		this.list = new LinkedList<String>();
	}
	
	//Add the provided string to the LinkedList.
	public boolean add(String s) {
		
		
			if(!(list.contains(s))) {
				list.add(s);
				return true;
			
		}
		
		return false;
	}
	
	//Print all contents of the LinkedList to the console.
	public void printAllElements() {
		
		for(String ausgabe:list) {
			System.out.println(ausgabe);
		}
		
	}
	

}
