package com.suraj.Node;



public class Runner {
 public static void main(String[] args){
	 
	 LinkedList list = new LinkedList();
	 Linked linked = new Linked();
	 Doubly doublee = new Doubly();
	 linked.insert(2);
	 linked.insert(2);
	 linked.insert(2);
	 linked.insert(5);
	 linked.insert(6);
	 System.out.println(linked);
	 linked.show();
	 list.findNumberIndex(linked,6);
	 doublee.insertDoublyLinkedList(10);
	 doublee.insertDoublyLinkedList(11);
	 doublee.insertDoublyLinkedList(12);
	 doublee.insertAtIndex(0, 24);
	 linked.delete(1);
	 linked.insertIndex(1,9);
	 linked.show();
	 System.out.println("-----");
	 doublee.show();
	
	/* System.out.println();
	 list.insert(6);
	 list.insertAtStart(9);*/
	// list.insertAt(2,18);
	/* list.deleteAt(3);
	 list.show();
	 list.size();*/
 }
}
