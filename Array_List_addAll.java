package com.lists;
import java.util.ArrayList;
public class Array_List_addAll{
		public static void main(String[] args) {
				ArrayList<Integer> a1=new ArrayList<>();
				a1.add(1);
				a1.add(2);
				a1.add(3);
				a1.add(4);
				System.out.println(a1);
				ArrayList<Integer> a2=new ArrayList<>();
				a2.add(10);
				a2.add(20);
				a2.add(30);
				a1.addAll(a2);
				System.out.println(a1);
				ArrayList<Integer> a3=new ArrayList<>();
				a3.add(-1);
				a3.add(-2);
				a3.add(-3);
				a3.add(-4);
				a3.addAll(2,a2);
				System.out.println(a3);
				
			}
		}
