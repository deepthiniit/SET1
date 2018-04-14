package com.niit;

public class Program5 {
	public static int[] retrievePosition(int[] a,int[] b){
		int[] c=new int[a.length];
		int i;
		for(i=0;i<c.length;i++){
			if(i%2==0)
				c[i]=b[i];
			if(i%2!=0)
				c[i]=a[i];
		}
			return c;
		
	}
	public static void main(String[] args){
		int[] a={12,2,4,8};
		int[] b={7,5,13,8};
		int[] c=retrievePosition(a,b);
		for(int d:c)
			System.out.println(d);
	}
		
		

}
