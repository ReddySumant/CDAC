class GradeClass{
	public static void main(String[] args){
		int scores = 75;
		
		if(scores>=90){
			System.out.println("A");
		}else if(scores>=80){
			System.out.println("B");
		}else if(scores>=70){
			System.out.println("C");
		}else if(scores>=60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}