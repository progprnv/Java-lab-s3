# 1 Employee CLASS details prgm no.13

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


 # 2 FInd area perimetr diagonal midpoint iof RECTANGLE USING CLASS 

```
 import java.util.*;
public class Rectangle {
    float length,breadth;
    void setdim(float length,float breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void getarea()
    {
        float area=(length*breadth);
        System.out.println("area of rectangle:"+area);
    }
    void getperimeter()
    {
        float perimeter=(2*(length+breadth));
        System.out.println("perimeter of rectangle;"+perimeter);
    }
    void getdiagonal()
    {
        double diagonal=Math.sqrt((length*length)+(breadth*breadth));
        System.out.println("diagonal of rectangle"+diagonal);
    }
    void getmidpoint(float x,float y)
    {
        x=((length+(2*x))/2);
        y=((breadth+(2*y))/2);
        System.out.println("midpoint:x"+x+"y"+y);
    }
    public static void main(String args[])
    {
        float l,b,x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth:" );
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter coordinates: ");
        x=sc.nextInt();
        y=sc.nextInt();
        Rectangle r=new Rectangle();
        r.setdim(l,b);
        r.getarea();
        r.getperimeter();
        r.getdiagonal();
        r.getmidpoint(x,y);
    }
}
```

# 3 
    

          
          
          

          
