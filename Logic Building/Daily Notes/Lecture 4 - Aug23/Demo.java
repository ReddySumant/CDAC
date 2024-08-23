class Laptop{
	int memory;
	String modelName;
	String processor;
	String os;
	float price;
	char letter;
	
	Laptop(){
		memory = 1024;
		modelName = "Acer";
		processor = "i5";
		os = "windows";
		price = 46000.0f;
	}
	
	Laptop(int a, String b, String c, String d, float e){
		memory = a;
		modelName = b;
		processor = c;
		os = d;
		price = e;
	}
	
	Laptop(int a){
		memory = a;
	}
	
	void clickPhoto(){
		System.out.println("Photo CLicked");
	}
	
	String getProcessor(){
		return processor;
	}
}

class Demo{
	public static void main(String[] args){
		Laptop obj = new Laptop();
		obj.clickPhoto();
		System.out.println(obj.memory);
		System.out.println(obj.os);
		System.out.println(obj.price);
		System.out.println(obj.letter);
		
		Laptop obj1 = new Laptop(2048,"Asus","i7","Windows",70000.5f);
		System.out.println(obj1.price);
		Laptop obj2 = new Laptop(2048);
		System.out.println(obj2.price);
	}
}