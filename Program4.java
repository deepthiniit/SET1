package com.niit;

import java.util.Arrays;
import java.util.HashSet;

public class Program4 {
	public static void main(String[] args){
		Integer[] i1={1,2,3,4};
		Integer[]i2={3,4,5,6};
		HashSet<Integer> set1=new HashSet<>(Arrays.asList(i1));
		HashSet<Integer> set2=new HashSet<>(Arrays.asList(i2));
		set1.retainAll(set2);
		int sum=0;
		for(int a:set1)
		{
			sum=sum+a;
		}
		System.out.println("Sum of elements is:"+sum);
	}

}
