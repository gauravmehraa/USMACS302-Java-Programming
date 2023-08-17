class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class LinkedList{
	Node head;

	void insert(int data){
		Node newNode = new Node(data);

		if(head == null) head = newNode;
		else{
			Node current = head;
			while(current.next != null) current = current.next;
			current.next = newNode;
		}
		System.out.println("Inserted "+data);
	}

	void delete(int data){
		if(head == null){
			System.out.println("List empty");
			return;
		}

		Node current = head;
		int index = 0;
		while(current.next != null){
			index++;
			if(current.next.data == data){
				current.next = current.next.next;
				System.out.println("Deleted "+data+" at index "+index);
				return;
			}
			current = current.next;
		}
		System.out.println("Element not found");
	}

	void display(){
		Node current = head;
		while(current != null){
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("End");
	}

	public static void main(String args[]){
		LinkedList l = new LinkedList();

		for(int i = 10; i <= 20; i+=2) l.insert(i); 
		l.display();
		l.delete(12);
		l.display();
	}
}
