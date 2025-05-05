package com.Sets;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>(new Descending());
		t.add(20);
		t.add(10);
		t.add(100);
		t.add(-3);
		System.out.println(t);
	}
}
class Descending implements Comparator {
	public int compare(Object o1,Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1>i2)
		{
			return -1;
		}
		else if(i1<i2)
		{
			return 1;
		}
		return 0;
	}
}
