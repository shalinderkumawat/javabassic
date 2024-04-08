
1)
Problem Statement – Chaman planned to choose a four digit lucky number for his car. His
lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by 3 or 5 or
7. Provide a valid car number, Fails to provide a valid input then display that number is not a
valid car number.
Note : The input other than 4 digit positive number[includes negative and 0] is considered as
invalid.
Refer the samples, to read and display the data.


Sample Input 1:
Enter the car no:1234
Sample Output 1:
Lucky Number


Sample Input 2:
Enter the car no:1214
Sample Output 2:
Sorry its not my lucky number


Sample Input 3:
Enter the car no:14
Sample Output 3:
14 is not a valid car number
import java.util.*;
public class Testt {
    public static void main(String [] args)
    {
        System.out.print("Enter the your car number :");
        Scanner input=new Scanner (System.in);
        int num=input.nextInt();
        int rem;
        int sum=0;

        if(num>=1000&&num<=9999){
        
        while (num!=0) {

            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(sum%3==0||sum%7==0||sum%5==0)
        {
        System.out.println(sum+"Lucky number ");
        }
        else 
        {
            System.out.println("provide a valid input then display that number is not a valid car number");
        }

    }
    else {
        System.out.println("error");
    }

    }
    
}

2)
Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the
lesson on seasons. When her teacher tells a month, she needs to say the season
corresponding to that month. Write a program to solve the above task.
Spring – March to May,
Summer – June to August,
Autumn – September to November and,
Winter – December to February.
Month should be in the range 1 to 12. If not the output should be “Invalid month”.
Sample Input 1:
Enter the month:11
Sample Output 1:
Season:Autumn
Sample Input 2:
Enter the month:13
Sample Output 2:
Invalid month

import java.util.*;
public class Testt {
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println(" 12 to 2= December to February. 3 to 5= March to May, 6 to 8=June to August, 9 to 11=September to November");
        System.out.print("Teacher This month :");
        int teacher=input.nextInt();
        if(teacher>=3||teacher<=5)
        {
            System.out.println("Rhea Pandey =Spring - March to May ");
        }
        else  if(teacher>=6||teacher<=8)
        {
            System.out.println("Rhea Pandey =Summer - June to August ");
        }
        else  if(teacher>=9||teacher<=5)
        {
            System.out.println("Rhea Pandey =Autumn - September to November ");
        }
        else if(teacher>=3||teacher<=5)
        {
            System.out.println("Rhea Pandey =Winter - December to February ");
        }

        else 
        {
            System.out.println("Invalid month");
        }
        
       
    }
    
}


3)
Write a method that takes two parameters (int x and int y) and returns their sum.


import java.util.*;
public class Testt {
    int show(int x,int y)
    {
       int c=x+y;
       return c;
    }
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        Testt sc=new Testt();
        System.out.println(sc.show(x, y));
    }
    
}


4)
Create a method that checks whether a given number is even or odd.

import java.util.*;
public class Testt {
    void show(){
        Scanner input=new Scanner (System.in);
        int x=input.nextInt();
        if(x%2==0)
        {
            System.out.println("even number"+x);
        }
        else {
            System.out.println("odd number "+x);
        }
    }
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        
        Testt sc=new Testt();
        sc.show();
    }
    
}


5)
Implement a method to calculate the factorial of a given number.

import java.util.*;
public class Testt {
    void show(){
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number ");
        int a=input.nextInt();
        int fact=1;
        for(int s=1;s<=a;s++)
        {
            fact=fact*s;
        }
        System.out.println(fact);
    }
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        
        Testt sc=new Testt();
        sc.show();
    }
    
}


6)
Create a method that calculates the power of a number (x^y).


-------------------------------------------
7)
Create a method that prints the Fibonacci series up to a given limit.

import java.util.*;
public class Testt {
    void show(){
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number ");
        int last=input.nextInt();
        int start=0;
        int second=1;
        int num;

        System.out.print(start+" ");
        System.out.print(second+" ");
        for(int a=1;a<=last;a++)
        {    
                    num=start+second;
                    System.out.print(num+" ");

            start=second;
            second=num;
            
            
        }

    }
    public static void main(String [] args)
    {
       
        
        Testt sc=new Testt();
        sc.show();
    }
    
}


8)
Write a method to check if a given number  is a palindrome.
Write a Java method called swapValues that takes two integer parameters and swaps their values

