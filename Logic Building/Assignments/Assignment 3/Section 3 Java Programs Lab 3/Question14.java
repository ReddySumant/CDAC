public class Question14 { 
 public static void main(String[] args) {
	int rows = 5;
	for(int i=1; i<=rows; i++){
		for(int j=1; j<=2*i-1; j++){
			System.out.print("*");
		}
		System.out.println();
	}
 }
}

/*
				stars	i
 * 				1		1
 *** 			3		2
 ***** 			5		3
 ******* 		7		4
 *********		9		5
 
 rows = 5
 */