package com.lists;
import java.util.Stack;
	public class Empty {
	public static void main(String[] args) {
							Stack<Integer> s=new Stack<>();
							System.out.println(s.empty());
							s.add(10);
							s.add(20);
							s.add(30);
							s.add(40);
							System.out.println(s);
							System.out.println(s.empty());
							System.out.println(s.search(30));
	}
}
