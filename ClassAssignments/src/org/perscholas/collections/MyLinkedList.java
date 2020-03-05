package org.perscholas.collections;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> c1= new LinkedList<Integer>();
		LinkedList<Integer> c2= new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			if(i!=9)
				c1.add(i);
			if(i%2==0 || i%3==0)
				c2.add(i);
		}
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
		LinkedList<Integer> c = new LinkedList<Integer>();
		c.addAll(c1);
		c.addAll(c2);
		System.out.println("c="+c);
		Collections.sort(c);
		System.out.println("Sorted List:"+c);
		
	}

}
