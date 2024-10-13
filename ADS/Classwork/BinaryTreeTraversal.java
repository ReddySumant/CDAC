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
  
  public void inOrder(BTree.Node node){
      if(node==null){
          return;
      }
      inOrder(node.left);
      System.out.print(node.data + " ");
      inOrder(node.right);
      
  }
  
  public void preOrder(BTree.Node node){
      if(node==null){
          return;
      }
      System.out.print(node.data + " ");
      inOrder(node.left);
      inOrder(node.right);
      
  }
  
  public void postOrder(BTree.Node node){
      if(node==null){
          return;
      }
      inOrder(node.left);
      inOrder(node.right);
      System.out.print(node.data + " ");
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
        
        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
    }
}