public class Snippet25 { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 

// In Java, you can use the switch statement with several primitive data types like int, char, and byte. However, it's important to note that switch does not work with float and double data types
//We can solve this problem by type casting the score variable into int