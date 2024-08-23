class Demo{
	public static void main(String[] args){
		//type casting
		byte b = (byte)130; //explicit type casting
		byte b1 = 127; //implicit type casting
		System.out.println(b);
		
		int a = 10;
		byte b2 = (byte)a; //type casting
		System.out.println(b2);
		byte a1 = 10;
		int a2 = a1;
		System.out.println(a2);
		
		char c = 'A';
		System.out.println(c); 
		System.out.println((int)c);
		System.out.println((char)125);
		
		//default type for decimal value is double
		int a3 = 10;
		float f = a3;
		System.out.println(f);
		
		float f1 = 10.0f;
		System.out.println(f1);
		
		int a4 = (int)f1; //int a4 = f1 throws error
		System.out.println(a4);
		
		
	}
}