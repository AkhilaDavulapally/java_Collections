package com.lists;
import java.util.LinkedHashSet;
public class Duplicate {
public static void main(String[] args) {
			LinkedHashSet<Integer> li=new LinkedHashSet<>();
			int a[]= {1,2,3,2,4,3,1,5,5};
			for(Integer i :a) {
				li.add(i);
			}
			System.out.println(li);
			Object a1[]=li.toArray();
			for(Object o:a1)
			{
				System.out.println(o);
			}
}
}
