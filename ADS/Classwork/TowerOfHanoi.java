import java.util.Scanner;

class TowerOfHanoi{
	public static void tower(int disks, String source, String helper, String destination){
		if(disks==1){
			System.out.println("Moved "+disks+" from "+source+" to "+destination);
			return;
		}
		tower(disks-1, source, destination, helper);
		System.out.println("Moved "+disks+" from "+source+" to "+destination);
		tower(disks-1, helper,source,destination);
	}
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int numOfDisks = sc.nextInt();
		tower(numOfDisks, "S","H","D");
	}

}

