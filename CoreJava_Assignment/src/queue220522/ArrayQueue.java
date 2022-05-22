package queue220522;

public class ArrayQueue {
	private int[] arr;
	private int front;
	private int rear;
	
	public ArrayQueue(){
		arr = new int[10];
	}
	
	public void add(int data) {
		if(rear>=arr.length) {
			System.out.println("queue is full");
		}
		else {
			arr[rear++] = data;
		}
	}
	
	public void delete() {
		if(rear==0) {
			System.out.println("queue is empty");
		}
		else {
			int element = arr[front];
			for(int temp = front; temp<rear-1; temp++) {
				arr[temp] = arr[temp+1];
			}
			arr[rear--] = 0;
			System.out.println(element+" is removed");
		}
	}
	
	public int get() {
		if(rear==0) {
			System.out.println("queue is empty");
			return -1;
		}
		else {
			return arr[front];
		}
	}
	
	public void display() {
		int temp = front;
		while(temp<rear) {
			System.out.print(arr[temp]+" ");
			temp++;
		}
		System.out.println();
	}
}
