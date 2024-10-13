class LinkedList{
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	
	Node head;
	
	LinkedList(){
		this.head = null;
	}

	public void addEnd(int data){
		if(head==null){
			head = new Node(data);
		}
		Node pointer = this.head;
		while(true){
			if(pointer.next==null){
				Node newNode = new Node(data);
				pointer.next = newNode;
				break;
			}
			pointer = pointer.next;
		}
	}
	
	
	public void printData(){
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			Node pointer = head;
			
			while(pointer!= null){
				System.out.print(pointer.data + " ");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
}

public class MergeLinkedLists{
	public static void merge(LinkedList l1, LinkedList l2){
		Node node1 = l1.head;
		Node node2 = l2.head;
	}
	public static void main(String... args){
		LinkedList l1 = new LinkedList();
		l1.addEnd(10);
		l1.addEnd(20);
		l1.addEnd(30);
		
		LinkedList l2 = new LinkedList();
		l2.addEnd(11);
		l2.addEnd(21);
		l2.addEnd(31);
		
		l1.printData();
		l2.printData();
		
	}
}