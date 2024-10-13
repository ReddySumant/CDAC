import java.util.*;

class DQueue{
	private int[] arr;
	private int front;
	private int rear;
	private int size;
	
	DQueue(int size){
		this.size = size;
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isEmpty(){
		return front == -1;
	}
	
	public boolean isFull(){
		return ((front == 0 && rear == size-1) || front == rear + 1));
	}
	
	void insertFront(int ele){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		if(isEmpty()){
			this.front = 0;
			this.rear = 0
		}else if(front==0){
			front = size-1;
		}
	}
	
	public void insertFront(int ele){
		if(isFull()){
			System.out.println("Queue is full");
		}
		else if(isEmpty()){
			this.front = 0;
			this.rear = 0;
		}
		else if(front==0){
			front = size-1;
			arr[front] = ele;
		}else{
			front--;
			this.arr[front] = ele;
			System.out.println(ele + " is inserted");
		}
	}
	
	public void insertRear(int ele){
		if(isFull()){
			System.out.println("Queue is full");
		}
		else if(isEmpty()){
			this.front = 0;
			this.rear = 0;
		}
		else if(rear==size-1){
			rear = 0;
			arr[rear] = ele;
		}else{
			rear++;
			this.arr[rear] = ele;
			System.out.println(ele + " is inserted");
		}
	}
	
	public void removeFront(){
		if(isEmpty()){
			System.out.println("Queue is already empty");
			return;
		}
		else if(front==rear){
			front = -1;
			rear = -1;
		}
		else if(front==size-1){
			System.out.println(ele + " is deleted from queue");
			front = 0;
		}
		else{
			int ele = this.arr[this.front];

			System.out.println(ele + " is deleted from queue");
			front++;
		}
	}
	
		public void removeRare(){
		if(isEmpty()){
			System.out.println("Queue is already empty");
			return;
		}
		else if(front==rear){
			front = -1;
			rear = -1;
		}
		else if(rear==0){
			System.out.println(ele + " is deleted from queue");
			front = size-1;
		}
		else{
			int ele = this.arr[this.rare];

			System.out.println(ele + " is deleted from queue");
			rare--;
		}
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
		DQueue queue = new DQueue(5);
	}
}