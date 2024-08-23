/*public class Snippet3 { 
 public static int main(String[] args) { 
 System.out.println("Hello, World!"); 
 return 0; 
 }
} 
Run Time Error
Every Java method must provide the return type. The Java main method return type is void because it doesn’t return anything. When the main method is finished executing, the Java program terminates, so there is no need for a returned object.
So we need to set return type as void for main method */

public class Snippet3 { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 }
} 