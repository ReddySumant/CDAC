public class Question9 { 
 public static void main(String[] args) {
	int num = 4825;
	int minNum = 0;
	int i = 0;
	
	while(num>0){
		i = num%10;
		if(minNum<i){
			minNum = i;
		}
		num = num/10;
	}
	System.out.println(minNum);
 }
}