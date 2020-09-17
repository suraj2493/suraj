package com.suraj.Node;

public class LinkedList {

	Node head;
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next=null;
		if(head !=(null))
		{
			System.out.println("insert");
			head = node;
		}
		else
			
		{		
			Node n = head;
			while(n.next!=null){
			n=n.next;
		
		}
			n.next=node;
		}
	}
	public void show(){
		Node n=head;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
		
	}
	public void insertAtStart(int data){
		Node node = new Node();
		node.data=data;
		node.next=null;
		Node n =head;
		node.next=n;
		head=node;
	}
	public void insertAt(int index, int data) {
		Node node= new Node();
		node.data=data;
		node.next=null;
		if(index==0){
			insertAtStart(data);
		}
		else{
		Node n = head;
		for(int i=1;i<index;i++){
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}
	public void size(){
		Node n = head;
		int count=1;
		if(n.next==null){
			System.out.println("1");
		}
		else{
			while(n.next!=null){
				n=n.next;
				count= count+1;
			}
			System.out.println(count);
		}
		
	}
	public void deleteAt(int index){
		Node n=head;
		for(int i=0;i<index;i++){
			n=n.next;
		}
		n.next=n.next.next;
	}
	public void findNumberIndex(Linked arr, int z) {
		Node n=arr.head;
		int count=0;
		if(n.next==null){
			System.out.println("0");
		}
		while(n.next!=null){
		if(n.data==z){
		System.out.println(count);
		}
		n=n.next;
		count++;
		}
		
	}
	
}
