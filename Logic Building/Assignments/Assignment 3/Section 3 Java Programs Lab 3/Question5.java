public class Question5 { 
 public static void main(String[] args) {
	int first = 0, second = 1, num = 21;
	int third = 1;
	
	while(num>2){
		third = first+second;
		first = second;
		second = third;
		num--;
	}
	System.out.println(third);
 }
}