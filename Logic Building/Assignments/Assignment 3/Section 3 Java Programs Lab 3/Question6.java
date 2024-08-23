public class Question6 { 
 public static void main(String[] args) {
	int num = 5;
	int count = 0;
	int i = 2;
	
	while(i>0){
		boolean flag = true;
		for(int j=2; j<i; j++){
			if(i%j==0){
				i++;
				flag = false;
				break;
			}
		}
		if(flag == true){
			count++;
			System.out.println(i);
			if(count==num){
				break;
			}
			i++;
		}
	}
	//System.out.println(i);
 
 }
}