class Discount{
	public static void main(String[] args){
		int purchaseAmount = 600;
		boolean membership = true;
	
		if(purchaseAmount>=1000){
			System.out.println("20% Discount");
			if(membership){
				System.out.println("5% Extra Discount Applied");
			}
		}else if(purchaseAmount>=500){
			System.out.println("10% Discount");
			if(membership){
				System.out.println("5% Extra Discount Applied");
			}
		}else {
			System.out.println("F");
			if(membership){
				System.out.println("5% Extra Discount Applied");
			}
		}
	}
}