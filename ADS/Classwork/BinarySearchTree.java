
class BST{
	class Node{
		Node left;
		Node right;
		int data;
		
		Node(int data){
			this.left = null;
			this.right = null;
			this.data = data;
		}
	}
	
	Node root;
	
	BST(){
		this.root = null;
	}
	
	public Node insert(Node root, int key){
		if(root==null){
			root = new Node(key);
			return root;
		}
		if(key<=root.data)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;
	}
	
	public void insertData(int key){
		if(this.root == null){
			this.root = new Node(key);
			return;
		}
		insert(this.root, key);
	}
	
	public Node delete(Node root, int key){
		if(root==null){
			return root;
		}
		if(key<root.data)
			root.left = delete(root.left,key);
		else if(key>root.data)
			root.right = delete(root.right,key);
		
		else{
			if(root.left==null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.data = minValue(root.right);
			root.right = delete(root.right, root.data);
		}
		
		return root;
		
	}
	
	private int minValue(Node node){
		int min = 0;
		while(node!=null){
			min = node.data;
			node = node.left;
		}
		return min;
	}
	
	public void deleteData(int key){
		delete(this.root, key);
	}
	
	public void printData(){
		inOrder(this.root);
		System.out.println();
	}
	
	public void inOrder(Node node){
		if(node==null){
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
		
	}
}

public class BinarySearchTree{
	public static void main(String[] args){
		BST tree = new BST();
		
		tree.insertData(50);
		tree.insertData(30);
		tree.insertData(80);
		tree.insertData(100);
		tree.insertData(20);
		
		tree.printData();
		
		tree.deleteData(100);
		tree.deleteData(120);
		
		tree.printData();
		
		System.out.println(tree.root.data);
		
	}
}