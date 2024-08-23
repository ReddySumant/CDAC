public class Question7 { 
 public static void main(String[] args) {
	int num = 1234;
	int result = 0;
	
	while(num>0){
		result += num%10;
		num = num/10;
	}
	System.out.println(result);
 }
}