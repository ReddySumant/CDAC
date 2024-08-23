class UnaryOperators{
	public static void main(String[] args){
		int a = 10;
		System.out.println(a); //10
		System.out.println(a++); //10
		System.out.println(++a); //12
		
		int b = 10;
		System.out.println(b); //10
		System.out.println(b--); //10
		System.out.println(b); //9
		System.out.println(--b); //8
		
		int c = ++a + b++;
		System.out.println(c); //21
	}
}