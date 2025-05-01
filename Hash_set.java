package com.lists;
import java.util.*;
public class Hash_set{
public static void main(String[] args) {
							HashSet<Object> h=new HashSet<>();
						    h.add("Tilak");
							h.add("Sai");
							h.add("Spandana");
							h.add("Akhila");
							System.out.println(h);
							System.out.println(h.add(10));
							System.out.println(h.add("Sai"));
							h.add(null);
							System.out.println(h);
						}
}
