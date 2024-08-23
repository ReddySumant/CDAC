class Calculator{
	public static void main(String[] args){
		char symbol = '/';
		int n1 = 1;
		int n2 = 2;
		
		switch(symbol){
			case '+':
				System.out.println(n1+n2);
				break;
			case '-':
				System.out.println(n1-n2);
				break;
			case '*':
				System.out.println(n1*n2);
				break;
			case '/':
				System.out.println((double)n1/(double)n2);
				break;
			default:
				System.out.println("Enter valid input");
		}
	}
}