package com.Sets;
import java.util.*;
public class Student implements Comparator {
		   String stu_name;
		   int stu_age;
		   int stu_rollno;
		   int stu_grade;
		   char stu_gender;
		   public void setDetails(String stu_name,int stu_age, int stu_rollno, int stu_grade, char stu_gender)
		   {
			   this.stu_name=stu_name;
			   this.stu_age=stu_age;
			   this.stu_rollno=stu_rollno;
			   this.stu_grade=stu_grade;
			   this.stu_gender=stu_gender;
		   }
		   public int compare(Object o1,Object o2) {
			   Student i1=(Student)o1;
			   Student i2=(Student)o2;
			   if(i1.stu_rollno>i2.stu_rollno)
			   {
				   return -1;
			   }
			   else if(i1.stu_rollno>i2.stu_rollno)
			   {
				   return 1;
			   }
			   return 0;
		   }
		   public String toString()
		   {
			   return "Name:"+stu_name+"\nage:"+stu_age+"\nrollno:"+stu_rollno+"\ngrade:"+stu_grade+"\ngender:"+stu_gender+"\n************************";
		   }
}
