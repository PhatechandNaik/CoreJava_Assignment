package set200522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetAssignment {

	public static void main(String[] args) {
		// 1. create hash set of integer with out using generic
//		HashSet nums = new HashSet();
//		nums.add(23);
//		nums.add(12);
//		nums.add(45);
//		System.out.println(nums); 
		
		// 2. create hash set of string (colors) using generic
		HashSet<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		System.out.println(colors);
		
		// 3. create hash set from array list
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ankita");
		names.add("Sambit");
		names.add("Bhuban");
		names.add("Sambit");
		names.add("Ankita");
		System.out.println("array list names : "+names);
		HashSet<String> nameset = new HashSet<>(names);
		System.out.println("nameset from names : "+nameset);
		
		// 4. iterate through set
		System.out.println("itarating through colors");
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 5. get no of elements in hash set
		System.out.println("total no of colors : "+colors.size());
		
		// 6. empty a hash set
		System.out.println("colors : "+colors);
		colors.clear();
		System.out.println("after emptying colors set");
		System.out.println("colors : "+colors);
		
		// 7. check set is empty or not
		System.out.println("does colors set is empty : "+colors.isEmpty());
		
		// 8. convert hash set to array
		System.out.println("hash set nameset : "+nameset);
		String[] nameArr = nameset.toArray(new String[nameset.size()]);
		System.out.println("set to array i.e nameArr : "+Arrays.toString(nameArr));
		
		// 9. remove all of the elements from a hash set
		System.out.println("hash set nameset : "+nameset);
		nameset.clear();
		System.out.println("after removing all elements");
		System.out.println("nameset : "+nameset);

	}

}
