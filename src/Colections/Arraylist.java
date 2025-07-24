package Colections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add(5);
		list.add("hello");
		list.add(100);
		list.add(null);
		list.add(100);
		list.add("welcome");
		System.out.println("size of an arraylist is " +list.size());
		System.out.println("data in arraylist is " +list);
		
		list.remove(2);
		
		System.out.println("data in arraylist is after removing  " +list);
		
		list.add(0,500);
		System.out.println("data in arraylist after insertion " +list);
		
		list.set(0, 80);
		System.out.println("data in arraylist after replacement " +list);
		
		System.out.println(list.get(4));
		
		for(int i =0 ; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		for(Object x:list)
		{
			System.out.println(x);
		}
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(list.isEmpty());
		//System.out.println(list.removeAll(list));
		
		ArrayList list2 = new ArrayList();
		list2.add(100);
		list2.add(80);
		list2.add("hi");
		System.out.println(list2);
		
		list.removeAll(list2);
		System.out.println(list);
		

		

	}

}
