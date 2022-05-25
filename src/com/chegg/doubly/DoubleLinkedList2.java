package com.chegg.doubly;

public class DoubleLinkedList2
{
	//private Class Node
	private class Node
	{
		int data;
		Node next;
		Node previous;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.previous=null;
		}

	}
	
	//head points to start of list 
	private Node head;
	//tail points to end of list
	private Node tail;
	//size store number of elements in list
	private int size;
	
	//Default Constructor to create DoubleLinkedList2 Object
	public DoubleLinkedList2() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	//method to add element at start of list
	public void addStart(int data)
	{
		Node node=new Node(data);
		node.previous=null;
		node.next=head;
		if(head!=null)
		{
			head.previous=node;
		}
		head=node;
		if(tail==null)
		{
			tail=node;
		}
		size++;
	}
	
	//Method to add element to end of list
	public void addEnd(int data)
	{
		Node node=new Node(data);
		node.previous=tail;
		node.next=null;
		if(tail!=null)
		{
			tail.next=node;
		}
		tail=node;
		if(head==null)
		{
			head=node;
		}
		size++;
	}
	
	
	//method to remove element from end of list
	public int removeEnd()
	{
		//if no elements in list, then throw exception
		if(tail==null)
		{
			throw new RuntimeException("List is Empty");
		}
		//store the last value in list
		int value=tail.data;
		//change pointers
		tail.previous.next=null;
		tail=tail.previous;
		//decrease size
		size--;
		//return value
		return value;
	}
	
	//toString method to return string representation of list
	public String toString() {
		StringBuffer sb=new StringBuffer();
		Node current=head;
		while(current!=null) {
			sb.append(current.data+" ");
			current=current.next;
		}
		sb.append("\n");
		return sb.toString();
	}
	
	//method to return size of list
	public int size() {
		return this.size;
	}
}