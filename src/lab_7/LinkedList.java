package lab_7;

// Java program to remove duplicates from a sorted linked list
class LinkedList
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	// Remove duplicates from a sorted list
    public Node removeDuplicates()
    {
        // do nothing if the list is empty
        if (head == null) {
            return null;
        }
 
        Node current = head;
 
        // compare the current node with the next node
        while (current.next != null)
        {
            if (current.data == current.next.data)
            {
                Node nextNext = current.next.next;
                current.next = nextNext;
            }
            else {
                current = current.next;    // only advance if no deletion
            }
        }
 
        return head;
    }
 
					
	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	/* Function to print linked list */
	void printList()
	{
		Node temp = head;
		while (temp.next != null)
		{
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	/* Driver program to test above functions */
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		llist.push(5);
		llist.push(4);
		llist.push(2);
		llist.push(2);
		
		
		System.out.println("List before removal of duplicates");
		llist.printList();
		
		llist.removeDuplicates();
		
		System.out.println("List after removal of elements");
		llist.printList();
	}
}
