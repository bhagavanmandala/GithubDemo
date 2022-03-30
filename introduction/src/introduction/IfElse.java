package introduction;

import java.util.ArrayList;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if-esle conditions
		
		
		int[] array = {1,2,3,4,5};
		for (int i=0; i < array.length; i++) {
			if (array[i]%2 == 0 ) {
				System.out.println(array[i]);
			}
			else {
				System.out.println(array[i]);
			}
		}
		
		//dynamically add array
		
		ArrayList<String> a = new ArrayList<String>();
			a.add("raju");
			a.add("alekhya");
			a.add("jashwanth");
			a.remove(2);
			System.out.println(a.get(1));
			
			
		String s = new String("radheshyam");
		String s1 = new String("radheshyam"); // both radheshyam strings are stored in different locations because we gave new memory to them
		
		String s3 = "radheshyam saaho bahubali";
		//String s4 = "radheshyam saaho bahubali"; //in this process both radheshyam saaho bahubali string refer to one class i.e.., s3
		String[] splitting = s3.split(" ");
		System.out.println(splitting[0]);
		String[] splitting1 = s3.split("saaho");
		System.out.println(splitting1[0]);
		System.out.println(splitting1[1].trim());//trim removes spaces
		
		for (int i=0;i<s3.length();i++) {
			//System.out.println(s3.charAt(i));
		}
		//print the string in reverse
		for (int i=s3.length()-1;i>=0;i--) {
			System.out.println(s3.charAt(i));
		}
		String z = "";
		for (int i=s3.length()-1;i>=0;i--) {
			z = z + s3.charAt(i);
		}
		//System.out.println(z);
	}

}
