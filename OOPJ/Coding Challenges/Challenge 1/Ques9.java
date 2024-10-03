class Ques9{
	public static void main(String[] args){
		int rows = 9;
		int num = rows-1;
		for(int i=1; i<=rows; i++){
			//first part
			for(int j=1; j<=rows-i; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k);
			}
			System.out.print(" x " + num + " + " + i + " = ");
			for(int l=rows; l>=rows-i+1; l--){
				System.out.print(l);
			}
			System.out.println();
		}
	}
}