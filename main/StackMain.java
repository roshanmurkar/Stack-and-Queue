package main;

public class StackMain {
	public static void main(String[] args) {
		//add element to stack
		System.out.println("inserting element into stack ::");
		NodeOperations operation=new NodeOperations();
		operation.addNode(70);
		operation.addNode(30);
		operation.addNode(56);
		System.out.println("");
		
		//deleting stack head element
		System.out.println("deleting element ::");
		operation.addNode(70);
		operation.addNode(30);
		operation.addNode(56);
		operation.printList();
		operation.deleteHead();
		operation.printList();
		operation.deleteHead();
		operation.printList();
		operation.deleteHead();
		System.out.println("");
		
		//inserting element to queue
		System.out.println("inserting element into queue ::");
		operation.addNodeQ(56);
		operation.addNodeQ(30);
		operation.addNodeQ(70);
		operation.printListQ();
		System.out.println("");
		
		//deleting element from queue
		System.out.println("deleting element from queue ::");
		operation.addNodeQ(56);
		operation.addNodeQ(30);
		operation.addNodeQ(70);
		operation.printListQ();
		operation.deleteHeadQ();
		operation.printListQ();
		System.out.println("");
		

	}
}
