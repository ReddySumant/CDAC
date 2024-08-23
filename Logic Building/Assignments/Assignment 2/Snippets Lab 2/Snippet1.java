/*public class Main { 
 public void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 

The problem in code given was the main method is not defined static. 
main method is defined with static keyword so that it would become a class method and we can call it without creating an object of the class

So the updated code is: 
*/

public class Snippet1{ 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 