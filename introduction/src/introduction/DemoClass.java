package introduction;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass d = new DemoClass();
		d.getClass();
		String name = d.getdata();
		System.out.println(name);
		getdata1();//we gave static so we dont need to give d.detclass1()
		DemoClass2 d2 = new DemoClass2();
		d2.get();//access the class from another outside method
		

	}
	public String getdata() {
		System.out.println("Hello World");
		return "getBackToWork";
	}
	
	public static void getdata1() {
		System.out.println("Hello World");
	}

}
