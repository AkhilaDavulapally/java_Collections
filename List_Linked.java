package com.lists;
import java.util.*;
public class List_Linked {
			public static void main(String[] args) {
					LinkedList<Integer> li=new LinkedList<Integer>();
					li.add(10);
					li.add(20);
					li.add(30);
					li.add(40);
					System.out.println(li);
					li.addFirst(98);
					System.out.println(li);
					li.addLast(100);
					System.out.println(li);
					li.removeFirst();
					System.out.println(li);
					li.removeLast();
					System.out.println(li);
				}
}
