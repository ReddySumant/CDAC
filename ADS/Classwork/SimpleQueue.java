import java.util.*;
class Queue{
	private int[] arr;
	private int front;
	private int rear;
	private int size;
	
	Queue(int size){
		this.size = size;
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isEmpty(){
		return front == -1;
	}
	
	public boolean isFull(){
		return rear == size-1;
	}
	
	public void enqueue(int ele){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		
		if(isEmpty()){
			this.front = 0;
		}
		this.arr[++rear] = ele;
		System.out.println(ele + " is inserted");
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is already empty");
			return;
		}
		
		int ele = this.arr[this.front];
		System.out.println(ele + " is deleted from queue");
		
		front++;
		if(front==rear+1){
			front = -1;
			rear = -1;
		}
		
	}
	
	@Override
	public String toString(){
		if(isEmpty()){
			return "Empty Queue";
		}
		String str = "";
		
		for(int i=front; i<=rear; i++){
			str += this.arr[i] + " ";
		}
		return str;
	}
}

public class SimpleQueue{
	public static void main(String... args){
		Queue queue = new Queue(5);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println(queue.toString());
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		queue.dequeue();
		System.out.println(queue.toString());
		
		queue.isEmpty();
		queue.enqueue(5);
		System.out.println(queue.toString());
	
	}
}