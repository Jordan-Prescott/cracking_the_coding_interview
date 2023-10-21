package sandbox;

import java.util.Hashtable;

public class hash_tables {

	public static void main(String[] args) {
		
		// hashtable using integer as key
		Hashtable<Integer, String> cast = new Hashtable<>(10);
		
		cast.put(100, "Mark");
		cast.put(200, "Jez");
		cast.put(345, "Super hans ");
		cast.put(765, "Dobbie");
		cast.put(333, "Gerrard");
		
		for(Integer key: cast.keySet()) {
			System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + cast.get(key));
		}
		
		System.out.println();
		
		// same table but using string as key
		Hashtable<String, String> cast_2 = new Hashtable<>(10);
		
		cast_2.put("100", "Mark");
		cast_2.put("200", "Jez");
		cast_2.put("345", "Super hans ");
		cast_2.put("765", "Dobbie");
		cast_2.put("333", "Gerrard");
		
		for(String key: cast_2.keySet()) {
			System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + cast_2.get(key));
		}
		
		/**
		 * Output shows the different positions depending on what data type used as key.
		 * There are also two collisions in the first table and one in the second. These are
		 * resolved by linked lists in this bucket, however, its more efficient for each entry
		 * to have its own bucket.  
		 */
		 
		
	}

}
