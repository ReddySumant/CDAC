/*public class Snippet13 { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} 

Run time exception occured.
NullPointerException is thrown when a program attempts to use an object reference that has the null value.
These are certain reasons for Null Pointer Exception as mentioned below: 

1.Invoking a method from a null object.
2.Accessing or modifying a null object’s field.
3.Taking the length of null, as if it were an array.
4.Accessing or modifying the slots of null objects, as if it were an array.
5.Throwing null, as if it were a Throwable value.
6.When you try to synchronize over a null object.*/

public class Snippet13 { 
 public static void main(String[] args) { 
 String str = "Sumant"; 
 System.out.println(str.length()); 
 } 
} 