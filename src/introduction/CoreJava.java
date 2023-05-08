package introduction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		ArrayList<String> a = new ArrayList();
		a.add("Tushar");
		a.add("Nixit");
		a.add("Selenium");
		a.remove(2);
		a.get(1);
		a.add("C#");
		System.out.println(a);
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		// Covering normal array  to ArrayList
		String[] names = {"aa", "bb", "cc", "dd"};
		//convert to arrayList
		List<String> nameList = Arrays.asList(names);
		System.out.println(nameList.contains("cc")); 
	}

}
