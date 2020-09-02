package com.suraj.Node;

import java.util.List;

public class Linked {
	
	Node head;
	private int j;
	
	public Node getNewNode(int data){
		Node node = new Node();
		node.data = data;
		node.next=null;
		return node;
	}
	
	public void insert(int data){
		Node node= getNewNode(data);
		
		if(head==null){
			head=node;
		}
		
		else{
		Node n = head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=node;
	}
	}
	public void findNumberIndex(LinkedList arr,int z){
		Node n=head;
		z=0;
		while(n.next!=null){
		if(n.data==z){
		System.out.println(z);
		}
		n=n.next;
		z++;
		}
		}
	public void show(){
		Node n =head;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
			
		}
		System.out.println(n.data);
		
	}
	
	public void insertIndex(int i,int data){
		Node node = getNewNode(data);
		if(i==0){
			node.data=data;
			node.next=null;
			Node n=head;
		    node.next=n;
		    head=node;
		}
		
		else {
			Node n=head;
			for(int j=1;j<i;j++){
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
		
		
	}
	
	public void delete(int i){
        Node n = head;
		for(int j=0;j<i;j++){
		n=n.next;
		}
		n.next=n.next.next;
       
		}
	
	
	}

