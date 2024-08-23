public class Snippet23 { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 break;
 case 2: 
 System.out.println("Value is 2"); 
 break;
 case 3: 
 System.out.println("Value is 3"); 
 break;
 default: 
 System.out.println("Default case"); 
 } 
 } 
} 

//if break keyword not used, the instructions afterwords would also run.
// so it is necessary to insert break keyword to get out of case statement