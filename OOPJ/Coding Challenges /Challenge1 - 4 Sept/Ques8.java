class Ques8{
	public static void main(String[] args){
		int rows = 6;
		
		for(int i=1; i<=rows; i++){
			int j = rows - i +1;
			int flag = 0;
			while(j>=rows-i+1){
				if(j==rows){
					System.out.print(0);
					j--;
					flag = 1;
					continue;
				}
				System.out.print(j);
				if(flag==0){
					j++;
				}
				else{
					j--;
				}
			}
			System.out.println();
		}
	}
}