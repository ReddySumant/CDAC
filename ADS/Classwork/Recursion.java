public class Recursion{
	static int count = 0;
	public static void sumant(String str){
		System.out.println(str);
		count++;
		if(count<5) sumant(str+count);
	}

	public static void main(String... args){
		sumant("Samruddhi");
	}
}
