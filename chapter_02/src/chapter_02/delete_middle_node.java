package chapter_02;

import java.util.LinkedList;

/**
 * 
 * Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, 
 * given only access to that node.
 * 
 * EXAMPLE
 * lnput:the node c from the linked lista->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e- >f
 * 
 * @author jordanprescott
 *
 */
public class delete_middle_node {

	public static void main(String[] args) {
		
		middleNodeRemoved(5);
		
	}
	
	public static void middleNodeRemoved(Integer n) {

		LinkedList<Integer> linky_listy = new LinkedList<>();
	
		linky_listy.add(1);
		linky_listy.add(5);
		linky_listy.add(9);
		linky_listy.add(12);
		
		linky_listy.remove(linky_listy.indexOf(n));
		

	}

}
