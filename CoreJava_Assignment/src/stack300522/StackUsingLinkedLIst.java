package stack300522;

public class StackUsingLinkedLIst {
	Node head;
	
	public StackUsingLinkedLIst() {
		head = null;
	}
	
	private static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next=null;
		}
	}
	
	public boolean isEmpty() {
		return (head==null);
	}
	
	public void push(int item) {
		Node element = new Node(item);
		element.next = head;
		head = element;
	}
	
	public int pop() {
		if(!isEmpty()) {
			int element = head.data;
			head = head.next;
			return element;
		}
		else {
			System.out.println("Stack is Empty !!!");
			return -1;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			return head.data;
		}
		else {
			System.out.println("Stack is Empty !!!");
			return -1;
		}
	}
	
	public void printElements() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
}
