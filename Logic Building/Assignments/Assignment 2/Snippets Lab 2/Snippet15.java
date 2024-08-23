/*public class Snippet15 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 
Compile time error ": incompatible types: possible lossy conversion from double to int"
We can use type casting while performing operations in different data types
*/

public class Snippet15 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + (int)num2; 
 System.out.println(result); 
 } 
}