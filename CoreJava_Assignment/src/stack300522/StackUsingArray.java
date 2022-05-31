package stack300522;

public class StackUsingArray {
	int size;
	int data[];
	int top;
	
	public StackUsingArray(int size) {
		this.size = size;
		this.data = new int[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (size-1==top);
	}
	
	public void push(int item) {
		if(!isFull()) {
			top++;
			data[top] = item;
		}
		else {
			System.out.println("Stack is Full !!!");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int element = data[top];
			data[top] = 0;
			top--;
			return element;
		}
		else {
			System.out.println("Stack is Empty !!!");
			return -1;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			return data[top];
		}
		else {
			System.out.println("Stack is Empty !!!");
			return -1;
		}
	}
	
	public void printElements() {
		int temp = top;
		while(temp>=0) {
			System.out.print(data[temp]+" ");
			temp++;
		}
		System.out.println();
	}
}
