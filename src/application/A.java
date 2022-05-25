package application;

import java.util.ArrayList;
import java.util.List;

public class A {
	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		removeRange(list, 3, 5);
		System.out.println(list);
	}
	
	
	
	public static void removeRange(List myList,int x,int y) {
		
		//start from x position to y position
		for(int i=x;i<=y;i++) {
			//remove the value from list
			myList.remove(x);
		}
	}
}
