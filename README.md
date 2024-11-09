#1 Employee CLASS details prgm no.13

 import java.util.*;
 public class Employee
 {
   
          int empsal,emphrs;
          String empname;
          void getinfo(String name,int sal,int hrs)
          {
            empsal=sal;
            empname=name;
            emphrs=hrs;
          }
          
          void addsal()
          {
            if(empsal<500) 
            empsal=empsal+10;
          }
          
          void addwork()
          {
            if(emphrs>6)
            empsal=empsal+5;
          }
          
          public static void main(String args[])
          
          {
            int s,h,x,i;
            String n;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter no of employess:");
            x=sc.nextInt();
            Employee e[]=new Employee[x];
            for(i=0;i<x;i++)
          {
          Employee emp=new Employee();
          System.out.println("enter name of employee : ");
          n=sc.next();
          System.out.println("enter salary");
          s=sc.nextInt();
          System.out.println("enter working hours");
          h=sc.nextInt();
          
          emp.getinfo(n,s,h);
          emp.addsal();
          emp.addwork();
          e[i]=emp;
         }
         
    System.out.println("final salary of employee");
    for(i=0;i<x;i++)
    {
      System.out.println("name:"+e[i].empname);
      System.out.println("salary:"+e[i].empsal);
      System.out.println("working hours"+e[i].emphrs);
    } }
         
 ADDING NOTE: line 40,41 il nextInt() kodukan pattila.. bcoz string ann employee name edukunath so String nn sc=next(); ithrem mathi.
 
          
          
          

          
