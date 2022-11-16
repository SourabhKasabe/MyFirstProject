package com.list.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// create object
		ArrayList al = new ArrayList();

		al.add("Sourabh");
		al.add("Abhi");
		al.add("Kanchan");
		al.add("Sakshi");
		System.out.println(al);
		 
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
