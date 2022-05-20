package set200522;

import java.util.HashSet;

public class SubSet {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(12);
		set1.add(23);
		set1.add(15);
		set1.add(14);
		set1.add(13);
		set1.add(20);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(13);
		set2.add(14);
		
		System.out.println("set A : "+set1);
		System.out.println("set B : "+set2);
		System.out.println("Does setB is subset of A : "+set1.containsAll(set2));

	}

}
