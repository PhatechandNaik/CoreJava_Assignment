package queue220522;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
class IceCream{
	String name;
	int cost;
	IceCream(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	public String toString() {
		return "[ " + name + ", " + cost + " ]";
	}
}
class IceCream1 implements Comparable<IceCream1>{
	String name;
	int cost;
	IceCream1(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	public int compareTo(IceCream1 cm) {
		return this.name.compareTo(cm.name);
	}
	public String toString() {
		return "[ " + name + ", " + cost + " ]";
	}
}
public class QUsingPriorityQueue {
	
	public void printQueue(PriorityQueue<IceCream1> cms) {
		for(IceCream1 c : cms) {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		// 12. create queue of integers without generic
//		PriorityQueue nums = new PriorityQueue();
//		nums.add(12);
//		nums.add(23);
//		nums.add(45);
//		System.out.println(nums);
		
		System.out.println("----------------------------");
		// 13. create queue with some colors (String) using generic
		PriorityQueue<String> colors = new PriorityQueue<>();
		colors.add("White");
		colors.add("Blue");
		colors.add("Pink");
		System.out.println("colors : "+colors);
		
		System.out.println("----------------------------");
		// 14. create queue with user defined objects which doesn't implements Comparable
		// gives ClassCastException
		PriorityQueue<IceCream> icecreams = new PriorityQueue<>();
		icecreams.add(new IceCream("Butterscotch", 25));
		icecreams.add(new IceCream("Chocolate", 25));
		icecreams.add(new IceCream("Badam Pista", 30));
		icecreams.add(new IceCream("Belgium Chocolate", 40));
		
		for(IceCream cm : icecreams) {
			System.out.println(cm);
		}
		
		System.out.println("----------------------------");
		// 15. now implements Comparable and check order of removal
		PriorityQueue<IceCream1> cms = new PriorityQueue<>();
		cms.add(new IceCream1("Butterscotch", 25));
		cms.add(new IceCream1("Chocolate", 25));
		cms.add(new IceCream1("Badam Pista", 30));
		cms.add(new IceCream1("Belgium Chocolate", 40));
		
		QUsingPriorityQueue obj = new QUsingPriorityQueue();
		System.out.println("all icecreams name and price");
		obj.printQueue(cms);
		cms.poll();
		System.out.println("after removeing element i.e using poll() : ");
		obj.printQueue(cms);
		
		System.out.println("----------------------------");
		// 17. now use comparator for reverse order
		// and check order of removing element
		PriorityQueue<IceCream1> cm = new PriorityQueue<>(Collections.reverseOrder());
		cm.add(new IceCream1("Butterscotch", 25));
		cm.add(new IceCream1("Chocolate", 25));
		cm.add(new IceCream1("Badam Pista", 30));
		cm.add(new IceCream1("Belgium Chocolate", 40));
		
		System.out.println("all icecreams name and price");
		obj.printQueue(cm);
		cm.poll();
		System.out.println("after removeing element i.e using poll() : ");
		obj.printQueue(cm);
		
		System.out.println("----------------------------");
		// 18. create queue using LinkedList and PriorityQueue
		// compare their order of showing elements
		LinkedList<Integer> q1 = new LinkedList<>();
		q1.add(12);
		q1.add(23);
		q1.add(34);
		q1.add(45);
		PriorityQueue<Integer> q2 = new PriorityQueue<>();
		q2.add(12);
		q2.add(23);
		q2.add(34);
		q2.add(45);
		System.out.println("queue using linkedlist q1 : "+q1);
		System.out.println("queue using priorityqueue q2 : "+q2);

	}

}
