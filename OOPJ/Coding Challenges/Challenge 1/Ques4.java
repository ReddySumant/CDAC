class Ques4{
	public static void main(String[] args){
		int rows = 5;
		
		for(int i=1; i<=rows; i++){
			if(i==rows){
				for(int j=1; j<=rows; j++){
					System.out.print(j);
				}
				break;
			}
			for(int j=1; j<=i; j++){
				if(j==1 || j==i){
					System.out.print(j);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}