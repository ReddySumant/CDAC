
class LinkedList{
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
		Node(Node prev, int data, Node next){
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	Node head;
	
	LinkedList(){
		this.head = null;
	}
	
	public void addFront(int data){
		if(head==null){
			this.head = new Node(data);
		}
		else{
			Node newNode = new Node(null,data,head);
			head.prev = newNode;
			head = newNode;
		}	
	}
	
	
	
	public void addBetween(int idx, int data){
		if(idx==0){
			head = new Node(null,data,head);
		}
		else{
			Node pointer = this.head;
			int count = 0;
			while(pointer!=null){
				count++;
				if(count==idx){
					Node newNode = new Node(pointer, data, pointer.next);
					if(pointer.next != null) pointer.next.prev = newNode;
					pointer.next = newNode;
					break;
				}
				pointer = pointer.next;
			}
		}
	}
	
	public void addEnd(int data){
		if(head==null){
			head = new Node(data);
			return;
		}
		Node pointer = this.head;
		while(true){
			if(pointer.next==null){
				Node newNode = new Node(pointer,data,null);
				pointer.next = newNode;
				break;
			}
			pointer = pointer.next;
		}
	}
	
	
	public Node deleteNodeByIdx(int idx){
		Node element=null;
		
		if(head==null){
			System.out.println("List is empty");
			return element;
		}
		
		int count = 0;
		Node pointer = this.head;
		
		while(pointer!= null){
			if(count==idx){
				if(idx == 0){
					head = pointer.next;
				}
				element = pointer;
				if(pointer.next!=null) pointer.next.prev = pointer.prev;
				if(pointer.prev!=null) pointer.prev.next = pointer.next;
				break;
			}
			pointer = pointer.next;
			count++;
		}
		
		if(element==null){
			System.out.println("Index is greater that size of Linked List");
		}
		
		return element;
	}
	
	public Node deleteNodeByValue(int val){
		Node element = null;
		
		if(head==null){
			System.out.println("List is empty");
			return element;
		}
		
		if(val==head.data){
			element = head;
			head = head.next;
			return element;
		}

		Node pointer = this.head;
		
		while(pointer != null){
			if(val==pointer.data){
				if(pointer==head) head = pointer.next;
				if(pointer.prev !=null) prev.next = pointer;
				if(pointer.next != null) pointer.next.
				element = pointer;
				prev.next = pointer.next;
				return element;
			}
			pointer = pointer.next;
		}
		
		if(element == null){
			System.out.println("No matching element inside Linked list");
		}
		
		return element;
	}
	
	/*
	public void reverseList(){
		Node prev = null;
		Node curr = this.head;
		Node next = head.next;
		
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		this.head = prev;
	}*/
	
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
	
	public void printDataBackword(){
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			Node pointer = head;
			
			while(pointer.next!= null){
				pointer = pointer.next;
			}
			
			while(pointer!= null){
				System.out.print(pointer.data + " ");
				pointer = pointer.prev;
			}
			System.out.println();
		}
	}
}

public class DoublyLinkedList{
	public static void main(String... args){
		LinkedList ll = new LinkedList();
		ll.addFront(30);
		ll.addFront(20);
		ll.addFront(10);
		ll.addBetween(2,40);
		ll.addEnd(50);
		ll.deleteNodeByIdx(0);
		ll.printData();
		ll.printDataBackword();
		
		/*
		ll.addBetween(1,40);
		ll.addEnd(50);
		ll.printData();
		
		ll.deleteNodeByIdx(2);
		ll.deleteNodeByValue(30);
		ll.deleteNodeByValue(10);
		ll.deleteNodeByIdx(60);
		ll.printData();
		
		LinkedList l2 = new LinkedList();
		l2.deleteNodeByValue(10);
		l2.deleteNodeByIdx(60);

		ll.reverseList();
		ll.printData(); */
		
	}
	
}