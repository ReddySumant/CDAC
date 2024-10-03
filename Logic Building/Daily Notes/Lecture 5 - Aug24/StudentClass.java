class StudentClass
{
	String name;
	int age;
	static String collegeName; 
	{	
		name = "Sumant";
		//int age = 23;
		System.out.println("inside init");
	}
	
	static{
		collegeName = "CDAC";
		System.out.println("inside Static");
	}
	
	StudentClass() {
		System.out.println("inside non parametised cons");
	};
	
	StudentClass(String name, int age){
		System.out.println("inside parametised cons");
		this.name = name;
		this.age = age;
	}

	String getName(){
		return this.name;
	}
	
	/*int getName(){
		return this.name.length();
	}		*/							// This will throw error


    public static void main(String[] args){
		StudentClass obj1 = new StudentClass();
		//StudentClass obj2 = new StudentClass("Sumant",23);
		System.out.println(obj1.name);
		System.out.println(obj1.collegeName);
	}
	
	}