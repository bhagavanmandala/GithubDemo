package introduction;

public class javaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String name = "bhagavan";
		double deci = 9.8;
		char letter = 'd';
		boolean condi = true;
		
		System.out.println(num);
		System.out.println(condi);
		
		//array
		int[] myarray = {1,2,3,4,5};
		
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		//for loop
		for (int i=0; i < myarray.length; i++) {
			System.out.println(myarray[i]);
		}
		
		for (int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		String[] name1 = {"bhagavan","shyam","ranjith"}; //string array
		for (int i=0; i < name1.length; i++) {
			System.out.println(name1[i]);
		}
		
		//another way for execute string array
		for (String s: name1) {
			System.out.print(s);
		}
		
		

	}

}
