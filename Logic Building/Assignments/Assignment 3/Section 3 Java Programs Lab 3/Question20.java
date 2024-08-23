public class Question20 { 
 public static void main(String[] args) {
	int rows = 5;
	
	for(int i=rows; i>0; i--){
		for(int j=rows; j>i; j--){
			System.out.print(j+"*");
		}
		System.out.println(i);
	}
 }
}