class BTree{
  static class Node{
    Node left = null;
    Node right = null;
    int data;
    
    Node(int data){
        this.data = data;
    }
    
    Node(Node left, int data, Node right){
        this.left = left;
        this.data = data;
        this.right = right;
    }
  }
  
  Node root;
  
  BTree(){
      root = null;
  }
  
  BTree(int val){
      root = new Node(val);
  }
  
}

public class Program{
    public static void main(String... args){
        BTree tree = new BTree();
        tree.root = new BTree.Node(10);
        BTree.Node n1 = new BTree.Node(20);
        tree.root.left = n1;
        BTree.Node n2 = new BTree.Node(30);
        tree.root.right = n2;
        
        System.out.println(tree.root.data);
        System.out.println(tree.root.left.data);
        System.out.println(tree.root.right.data);
    }
}