class Ques3{
	public static void main(String[] args){
		int rows = 5;
		int  count = 65;
		
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=rows-i; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i)-1; k++){
				System.out.print((char)count);
				count++;
			}
			System.out.println();
		}
		
	}
}