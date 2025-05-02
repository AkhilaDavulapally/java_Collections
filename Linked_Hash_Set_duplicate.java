package com.lists;
import java.util.LinkedHashSet;
public class Linked_Hash_Set_duplicate {
public static void main(String[] args) {
		LinkedHashSet<Integer> l=new LinkedHashSet<>();
		int a[]= {1,2,3,1,4,1,2,7,4,3};
		for(Integer integer :a) {
			l.add(integer);
		}
		System.out.println(l);
		}
}
