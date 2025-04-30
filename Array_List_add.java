package com.lists;
import java.util.ArrayList;
public class Array_List_add {
	public static void main(String[] args) {
			ArrayList<Integer> a=new ArrayList<>(3);
			a.add(10);
			a.add(20);
			a.add(30);
			System.out.println(a);
			a.add(40);
			System.out.println(a);
			a.add(1,11);
			System.out.println(a);
			}
}
