package com.Sets;
import java.util.TreeSet;
public class Stu_Alpha_order {
		public static void main(String[] args) {
	        Student s1=new Student();
			s1.setDetails("akhila",12,501,8,'f');
			Student s2=new Student();
			s2.setDetails("Spandana",13,502,7,'f');
			Student s3=new Student();
			s3.setDetails("Deepthi",14,503,6,'f');
			TreeSet<Student> t=new TreeSet<>(new Student());
			t.add(s1);
			t.add(s2);
			t.add(s3);
			System.out.println(t);
			
		}
}
