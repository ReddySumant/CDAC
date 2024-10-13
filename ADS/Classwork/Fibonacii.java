import java.util.Scanner;

public class Fibonacii{
	public static int fib1(int num){
		int num1 = 0;
		int num2 = 1;
		int res = 0;

		if(num==num1) return 0;
		if(num==num2) return 1;

		for(int i=0; i<num-1; i++){
			res = num1 + num2;
			num1 = num2;
			num2 = res;
		}
		return res;
	}

	public static int fib(int num){
		if(num<=1) return num;
		else return fib(num-1) + fib(num-2);
	}

	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fib1(num));
		/*
		for(int i = 0; i<num; i++){
			System.out.print(fib(i)+" ");
		}*/
	}
}
