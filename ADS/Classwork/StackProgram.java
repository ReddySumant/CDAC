import java.util.Arrays;

class Stack{
	private int length;
	int top;
	private int[] arr;

	Stack(int length){
		this.length = length;
		this.arr = new int[length];
		this.top = -1;
	}

	public boolean isEmpty(){
		return top<0;
	}

	public boolean isFull(){
		return top>length-1;
	}

	public boolean push(int i){
		if(top>=length-1){
			System.out.println("Stack overflow");
			return false;
		}
		arr[++top] = i;
		return true;
	}

	public int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top--];
	}

	public int peek(){
		return top<0 ? 0 : arr[top];
	}

	public void printStack(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return;	
		}
		show(this.top);
	}

	private void show(int index){
		if(index < 0){
			System.out.println();
			return;
		}
		System.out.print((char)arr[index]+ " ");
		show(index-1);
	}
}

public class StackProgram{
	public static void main(String... args){
		String str = "Sumant";
		Stack stack = new Stack(str.length());
		for(int i=0; i<str.length(); i++){
			stack.push(str.charAt(i));
		}
		String res = "";
		for(int i=0; i<str.length(); i++){
			res += (char)stack.pop();
		}
		System.out.println(res);
	}

	public static void main0(String... args){
		Stack stack = new Stack(5);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.printStack();
		System.out.println(stack.peek());
		System.out.println(stack.isFull());
		System.out.println(stack.pop());

		stack.printStack();
	}
}
