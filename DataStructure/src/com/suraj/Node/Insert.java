package com.suraj.Node;

public class Insert{
public static void main(String[] args){

int[] arr= {1,6,3,8,9,100,1888};
int z=6;
Java j= new Java();
j.findNumberIndex(arr,z);
}
}
class Java{
Node head;

public void findNumberIndex(int[] arr,int z){
Node n=head;
int x=0;
while(n.next!=null){
if(n.data==z){
System.out.println(x);
}
n=n.next;
x++;
}
}
}


