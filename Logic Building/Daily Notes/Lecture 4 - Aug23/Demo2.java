class Student{
	int id;
	String name;
	float marks;
	long mob;
	String address;
	static String instituteName = "CDAC Kharghar";
	
	Student(){}
	
	Student(int a, String b, float c, long d, String e){
		id = a;
		name = b;
		marks = c;
		mob = d;
		address = e;
	}
	
	float displayMarks(){
		return marks;
	}
	
	void calculatePercentage(){
		System.out.println("percentage");
	}
	
	void displayDetails(){
		System.out.println(id+" "+name+" "+marks+" "+mob+" "+address+" ");
	}
}

public class Demo2{
	public static void main(String[] args){
		System.out.println(Student.instituteName);
		
		Student obj = new Student();
		System.out.println(obj.instituteName);
	}
}