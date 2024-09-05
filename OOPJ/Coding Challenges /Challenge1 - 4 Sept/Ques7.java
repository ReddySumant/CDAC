class Ques7{
	public static void main(String[] args){
		int rows = 5;
		
		for(int i=1; i<=rows; i++){
			int j=1;
			int flag =0;
			while(j>0){
				System.out.print(j);
				if(flag==0){
					if(j==i){
						flag = 1;
						for(int k=1; k<=(2*rows-2*i)+1; k++){
							System.out.print(" ");
						}
						continue;
					}
					j++;
				}else{
					j--;
				}
			}
			System.out.println();
		}
	}
}