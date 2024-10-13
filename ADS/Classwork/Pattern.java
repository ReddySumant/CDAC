import java.util.Scanner;
public class Pattern{
	public static void permutation(String str, String res){
		if(str.length()==0){
			System.out.println(res);
			return;
		}
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			String ros = str.substring(0,i)+ str.substring(i+1);
			permutation(ros,res+c);
		}
	}

	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		permutation(str,"");
	}
}
