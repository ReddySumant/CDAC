public class Question18 { 
 public static void main(String[] args) {
	int rows = 7;
	int i = 1;
	boolean flag = false;
	while(i>0){
		for(int j=1; j<=((rows/2)-i); j++){
			System.out.print(" ");
		}
		for(int k=1; k<=(2*i-1); k++){
			System.out.print("*");
		}
		System.out.println();
		
		if(flag){
			i--;
		}
		else{
			if((2*i-1)==rows){
				flag = true;
				continue;
			}
			i++;
		}
	}
 }
}

/*
3		*		1
2	   ***		3
1	  *****		5
0	 *******	7 
1	  ***** 	5
2      *** 		3
3       * 		1
				2i-1
*/