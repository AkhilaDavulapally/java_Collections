package com.lists;
import java.util.ArrayList;
public class Remove_All_main{
			public static void main(String[] args) {
					ArrayList<Integer> a1=new ArrayList<>();
					a1.add(1);
					a1.add(3);
					a1.add(5);
					a1.add(1);
					a1.add(3);
					a1.add(2);
					a1.add(3);
					a1.add(4);
					a1.add(2);
					System.out.println(a1);
					ArrayList<Integer> a2=new ArrayList<>();
					a2.add(1);
					a2.add(2);
					a2.add(3);
					System.out.println(a2);
					a1.removeAll(a2);
					System.out.println(a1);
			}
}
