import java.util.*;

class CQueue{
	private int[] arr;
	private int front;
	private int rear;
	private int size;
	
	CQueue(int size){
		this.size = size;
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isEmpty(){
		return front == -1;
	}
	
	public boolean isFull(){
		return ((rear +1) % size == front);
	}
	
	public void enqueue(int ele){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		
		if(isEmpty()){
			this.front = 0;
		}
		rear = (rear+1) % size;   //increment of rear
		this.arr[rear] = ele;
		System.out.println(ele + " is inserted");
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is already empty");
			return;
		}
		
		int ele = this.arr[this.front];
		front = (front+1) % size;
		System.out.println(ele + " is deleted from queue");
		if(front==(rear+1)%size){
			front = -1;
			rear = -1;
		}
		return;
	}
	
	@Override
	public String toString(){
		if(isEmpty()){
			return "Empty Queue";
		}
		String str = "";
		int i = front;
		while(i != rear){
			str += arr[i]+ " ";
			i = (i+1) % size;
		}
		str += arr[rear];
		return str;
	}
}

public class CircularQueue{
	public static void main(String... args){
		CQueue queue = new CQueue(5);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println(queue.toString());
		
		queue.dequeue();
		queue.enqueue(10);
		System.out.println(queue.toString());
		
		queue.dequeue();
		queue.enqueue(20);
		System.out.println(queue.toString());
		
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