import java.util.*;
public class Testt {
   void palindrom()
   {
    Scanner input=new Scanner (System.in);
    System.out.println("Enter the number ");
    int num=input.nextInt();
    int rem,sum=0;
    int temp=num;

    while (num!=0) {

        rem=num%10;
        sum=sum*10+rem;
        num=num/10;
        
    }
    if(temp==sum){
    System.out.println("yes palindrom number "+sum);
    }
    else{
        System.out.println(" not palindrom ");
    }
   }
   void swap()
   {
    Scanner input=new Scanner (System.in);
    System.out.print("Enter the first swap number ");
    int a=input.nextInt();
    System.out.print("Enter the second number of swap value ");
    int b=input.nextInt();

    System.out.println("real value of a:"+a);
    System.out.println("real value of b :"+b);

     a=a+b;
     b=a-b;
     a=a-b;

     System.out.println("swap value of a:"+a);
     System.out.println("swap value of b :"+b);
 

   }
    public static void main(String [] args)
    {
       
        
        Testt sc=new Testt();
        sc.palindrom();
        sc.swap();
    }
    
}


9)
Default Constructor:
Write a Java class with a default constructor. Print a message inside the constructor to indicate that it has been called.



import java.util.*;
public class Testt {
   Testt()
   {
    System.out.println("constructor to indicate");
   }
    public static void main(String [] args)
    {
       
        
        Testt sc=new Testt();
        
    }
    
}

10)
Parameterized Constructor:
Create a class with a parameterized constructor that takes two integers as parameters and initializes two instance variables

import java.util.*;
class A{
    int a;
    int b;  
    A(int a,int b){
        this.a=a;
        this.b=b;

    }
}
public class Testt {
   
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
       A sc=new A(a,b);
        
        
        
    }
    
}

11)
Initialization Block:
Use an instance initialization block to initialize an instance variable in a class.


import java.util.*;

public class Testt {

    int a;
    {
        System.out.println(a);
    }
   
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
         
       Testt sc=new Testt();
        
        
        
    }
    
}

12)
java program to enter student marks and find percentage and grade
A college has the following rules for the grading system:
5 marks (grade + %)
1. Below 25 – F
2. 25 to 45 – E
3. 45 to 50 – D
4. 50 to 60 – C
5. 60 to 80 – B 
6. Above 80 – Amake a question

import java.util.*;

public class Testt {

   
    public static void main(String [] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first sub number :");
       int a=input.nextInt();
       System.out.print("Enter second sub number :");
       int b=input.nextInt();
       System.out.print("Enter threed sub number :");
       int c=input.nextInt();
       System.out.print("Enter fourth sub number :");
       int d=input.nextInt();
       System.out.print("Enter five sub number :");
       int e=input.nextInt();

       int sum=a+b+c+d+e;
       float per= (float)sum/500*100;

       if(per<25.0)
       {
        System.out.println("f");
       }
       if(per>25.0&&per<45.0)
       {
        System.out.println("E");
       }
       if(per>45.0&&per<50.0)
       {
        System.out.println("D");
       }
       if(per>50.0&&per<60.0)
       {
        System.out.println("C");
       }
       if(per>60.0&&per<80.0)
       {
        System.out.println("B");
       }
       if(per>80.0&&per<=90.99)
       {
        System.out.println("B");
       }
    }
    
}


13)
Write a java program to read the roll no, name,fnname and marks of three subjects and calculate the total, percentage and division.
Test Data :
Input the Roll Number of the student :784
student name : 
fname:
mname:
address:
contact:
Input the marks of Physics, Chemistry and Computer Application : 70 80 90
total: 
precentage : % 
division:make a question

import java.util.*;

public class Testt {

   
    public static void main(String [] args)
    {
       Scanner input=new Scanner(System.in);

       System.out.print("Inupt your rollnumber :");
       int reoll=input.nextInt();
       System.out.println("Student name :");
       String name=input.nextLine();
       System.out.println("Father name :");
       String fname=input.nextLine();
       System.out.println("mother name :");

       String mname=input.nextLine();


       System.out.print("Physics :");
       int a=input.nextInt();
       System.out.print("chemistry :");
       int b=input.nextInt();
       System.out.print("computer application :");
       int c=input.nextInt();
       

       int sum=a+b+c;
       System.out.println("Totel :"+sum);
       float per= (float)sum/30*100;

       if(per<25.0)
       {
        System.out.println("f");
       }
       if(per>25.0&&per<45.0)
       {
        System.out.println("E");
       }
       if(per>45.0&&per<50.0)
       {
        System.out.println("D");
       }
       if(per>50.0&&per<60.0)
       {
        System.out.println("C");
       }
       if(per>60.0&&per<80.0)
       {
        System.out.println("B");
       }
       if(per>80.0&&per<=90.99)
       {
        System.out.println("B");
       }
       else{
        System.out.println("fail");
       }
    }
    
}


14)
Write a program in your preferred programming language that includes functions/methods to perform the following tasks:

Check if a given number is a palindrome.
Determine whether a number is an Armstrong number.
Calculate the factorial of a given number.
Check if a number is prime.
Generate the Fibonacci series up to a specified term.


