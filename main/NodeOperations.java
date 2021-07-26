package main;

public class NodeOperations {
	Node head;
	
	//add element 
	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
		printList();
	}
	
	//print stack
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public void deleteHead() {
		System.out.println("deleting head node");
		Node temp=head;
		if(temp!=null) {
			head=temp.next;
		}
	}
	
	public void printListQ() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public void addNodeQ(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}

	}
	
	public void deleteHeadQ() {
		System.out.println("deleting head ");
		Node temp=head;
		if(temp!=null) {
			head=temp.next;
		}
	}
	

}
