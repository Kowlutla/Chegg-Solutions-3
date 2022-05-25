package procons;

import java.util.LinkedList;

public class LinkedListConsumer
{

   private LinkedList<String> list = new LinkedList<String>();

   public LinkedListConsumer(LinkedList<String> list)
   {
   // TODO complete the constructor
       this.list=list;
   }

   public String consumeHead()
   {
	   //store the first element of list in s
	   String s=list.getFirst();
	   //remove the first element
	   list.remove(0);
	   //return element stored in s
	   return s;
   }

   public String consumeTail()
   {
	   //store the last element of list in s
	   String s=list.getLast();
	 //remove the last element
	   list.remove(list.size()-1);
	   //return element stored in s
	   return s;
   }

}