class Ques10{
	public static void main(String[] args){
		int rows = 7;
		int num = (rows/2)+1;
		int i=1;
		int count = 1;
		int flag = 0;
		
		while(i>0){
			for(int j=1; j<=i; j++){
				System.out.print(count*j+" ");
			}
			System.out.println();
			
			if(flag==0){
				if(i==num){
					i--;
					count++;
					flag = 1;
					continue;
				}
				i++;
				count++;
			}else{
				i--;
				count++;
			}
		}
		
	}
}