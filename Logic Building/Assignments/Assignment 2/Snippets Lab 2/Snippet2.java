/*public class Snippet2{ 
 static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
The code throws run time error.
while defining main method, public keyword is not defined
Because of that, JRE cannot access and execute the main method and because of that, it is returning Main method not found in class Snippet2 as error.
to avoid this, we have to make main method public*/

public class Snippet2{ 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
}