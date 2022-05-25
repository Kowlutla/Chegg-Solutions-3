package com.chegg.intern.copy;

import java.util.Arrays;

//Tester program to test InternshipDemo class
public class Tester {

	public static void main(String[] args) {
		int a=511709;
		int sum=0;
		while(a!=0)
		{
			sum+=a%10;
			a=a/100;
		}
		System.out.println(sum);
	}
	
	static int fun(int nums[])
	{
		int c=nums.length/2;
		for(int num:nums)
		{
			int count=0;
			for(int e:nums)
			{
				if(e==num)
				{
					count++;
				}
			}
			if(count>c)
			{
				return num;
			}
		}
		return -1;
	}
}
