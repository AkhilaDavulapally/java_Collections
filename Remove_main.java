package com.lists;
import java.util.ArrayList;
public class Remove_main{
			public static void main(String[] args) {
				ArrayList<String> s=new ArrayList<>();
				s.add("Tilak");
				s.add("Sai");
				s.add("Akhila");
				s.add("Spandana");
				s.add("Magic");
				System.out.println(s);
				s.remove("Magic");
				System.out.println(s);
				ArrayList<Integer> a=new ArrayList<>();
				a.add(1);
				a.add(2);
				a.add(3);
				System.out.println(a);
				a.remove(2);
				System.out.println(a);
			}
}
