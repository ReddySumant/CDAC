class DLinkedList{
	static class Node{
		Node prev;
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node head;
	
	DLinkedList(){
		this.head = null;
	}
	
}

public class DoublyLinkedListClassMethod{
	public static void addFirst(int data, DLinkedList.Node head){
		if(head==null){
			DLinkedList.Node node = new DLinkedList.Node(data);
			return;
		}
		DLinkedList.Node node = new DLinkedList.Node(data);
		node.prev = null;
		node.next = head;
		head.prev = node;
		head = node;
		
	}
	
	public static void display(DLinkedList.Node head){
		if(head==null){
				System.out.println("List is empty");
		}
		else{
			DLinkedList.Node pointer = head;
			DLinkedList.Node p=null;	
			while(pointer!= null){
				System.out.print(pointer.data + " ");
				p = pointer;
				pointer = pointer.next;
			}
			System.out.println();
			
			while(p!= null){
				System.out.print(p.data + " ");
				p = p.prev;
			}
			System.out.println();
		}
		
	}
	
	public static void main(String... args){
		DLinkedList ll = new DLinkedList();
		
		DLinkedList.Node head = new DLinkedList.Node(10);
		addFirst(100,head);
		display(head);

	}
}