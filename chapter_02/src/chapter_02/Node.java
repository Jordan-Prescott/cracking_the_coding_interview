package chapter_02;

public class Node {

	Node next = null;
	int data;
	
	public Node(int d) {
		data = d;
	}
	
	void appentToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
		
	}
	
	public String toString() {
        return "Data = " + this.data;
    }

}
