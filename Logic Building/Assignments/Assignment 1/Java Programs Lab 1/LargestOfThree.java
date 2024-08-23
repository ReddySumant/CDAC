public class LargestOfThree{
	public static void main(String[] args){
		int a = 8;
		int b = 4;
		int c = 10;
		
		if(a>b){
			if(a>c){
				System.out.println("Greatest number is : " + a);
			}else{
				System.out.println("Greatest number is : " + c);
			}
		}
		else{
			if(b>c){
				System.out.println("Greatest number is : " + b);
			}else{
				System.out.println("Greatest number is : " + c);
			}
		}	
	}
}