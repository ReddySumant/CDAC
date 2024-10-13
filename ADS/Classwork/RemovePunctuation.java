import java.util.Scanner;

class RemovePunctuation{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = str.replaceAll("\\p{Punct}","");
		System.out.println(result);
	}

}
