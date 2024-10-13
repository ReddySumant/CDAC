import java.util.Scanner;

class RemovePunctuationTest{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = str.replaceAll("@?!","");
		System.out.println(result);
	}

}
