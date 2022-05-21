package set210522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsSetAssignment {

	public static void main(String[] args) {
		// 1. create linked  hash set of integer with out using generic
//		LinkedHashSet numset = new LinkedHashSet();
//		numset.add(23);
//		numset.add(12);
//		numset.add(45);
//		System.out.println(numset); 
		
		// 2. create linked  hash set of string (colors) using generic
		LinkedHashSet<String> colors = new LinkedHashSet<String>();
		colors.add("Violet");
		colors.add("Indigo");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Red");
		System.out.println(colors);
		
		// 3. create linked hash set from array list
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ankita");
		names.add("Sambit");
		names.add("Bhuban");
		names.add("Sambit");
		names.add("Ankita");
		System.out.println("array list names : "+names);
		LinkedHashSet<String> nameset = new LinkedHashSet<>(names);
		System.out.println("nameset from names : "+nameset);
		
		// 4. iterate through set
		System.out.println("itarating through colors");
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 5. get no of elements in linked  hash set
		System.out.println("total no of colors : "+colors.size());
		
		// 6. empty a linked hash set
		System.out.println("colors : "+colors);
		colors.clear();
		System.out.println("after emptying colors set");
		System.out.println("colors : "+colors);
		
		// 7. check set is empty or not
		System.out.println("does colors set is empty : "+colors.isEmpty());
		
		// 8. convert linked hash set to array
		System.out.println("linked hash set nameset : "+nameset);
		String[] nameArr = nameset.toArray(new String[nameset.size()]);
		System.out.println("set to array i.e nameArr : "+Arrays.toString(nameArr));
		
		// 9. remove all of the elements from a linked  hash set
		System.out.println("hash set nameset : "+nameset);
		nameset.clear();
		System.out.println("after removing all elements");
		System.out.println("nameset : "+nameset);

	}

}
