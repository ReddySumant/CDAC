public class Question22 { 
 public static void main(String[] args) {
	int rows = 9;
	boolean flag = false;
	int half = rows/2+1;
	int i = half;
	while(i<=half){
		for(int j=1; j<=((half)-i); j++){
			System.out.print(" ");
		}
		for(int k=1; k<=(2*i-1); k++){
			System.out.print("*");
		}
		System.out.println();
		if (flag){
			i++;
		}else{
			if(i==1){
			i++;
			flag = true;
			continue;
			}
			i--;
		}
	}
 }
}

/*  i stars			Spaces
	5	9	*********  0		
	4	7	 *******   1             
	3	5	  *****    2
	2	3	   ***     3
	1	1		*      4
	2	3	   ***     3 
	3	5	  *****    2
	4	7	 *******   1
	5	9	*********  0
		2i-1		  5-i
*/