package com.chegg.one;

class FirstLastList {
	private Link first; // ref to first link
	private Link last; // ref to last link
// -------------------------------------------------------------

	public FirstLastList() // constructor
	{
		first = null; // no links on list yet
		last = null;
	}

// -------------------------------------------------------------
	public boolean isEmpty() // true if no links
	{
		return first == null;
	}

// -------------------------------------------------------------
	public void insertFirst(int dd) // insert at front of list
	{
		Link newLink = new Link(dd); // make new link

		if (isEmpty()) // if empty list,
			last = newLink; // newLink <-- last
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

// -------------------------------------------------------------
	public void insertLast(int dd) // insert at end of list
	{
		Link newLink = new Link(dd); // make new link
		if (isEmpty()) // if empty list,
			first = newLink; // first --> newLink
		else
			last.next = newLink; // old last --> newLink
		last = newLink; // newLink <-- last
	}

// -------------------------------------------------------------
//public long deleteFirst() // delete first link
	public Link deleteFirst() // delete first link
	{ // (assumes non-empty list)
//long temp = first.dData;
		Link temp = first;
		if (first.next == null) // if only one item
			last = null; // null <-- last
		first = first.next; // first --> old next
		return temp;
	}

// -------------------------------------------------------------
	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; // start at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}

	public Link getLast() {
		return last;
	}

	public int getSize() {
		int size = 0;
		Link current = first; // start at beginning
		while (current != null) // until end of list,
		{
			size++;
			current = current.next; // move to next link
		}
		return size;

	}
// -------------------------------------------------------------

	public void join(FirstLastList lst2) {
		if(isEmpty()) {
			first=last=lst2.first;
		}
		else {
			last.next=lst2.first;
		}
		last=lst2.last;
		lst2.first=null;
		lst2.last=null;
		
	}

	public void swap() {
		int size=getSize();
		if(size<2) {
			throw new RuntimeException("Contain less than 2 elements");
		}
		else {
			
			int data=last.iData;
			last.iData=first.iData;
			first.iData=data;
			
		}
		
	}
} // end class FirstLastList