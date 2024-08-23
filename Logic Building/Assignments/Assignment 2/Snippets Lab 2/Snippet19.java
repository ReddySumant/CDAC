/*public class Snippet19 { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 

The arithmetic exception base class is java.lang.ArithmeticException, which is the child class of java.lang.RuntimeException, which in turn is the child class of java.lang.Exception.
it is thrown at runtime when we try to divide a number by zero
*/
public class Snippet19 { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a / b; 
 System.out.println(result); 
 } 
}