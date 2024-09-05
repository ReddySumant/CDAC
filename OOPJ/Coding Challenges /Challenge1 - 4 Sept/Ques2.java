class Ques2{
	public static void main(String[] args){
		int rows = 6;
		
		for(int i=rows; i>0; i--){
			if(i==rows){
				System.out.println("*".repeat((2*rows)-1));
				continue;
			}
			for(int j=rows-i; j>0; j--){
				System.out.print(" ");
			}
			for(int k=(2*i)-1; k>0; k--){
				if(k==1 || k== ((2*i)-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
}