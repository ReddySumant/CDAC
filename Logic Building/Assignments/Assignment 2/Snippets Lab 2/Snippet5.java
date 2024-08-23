/*public class Snippet5 { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 

no error occured but the overloaded main method did not got executed
yes, we can define multiple main methods but JVM only executes the original main method by default but not the overloaded one.
So, to execute overloaded methods of main, we must call them from the original main method. */

public class Snippet5 { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 Snippet5.main(1);
 } 
 public static void main(int args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 
