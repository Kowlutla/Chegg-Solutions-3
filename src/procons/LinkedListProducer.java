package procons;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProducer
{
private LinkedList<String> list = new LinkedList<String>();

   public LinkedListProducer(LinkedList<String> list)
   {
	   //
       this.list = list;
   }

   public void produce(String string)
   {
	   //add the String to list
       list.add(string);
       
       //Iterator iterate through show each element
       Iterator<String> it = list.iterator();
       while(it.hasNext())
       {
    	   //print Object 
          System.out.println(it.next());
       }      
       System.out.println();
   }

}