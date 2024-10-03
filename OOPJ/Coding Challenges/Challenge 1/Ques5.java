class Ques5{
	public static void main(String[] args){
		int rows = 5;
		
		for(int i=1; i<=rows; i++){
			int  count = 1;
			int flag =0;
			for(int j=1; j<=rows-i; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i)-1; k++){
				System.out.print(count);
				
				if(flag==0){
					if (k==i){
						flag = 1;
						count--;
						continue;
					}
					count++;
				}else{
					count--;
				}
			}
			System.out.println();
		}
		
	}
}