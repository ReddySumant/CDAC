class PassFail{
	public static void main(String[] args){
		int s1 = 80;
		int s2 = 80;
		int s3 = 10;
		int count = 0;
		
		if(s1>40){
			count +=1;
		};
		if(s2>40){
			count +=1;
		};
		if(s3>40){
			count +=1;
		};

		switch(count){
			case 3:
				System.out.println("Passed in all subjects");
				break;
			case 2:
				System.out.println("Failed in one subject");
				break;
			case 1:
				System.out.println("Failed in two subject");
				break;
			case 0:
				System.out.println("Failed in all subjects");
				break;
		}
		
	}
}