package com.chegg.inheritence;

import java.util.NoSuchElementException;

public class LinkedDeque<E> implements DequeInterface<E> {
	// ----------------------------------------------- Internal Node class
	private class Node {
		private E data;
		private Node next;

		private Node(E next) {
			this(next, null);
		}

		private Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	// -------------------------------------------------------------------

	// ======================================================================================
	// Properties
	private Node head = null;
	private Node tail = null;
	private int size = 0;

	// ======================================================================================
	// Constructors
	public LinkedDeque() {

	}

	// ======================================================================================
	// Methods
	@Override
	public boolean add(E e) {
		Node newNode=new Node(e);
		if(head==null || tail==null)
		{
			head=tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
		size++;
		return true;
	}

	@Override
	public E remove() {
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		else
		{
			E data=head.data;
			head=head.next;
			size--;
			return data;
		}
	}

	@Override
	public boolean addFirst(E e) {
		Node newNode=new Node(e);
		newNode.next=head;
		head=newNode;
		size++;
		return true;
	}

	@Override
	public boolean addLast(E e) {
		Node newNode=new Node(e);
		tail.next=newNode;
		tail=newNode;
		size++;
		return true;
	}

	@Override
	public boolean contains(E e) {
		Node current=head;
		while(current!=null)
		{
			if(current.data.equals(e))
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(head==null || tail==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public E peekFirst() {
		if(isEmpty())
			return null;
		return head.data;
	}

	@Override
	public E peekLast() {
		if(isEmpty())
			return null;
		return tail.data;
	}

	@Override
	public E removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		E data=head.data;
		if(head.next==null)
		{
			tail=null;
		}
		head=head.next;
		size--;
		return data;
	}

	@Override
	public E removeLast() {
		if(isEmpty())
			throw new NoSuchElementException();
		E data=tail.data;
		if(head.next==null)
		{
			tail=null;
			head=null;
			size--;
			return data;
		}
		Node current=head;
		while(current.next.next!=null)
		{
			current=current.next;
		}
		current.next=null;
		tail=current;
		size--;
		return data;
		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		this.head=this.tail=null;
		this.size=0;

	}

	@Override
	public String toString() {
		String result="";
		String deli="";
		Node current=head;
		while(current!=null)
		{
			result+=deli;
			result+=current.data;
			current=current.next;
			deli=",";
		}
		return result;
	}
	// ----------------------------------------------- Internal Private Helper
	// Methods

	// -------------------------------------------------------------------------------

}