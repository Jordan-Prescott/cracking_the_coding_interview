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
		cast.add("Johnson");
		cast.add("Big Sues");
		cast.add("Dobbie");
		cast.add("Barny");
		cast.add("Nancy");
		
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
		
		// Runner technique to find middle object
		System.out.println(cast.get(middleObject(cast)));

	}
	
	
	/**
	 * 
	 * This method uses the runner technique to return the index of the middle
	 * object in a LinkedList.
	 * 
	 * @param cast LinkedList
	 * @return middle object of linked list
	 */
	public static int middleObject(LinkedList<String> cast) {
		
		int slow = 0;
		int fast = 1;
		
		while (fast < cast.size()) {
			
			slow++;
			fast += 2;
			
		}
		
		return slow;
		
	}

}