import java.util.*;
public class Testt{
    void pali()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of a");
        int num=input.nextInt();
        int rem,sum=0;
        int temp=num;

        while (num!=0) {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
            
        }
        if(sum==temp)
        {
            System.out.println("palindrom number ");
        }
        else 
        {
            System.out.println("not palindrom number ");
        }
    }
    void armst()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of a");
        int num=input.nextInt();
        int rem,sum=0;

        int temp=num;

        while (num!=0) {
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(sum==temp)
        {
        System.out.println(sum+"armstrong number ");
        }
        else 
        {
            System.out.println("not armstrong number ");
        }
    }

    
    void show(){
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number ");
        int a=input.nextInt();
        int fact=1;
        for(int s=1;s<=a;s++)
        {
            fact=fact*s;
        }
        System.out.println(fact);
    }
    void prime()
    {
        Scanner input=new Scanner (System.in);

        int num=input.nextInt();

        for(int a=1;a<=num;a++)
        {
            if(num%a==0)
            {
                if(num%num==0)
                {
                    System.out.println("prime number ");
                }
                 else{
                System.out.println("not prime number ");
            }
            }
           
        }
    }

    void fibo(){
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number ");
        int last=input.nextInt();
        int start=0;
        int second=1;
        int num;

        System.out.print(start+" ");
        System.out.print(second+" ");
        for(int a=1;a<=last;a++)
        {    
                    num=start+second;
                    System.out.print(num+" ");

            start=second;
            second=num;
            
            
        }

    }
    public static void main(String [] args)
    {
        Testt sc=new Testt();
        sc.pali();
        sc.armst();
        sc.show();
        sc.prime();
        sc.fibo();
    }
}


15)
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 

public class Testt{
    public static void main(String [] args)
    {
        for(int i=1;i<=6;i++)
        {
            for(int s=4;s>=i;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}


16)
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 	











17)
XYZ Technologies is in the process of increment the salary of the employees. This
increment is done based on their salary and their performance appraisal rating.
If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
If the appraisal rating is between 3.1 and 4, the increment is 25% of the salary.
If the appraisal rating is between 4.1 and 5, the increment is 30% of the salary.
Help them to do this, by writing a program that displays the incremented salary. Write a
class “IncrementCalculation.java” and write the main method in it.
Note : If either the salary is 0 or negative (or) if the appraisal rating is not in the range 1 to
5 (inclusive), then the output should be “Invalid Input”.
Sample Input 1 :
Enter the salary
8000
Enter the Performance appraisal rating
3
Sample Output 1 :
8800
Sample Input 2 :
Enter the salary
7500
Enter the Performance appraisal rating
4.3
Sample Output 2 :
9750
Sample Input 3 :
Enter the salary
-5000
Enter the Performance appraisal rating
6
Sample Output 3 :
Invalid Input



import java.util.*;
public class Testt
{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your selery");
        int selery=input.nextInt();
        System.out.println("Enter the performenc rating :");
        float rating=input.nextFloat();
        
        double totel;
 
        if(rating==1&&rating>=3)
        {
           totel=selery*0.10;
            System.out.println(totel);
        }
        else if(rating >=3.1&&rating<=4)
        {
            totel=selery*0.20;
            System.out.println(totel);
            System.out.println(totel+selery);
        }
        else if(rating >=4.1&&rating<=  5)
        {
            totel=selery*0.30;
            System.out.println(totel);
            System.out.println(totel+selery);
        }
        else
        {
            System.out.println("invalide input");
        }

        
    }
}



18)
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *

public class Main
{
    public static void main(String [] args)
    {
        for(int i=1;i<6;i++)
        {
            for(int s=5;s>i;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
       for(int i=1;i<=5;i++)
       {
           for(int s=3;s<=i;s++)
           {
               System.out.print(" ");
           }
           for(int j=5;j>=i;j--)
           {
               System.out.print(" *");
           }
           System.out.println("");
       }
    }
}


19)
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 


public class Main
{
    public static void main(String [] args)
    {
        for(int i=1;i<6;i++)
        {
            // for(int s=5;s>i;s--)
            // {
            //     System.out.print(" ");
            // }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
       for(int i=1;i<=5;i++)
       {
        //   for(int s=3;s<=i;s++)
        //   {
        //       System.out.print(" ");
        //   }
           for(int j=5;j>=i;j--)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
    }
}


20)
1 6 11 16 21 
2 7 12 17 22
3 8 13 18 23 
4 9 14 19 24
5 10 15 20 25

public class Main
{
    public static void main(String [] args)
    {
        int a=1;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                
              System.out.print(a+" ");
                a++; 
               
            } 
            System.out.println("");
        }
       
    }
}



