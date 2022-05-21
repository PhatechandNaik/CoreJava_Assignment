package set210522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAssignment {
	
	public String compare(TreeSet<Integer> set1, TreeSet<Integer> set2) {
		if(set1.size()!=set2.size())
			return "No";
		if(set1.containsAll(set2))
			return "Yes";
		else
			return "No";
 	}
	public static void main(String[] args) {
		// 1. create a tree set from hash set
		HashSet<Integer> numset = new HashSet<Integer>();
		numset.add(12);
		numset.add(67);
		numset.add(27);
		numset.add(45);
		numset.add(33);
		System.out.println("hash set numset : "+numset);
		TreeSet<Integer> tset = new TreeSet<>(numset);
		System.out.println("tree set from hash set i.e tset : "+tset);

		System.out.println("----------------------------------");
		// 2. create a new tree set , add strings and print the tree set
		TreeSet<String> friends = new TreeSet<String>();
		friends.add("Sambit");
		friends.add("Arabinda");
		friends.add("Sangita");
		friends.add("Sontosh");
		friends.add("Priti");
		friends.add("Anupama");
		System.out.println("friends : "+friends);

		System.out.println("----------------------------------");
		// 3. iterate through all elements in tree set
		System.out.println("all friends name");
		Iterator<String> itr = friends.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------------------------");
		// 4. get the first and last element
		System.out.println("first friend name : "+friends.first());
		System.out.println("last friend name : "+friends.last());

		System.out.println("----------------------------------");
		// 5. get the no of elements in tree set
		System.out.println("total no of friends : "+friends.size());

		System.out.println("----------------------------------");
		// 6. reverse order view of elements contained in tree set
		System.out.println("all friends name in reverse order");
		Set<String> set = friends.descendingSet();
		for(String name : set) {
			System.out.println(name);
		}

		System.out.println("----------------------------------");
		// 7. remove a given element
		friends.remove("Anupama");
		System.out.println("after remove Anupama");
		System.out.println("friends : "+friends);

		System.out.println("----------------------------------");
		// 8. retrieve and remove lowest element
		// using single method call
		System.out.println("friends : "+friends);
		friends.remove(friends.first());
		System.out.println("after remove lowest element");
		System.out.println("friends : "+friends);

		// using two method call
		String lowest = friends.first();
		friends.remove(lowest);
		System.out.println("after remove lowest element i.e "+lowest);
		System.out.println("friends : "+friends);

		System.out.println("----------------------------------");
		// 9. retrieve and remove highest element
		// using single method call
		System.out.println("friends : "+friends);
		friends.remove(friends.last());
		System.out.println("after remove highest element");
		System.out.println("friends : "+friends);

		// using two method call
		String highest = friends.last();
		friends.remove(highest);
		System.out.println("after remove highest element i.e "+highest);
		System.out.println("friends : "+friends);
		
		System.out.println("----------------------------------");
		// 10. get element which is greater than or equal to given element
		System.out.println("number set : "+tset);
		System.out.println("number greater than or equal to 33 is "+tset.ceiling(33));
		
		System.out.println("----------------------------------");
		// 11. get element which is strictly  greater than or equal to given element
		System.out.println("number which is strictly greater than 33 is "+tset.higher(33));
		
		System.out.println("----------------------------------");
		// 12. get element which is less than or equal to given element
		System.out.println("number less than or equal to 33 is "+tset.floor(33));
		
		System.out.println("----------------------------------");
		// 13. get element which is strictly less than or equal to given element
		System.out.println("number which is strictly less than 33 is "+tset.lower(33));
		
		System.out.println("----------------------------------");
		// 14. compare two tree set
		 TreeSet<Integer> set1 = new TreeSet<Integer>();
		 set1.add(2);
		 set1.add(4);
		 set1.add(1);
		 set1.add(5);
		 set1.add(8);
		 set1.add(3);
		 TreeSet<Integer> set2 = new TreeSet<Integer>();
		 set2.add(2);
		 set2.add(4);
		 set2.add(1);
		 set2.add(5);
		 set2.add(8);
		 set2.add(3);
		 TreeSetAssignment obj = new TreeSetAssignment();
		 System.out.println("set A : "+set1);
		 System.out.println("set B : "+set2);
		 System.out.print("does set A and set B are same : ");
		 System.out.println(obj.compare(set1,set2));
		 
		 System.out.println("----------------------------------");
		 // 15. find the numbers less than 7 in a tree set contains integers 
		 System.out.println("set1 : "+set1);
		 System.out.println("numbers less than 7 : "+set1.headSet(7));
		 
		 // 16. find the numbers greater than 7 in a tree set contains integers 
		 System.out.println("numbers greater than 7 : "+set1.tailSet(7, false));
		 
		 System.out.println("----------------------------------");
		 // 17. add all the elements from one set to another
		 TreeSet<Integer> set3 = new TreeSet<Integer>();
		 set3.add(9);
		 set3.add(1);
		 set3.add(7);
		 set3.add(8);
		 System.out.println("set1 : "+set1);
		 System.out.println("set3 : "+set3);
		 set1.addAll(set3);
		 System.out.println("after adding set3 in set1 : ");
		 System.out.println("set1 : "+set1);
		 
		

	}

}
