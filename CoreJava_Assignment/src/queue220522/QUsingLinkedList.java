package queue220522;

import java.util.LinkedList;
import java.util.NoSuchElementException;
class Item{
	int id;
	String name;
	float price;
	Item(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return "[ " + id + ", " + name + ", " + price + " ]";
	}
	
	
}
public class QUsingLinkedList {

	public static void main(String[] args) {
		//1. create queue of integers without using generic
//		LinkedList nums = new LinkedList();
//		nums.add(45);
//		nums.add(23);
//		nums.add(78);
//		System.out.println("numbers in queue are..");
//		System.out.println(nums);
		
		System.out.println("----------------------------------");
		// 2. create queue with String (colors) using generic
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("Blue");
		colors.add("white");
		colors.add("red");
		System.out.println("colors : "+colors);
		
		System.out.println("----------------------------------");
		// 3. create queue with user defined objects
		LinkedList<Item> items = new LinkedList<Item>();
		items.add(new Item(1, "pen", 10));
		items.add(new Item(2, "pencil", 12));
		items.add(new Item(3, "notebook", 25));
		System.out.println("all items detail...");
		for(Item item : items)
			System.out.println(item);
		
		System.out.println("----------------------------------");
		// 4. use two different method calls to add elements
		LinkedList<Integer> age = new LinkedList<Integer>();
		age.addFirst(25);
		age.addLast(24);
		age.addLast(32);
		age.addLast(28);
		System.out.println("age : "+age);
		
		System.out.println("----------------------------------");
		// 5. check if queue has values
		System.out.println("does age contains values : "+(age.isEmpty()?"No":"Yes"));
		
		System.out.println("----------------------------------");
		// 6. check the top element
		System.out.println("age : "+age);
		Integer top = age.peekFirst();
		if(top==null)
			System.out.println("no element at top");
		else
			System.out.println("top element : "+top);
		System.out.println("----------------------------------");
		// 7. remove an element
		System.out.println("age : "+age);
		age.poll();
		System.out.println("after remove an element : ");
		System.out.println("age : "+age);
		
		System.out.println("----------------------------------");
		// 8. use two different method call to remove
		// using pollFirst()
		System.out.println("age : "+age);
		age.pollFirst();
		System.out.println("after removed front element");
		System.out.println("age : "+age);
		age.pollLast();
		System.out.println("after removed rear element");
		System.out.println("age : "+age);
		
		System.out.println("----------------------------------");
		// 9. try to remove non existing element
		LinkedList<String> emptyQ = new LinkedList<>();
		System.out.println("trying to remove non existing element");
		System.out.println("using poll() return : "+emptyQ.poll());
		
		System.out.println("----------------------------------");
		// 10. use two different method call to non existing element
		System.out.println("using poll() : "+emptyQ.poll());
		try {
			System.out.print("using remove() : ");
			System.out.println(emptyQ.remove());
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------------------------");
		// 11. implement queue using array
		ArrayQueue myQ = new ArrayQueue();
		myQ.add(45);
		myQ.add(55);
		myQ.add(40);
		myQ.add(35);
		myQ.add(25);
		System.out.println("all queue elements are..");
		myQ.display();
		System.out.println("first element : "+myQ.get());
		myQ.delete();
		System.out.println("after delete() : ");
		myQ.display();

	}

}
