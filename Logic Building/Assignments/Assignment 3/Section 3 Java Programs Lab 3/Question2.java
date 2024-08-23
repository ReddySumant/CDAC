public class Question2 { 
 public static void main(String[] args) {
		int num = 5;
		int factorial = 1;
		int i = num;
		while(i>1){
			factorial *=i;
			i--;
		}
		System.out.println(factorial);
	}
}