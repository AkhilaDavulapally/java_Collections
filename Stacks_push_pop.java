package com.lists;
import java.util.Stack;
public class Stacks_push_pop {
public static void main(String[] args) {
						Stack<Integer> s=new Stack<>();
						s.add(10);
						s.add(20);
						s.add(30);
						s.add(40);
						s.push(50);
						s.push(60);
						s.push(70);
						System.out.println(s);
						System.out.println(s.pop());
						System.out.println(s);
						s.push(70);
						System.out.println(s);
	}
}
