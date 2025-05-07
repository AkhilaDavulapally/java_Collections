package com.Sets;
import java.util.*;
public class Tree_set_heterogenous {
	public static void main(String[] args) {
		TreeSet t=new TreeSet<>();
		t.add(new StringBuilder("a"));
		t.add(new String("A"));
		t.add(new StringBuffer("Z"));
	}
}
