class Ques1{
	public static void main(String[] args){
		int rows = 6;
		
		for(int i=1; i<=rows; i++){
			if(i==rows){
				System.out.println("*".repeat((2*rows)-1));
				break;
			}
			for(int j=1; j<=rows-i; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=((2*i)-1); k++){
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