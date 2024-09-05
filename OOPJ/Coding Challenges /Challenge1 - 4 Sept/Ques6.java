class Ques6{
	public static void main(String[] args){
		int rows = 7;
		int num = (rows/2) + 1;
		int flag = 0;
		int i =1;
		
		while(i>0){
			int count = 1;
			
			for(int j=1; j<=num-i; j++){
				System.out.print(" ");
			}
			int flag1 = 0;
			for(int k=1; k<=(2*i)-1; k++){
				System.out.print(count);
				if(flag1 == 0){
					if(count==i){
						count=i-1;
						flag1=1;
						continue;
					}
					count++;
				}else{
					count--;
				}
			}
			
			System.out.println();
			if(flag==0){
				if(i==num){
					i--;
					flag = 1;
					continue;
				}
					i++;
			}else{
					i--;
			}
			
		}
		
	}
}