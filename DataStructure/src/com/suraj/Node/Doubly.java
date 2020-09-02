package com.suraj.Node;

public class Doubly {

	
Node head;
	public void insertDoublyLinkedList(int data){	
	Node node = new Node();
	node.data=data;
	node.next=null;
	node.previous=null;
	if(head==null){
		head=node;
	}
	else{
	Node n = head;
	while(n.next!=null){
		n=n.next;
	}
	node.previous=n;
	n.next=node;
	
	}
	}
	
	public void show(){
		Node n = head;
		while(n.next!=null){
			System.out.println(n.data);
			n= n.next;
		}
		System.out.println(n.data);
	}
	
	public void insertAtIndex(int index,int data){
		Node node = new Node();
		node.data=data;
		node.next= null;
		node.previous=null;
		
		if(index==0){
			Node n =head;
			node.next = n;
			n.previous=node;
			head=node;
		}
		else{
			Node n = head;
			for(int i=1;i<index;i++){
				n =n.next;
			}
			node.previous=n;
			node.next=n.next;
			n.next=node;
			
		}
		
				
	}
}
