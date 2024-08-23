public class Question13 { 
 public static void main(String[] args) {
	int num = 5;
	int  i =1;
	boolean check = false;
	
	while(i>0){
		for(int j=1; j<=i-1; j++){
			System.out.print(i+"*");
		}
		System.out.println(i);
		
		if(check){
			i--;
		}
		else{
			if(i==num){
				check = true;
				i=num;
				continue;
			}
			i++;
		}
	}
 }
}