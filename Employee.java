package com.Sets;
import java.util.*;
public class Employee implements Comparable {
	   String emp_Name;
	   int emp_Id;
	   int emp_Age;
	   double emp_Sal;
	   int emp_Join_Year;
	   public Employee(String emp_Name,int emp_Id,int emp_Age,double emp_Sal, int emp_Join_Year)
	   {
		   this.emp_Age=emp_Age;
		   this.emp_Id=emp_Id;
		   this.emp_Name=emp_Name;
		   this.emp_Join_Year=emp_Join_Year;
		   this.emp_Sal=emp_Sal;
	   }
	   public int compareTo(Object o) {
		   Employee e=(Employee)o;
		   if(this.emp_Sal>e.emp_Sal)
		   {
			   return 1;
		   }
		   else if(this.emp_Sal<e.emp_Sal)
		   {
			   return -1;
		   }
		   return 0;
	   }
	   public String toString()
	   {
		   return "Name:"+emp_Name+"\nId:"+emp_Id+"\nAge:"+emp_Age+"\nSalary:"+emp_Sal+"\nYear of Joining:"+emp_Join_Year+"\n************************";
	   }
}
