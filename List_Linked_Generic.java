package com.lists;
import java.util.LinkedList;
public class List_Linked_Generic {
					public static void main(String[] args) {
						LinkedList<Object> li=new LinkedList<>();
						LinkedList<Object> li1=new LinkedList<>();
						li.add("Tilak");
						li.add(1);
						li.add('S');
						li.add(true);
						li.add(null);
						li1.add("Tilak");
						li1.add(1);
						li1.add('S');
						li1.add(true);
						li1.add(null);
						System.out.println(li);
						System.out.println(li1);
					}
}
