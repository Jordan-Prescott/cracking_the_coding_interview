package sandbox;

import java.util.LinkedList;

public class linked_lists {

	public static void main(String[] args) {
		
		LinkedList<String> cast = new LinkedList<>();
		
		cast.add("Mark");
		cast.add("Jez");
		cast.add("Super hans");
		cast.add("Dobbie");
		cast.add("Gerrard");
		
		System.out.println(cast);
		
		// add entry to linked list in index 2 (this updates that next and previous of current entries)
		cast.add(2, "Sophie");
		System.out.println(cast);
		
		// removes last entry using the tail reference 
		cast.removeLast();
		System.out.println(cast);
		
		System.out.println(cast.get(4));
		System.out.println(cast.getFirst());
		System.out.println(cast.getLast());

		
		for(String character: cast) {
			System.out.println(character);
		}

	}

}
