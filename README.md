## JAVA PROGRAM 
# EMployee details using CLASS 

``` bash
import util.java.*;
public class EmployeeClass
        {
           int empsal,emphrs;
           String empname;
           void getInfo(String name,int sal,int hrs)
             {
              empsal=sal; 
              emphrs=hrs;
              empname=name;
              }
            void addsal()
            {
            if (empsal<500)
            empsal=empsal+10;
            }
             
            void addhrs()
            {
            if (emphrs>6)
            emphrs=emphrs+5;
            }
            
       public static void main(String args[])
       
       {
        int s,h,x,i;
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enetr no of employeess");
        x=sc.nextInt();
        Employee e[]=new Employee[x];
        for(i=0;i<x;i++)
        {
        Employee emp=new Employee();
        System.out.println("enter name of employess");
        n=sc.nextInt();
        System.out.println("enter salary");
        s=sc.nextInt();
        System.out.println("enter hours");
        h=sc.nextInt();
        emp.getInfo(n,sh,h);
        emp.addsal();
        emp.addwork();
        e[i]=emp;
        }
       
       System.out.println("----------final salary---------");
       for(i=0;i<x;i++)
       {
       System.out.println("Name:"+e[i].empname);
       System.out.println("work hours"+e[i].emphrs);
       System.out.println("Final salary:"+e[i].empsal());
       }
       }
       }
```

# 2: 
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
