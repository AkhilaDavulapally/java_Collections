package com.lists;
import java.util.ArrayList;
import java.util.Iterator;
		public class Iterators_previous  {
			
				public static void main(String[] args) {
					ArrayList<Integer> a=new ArrayList<>();
					a.add(1);
					a.add(2);
					a.add(3);
					Iterator<Integer> i=a.iterator();
					while(i.hasNext())
					{
					System.out.println(i.next());
					}
					Iterator<Integer> i1=a.iterator();
					while(i1.hasPrevious())
					{
					System.out.println(i1.previous());
					}
				}
}
