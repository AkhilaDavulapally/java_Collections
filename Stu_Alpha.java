package com.Sets;
import java.util.Comparator;
	public class Stu_Alpha implements Comparator {
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
				   Stu_Alpha i1=(Stu_Alpha)o1;
				   Stu_Alpha i2=(Stu_Alpha)o2;
				   String s1=i1.stu_name.toLowerCase();
				   String s2=i2.stu_name.toLowerCase();
				   
				   if(i1.stu_name.charAt(0)>i2.stu_name.charAt(0))
				   {
					   return 1;
				   }
				   else if(i1.stu_name.charAt(0)<i2.stu_name.charAt(0))
				   {
					   return -1;
				   }
				   return 0;
			   }
			   public String toString()
			   {
				   return "Name:"+stu_name+"\nage:"+stu_age+"\nrollno:"+stu_rollno+"\ngrade:"+stu_grade+"\ngender:"+stu_gender+"\n************************";
			   }

}
