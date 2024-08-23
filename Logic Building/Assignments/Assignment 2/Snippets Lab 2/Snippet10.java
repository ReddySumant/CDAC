/*public class Snippet10 { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
} 

Compilation error occured.
here, the methods are not defined staticly so, must be accessed by creating a instance of class. cannot access them directly
*/

public class Snippet10 { 
 public static void display() { 
 System.out.println("No parameters"); 
 } 
 public static void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
} 