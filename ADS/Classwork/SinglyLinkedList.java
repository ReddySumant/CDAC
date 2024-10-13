
class LinkedList{
	
	class Node{
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
	
	private Node head;
	
	LinkedList(){
		this.head = null;
	}
	
	public void addFront(int data){
		if(head==null){
			this.head = new Node(data);
		}
		else{
			Node newNode = new Node(data,this.head);
			this.head = newNode;
		}	
	}
	
	public void addBetween(int idx, int data){
		if(idx==0){
			head = new Node(data,head);
		}
		else{
			Node pointer = this.head;
			int count = 0;
			while(pointer!=null){
				count++;
				if(count==idx){
					Node newNode = new Node(data, pointer.next);
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
	
	public Node deleteNodeByIdx(int idx){
		Node element=null;
		
		if(head==null){
			System.out.println("List is empty");
			return element;
		}
		
		int count = 1;
		Node prev = null;
		Node pointer = head;
		
		while(pointer.next != null){
			if(count==idx){
				if(idx==0){
					head = head.next;
				}
				
				element = pointer;
				if(prev != null) prev.next = pointer.next;
				break;
			}
			prev = pointer;
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
		Node prev = null;
		
		while(pointer != null){
			if(val==pointer.data){
				element = pointer;
				prev.next = pointer.next;
				return element;
			}
			prev = pointer;
			pointer = pointer.next;
		}
		
		if(element == null){
			System.out.println("No matching element inside Linked list");
		}
		
		return element;
	}
	
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
	}
	
	public void middleElement(){   //Two pointer approach
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		Node slow = head;    //Slowpointer
		Node fast = head;    //Fastpointer
		
		while(true){
			fast = fast.next.next;
			if(fast==null){
				break;
			}else if(fast.next==null){
				slow = slow.next;
				break;
			}
			slow = slow.next;
		}
		
		System.out.println("Middle element is: "+ slow.data);
		
		return;
	}
	
	public boolean isLoop(){
		if(head == null){
			System.out.println("List is empty");
			return false;
		}
		
		Node slow = head;    //Slowpointer
		Node fast = head;    //Fastpointer
		
		while(fast != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast){
				return true;
			}
		}
		
		return false;
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

public class SinglyLinkedList{
	public static void main(String... args){
		LinkedList ll = new LinkedList();
		ll.addFront(30);
		ll.addFront(20);
		ll.addFront(10);
		
		ll.addBetween(1,40);
		ll.addEnd(50);
		ll.addEnd(60);
		ll.printData();
		
		/*
		ll.deleteNodeByIdx(2);
		ll.deleteNodeByValue(30);
		ll.deleteNodeByValue(10);
		ll.deleteNodeByIdx(60);
		ll.printData();
		
		LinkedList l2 = new LinkedList();
		l2.deleteNodeByValue(10);
		l2.deleteNodeByIdx(60);
		*/
		//ll.reverseList();
		ll.middleElement();
		System.out.println(ll.isLoop());
		
		
	}
	
}