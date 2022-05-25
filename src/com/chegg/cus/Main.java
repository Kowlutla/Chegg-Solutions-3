package com.chegg.cus;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		int T=Integer.parseInt(sc.nextLine());
//		while(T-->0)
//		{
//			int n=Integer.parseInt(sc.nextLine());
//			String line=sc.nextLine();
//			String[]votes=line.split(" ");
//			
//			HashMap<String,Integer>map=new HashMap<>();
//			for(String s:votes)
//			{
//				if(map.get(s)!=null)
//				{
//					map.put(s, map.get(s)+1);
//				}
//				else
//				{
//					map.put(s, 1);
//				}
//			}	
//			int max=0;
//			for(Map.Entry<String, Integer>e:map.entrySet())
//			{
//				int value=e.getValue();
//				if(value>max)
//				{
//					max=value;
//				}
//			}
//			
//			ArrayList<String>list=new ArrayList<String>();
//			for(Map.Entry<String, Integer>e:map.entrySet())
//			{
//				int value=e.getValue();
//				if(value==max)
//				{
//					list.add(e.getKey());
//				}
//			}
//			Collections.sort(list);
//			System.out.println(list.get(0)+" "+max);
//		}
		
		
		int n=11444;
		String s=n+"";
		s=s.replaceAll("144", "");
		s=s.replaceAll("14", "");
		s=s.replaceAll("1", "");
		if(s.length()==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
