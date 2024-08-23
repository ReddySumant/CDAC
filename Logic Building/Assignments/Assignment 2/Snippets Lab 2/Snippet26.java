public class Snippet26 { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
}

// No two case constants in the same switch can have identical values. the compiler would get confused between two cases and would give the compilation error "error: duplicate case label".