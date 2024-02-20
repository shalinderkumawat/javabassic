1)
when a user input a value and check the value is greater than 50 or not :

 import java.util.*;
public class Main
{
     public static void main (String[] args) 
    {
        Scanner inputdo=new Scanner (System.in);
        int number=inputdo.nextInt();
        if(number<=50)
      {
            System.out.print("this number is grater than of 50:");
            
      }
        
        else{
            
      System.out.print("this numbre is not grater than of 50:");
    }
    }
}

2)
when a user input a value and check the value is greater than 342 or not :


import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.print("enter the number of grater than : ");
        int number=inputdo.nextInt();
        if (number>342)
        {
            System.out.print("this number is grater than of  342");

        }
        else{
            System.out.print("this number is not grater than of 342:");
        }
    }
}

3)
when a user input a value and check the value is less than 50 or not :


import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.print("enter the number :");
        int number=inputdo.nextInt();
        if(number<50)
        {
            System.out.print("this number is lass than of 50");
        }
        else
        {
            System.out.print("this nunber is not lass than of 50");
        }
    }
}

4)when a user input a value and check condition number is even or odd

import java.util.*;
public class Main
{
    public static void main(String[] args)
 {
   Scanner inputdo=new Scanner (System.in);
   System.out.println("enter the number of 1 to 0 ");
   int number =inputdo.nextInt();
   if(number%2==0)
   {
       System.out.println("this number is even");
   }
   else{
       System.out.println("this number is odd");
   }

 }
}

5)when a user input a value and check a number is divisible by 5 or not

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the number :");
        int number=inputdo.nextInt();
        if(number/5==0)
        {
            System.out.print("this number is divide of 5");
        }
        else
        {
            System.out.println("this number is not divde by 5");

        }
    }
}

6)when a user input a value and check a number is divisible by 88 or not

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner(System.in);
        System.out.print("enter the vaue");

        int number=inputdo.nextInt();
        if(number/88==0)
        {
            System.out.print("this number is divide by 88 ");

        }
        else{
            System.out.println("this number is not divide by 88 :");

        }
    }
}

7)when a user input a value and check a number is equal 88 or invalid


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the value :");
        int number=inputdo.nextInt();
        if(number==88)
        {
            System.out.print("this number is equal 88");

        }
        else{

        System.out.print("this numbe ris not equal 88");

        }
    }
}

8)when a user input a character and compare b :ball otherwise not valid


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character :");
        char number=inputdo.next().charAt(0);
        if(number=='b')
        {
            System.out.print("ball");

        }
        else{

        System.out.print("this cahracter is not match");

        }
    }
}


9)when a user input a character and compare k :kite otherwise not valid


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner(System.in);
        System.out.println("enter the character :");
        char condition=inputdo.next().charAt(0);
        if(condition=='k')
        {
            System.out.println("kite");
        }
        else
        {
            System.out.println("this character id not match");
        }
    }
}

10)when a character input :
a :
a+b


 	import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character :");
        char value=inputdo.next().charAt(0);
        if(value=='a'||value=='A')
        {
            System.out.println("enter the two number of add :");
            int add1=inputdo.nextInt();
            int add2=inputdo.nextInt();
            int sum=add1+add2;
            System.out.println("the add is :"+" " +sum);
        }
        else{
            
           System.out.print("not match");
        }
        
    }
}


11)
when a character input :
s :
a-b



import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character :");
        char comp=inputdo.next().charAt(0);
        if(comp=='s')
        {
            System.out.println("enter the number of subtraction :");
            int number,number1;
            number=inputdo.nextInt();
            number1=inputdo.nextInt();
            int sub=number-number1;
            System.out.println("the subtraction of is :" +sub);
        }
        else{


            System.out.println("not match");
        }

    }
}

12)
when a character input :
m :
a*b *c

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character :")
        char value=inputdo.next().charAt(0);
        if(value=='m')
        {
            System.out.print("enter the value of multiply");
            int number=inputdo.nextInt();
            int number2=inputdo.nextInt();
            int number3=inputdo.nextInt();
            int multiply=number*number2*number3;
            System.out.println("the multiply number and number 2 and number3 :"+ multiply);
        }
        else{
            System.out.println("not match");
        }
    }
}


13)
when a character input :
d:
a/b

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character :");
        char value=inputdo.next().charAt(0);
        if(value=='d')
        {

            System.out.println("enter the number of divide :");
            int number,number1;
            number=inputdo.nextInt();
            number1=inputdo.nextInt();
            int divide=number/number1;
            System.out.println("the divide is :"+ divide);
        }
        else{

            System.out.println("not match");
        }

    }
}


14)

when a character input :
o :
a%b


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter tha cahracter :");
        char value=inputdo.next().charAt(0);
        if(value=='o')
        {
            System.out.println("enter the number :");
            int number,number1;
            number=inputdo.nextInt();
            number1=inputdo.nextInt();
            int mod=number%number1;
            System.out.println("the modluer is :"+mod);
        }
        else{
            System.out.println("not match");
        }
    }
}


15)
t :
area of triangle


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        char value=inputdo.next().charAt(0);
        if(value=='t')
        {
            System.out.println("enter the value of hight or bass value");
            int hight=inputdo.nextInt();
            int bass=inputdo.nextInt();
            int area=(bass*hight)/2;
            System.out.println("the area of tringlr is :" + area);
        }
        else
        {

        System.out.print("not match");
        }
    }
}


16)
c :
area of circle


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character :");
        char value=inputdo.next().charAt(0);
        if(value=='c')
        {
            System.out.println("enter the value of area of circle");
            int radius=inputdo.nextInt();
            float r=3.14f;
            float area=r*(radius*radius);
            System.out.println("the area of circle is :" + area);
        }
        else{
            System.out.println("sorry this character is not match");
        }
    }
}


17)
r :
area of rectangle

sorry this character is not match


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.print("enter the character :");
        char value=inputdo.next().charAt(0);
        if(value=='r')
        {
            System.out.println("enter the number : ");
            int length=inputdo.nextInt();
            int width=inputdo.nextInt();
            int area=length*width;
            System.out.println("the area of rectangel is :" + area);
        }
        else{
            System.out.println("sorry this character is not match");
        }
    }
}


18)
h :
volume of sphere

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character  h : ");
        char value=inputdo.next().charAt(0);
        if(value=='h')
        {
            System.out.println("enter the value of volume of sphere :");
            int radius=inputdo.nextInt();
            float pi=3.4f;
            float volume=(4/3)*(pi)*(radius*radius*radius);
            System.out.println("the volume of sphere is :"+ volume);
        }
        else
        {

        System.out.println("sorry this character is not match");
        }
    }
}






Q 19.
      selery tex 


      import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner i=new Scanner (System.in);
        System.out.println("this");System.out.println("enter your seleary");
        int num=i.nextInt();

        double text;
        if(num<=10000)
        {
            System.out.println("no need to text");
        }
        else if(num>=10000&&num<=100000)
        {
            text=(num * 0.10f);
            System.out.println(num + "totel tex : " + text);
        }
        else{
            text=num*0.20f;
            System.out.println(num + " totel tex : " + text);
        }
    }
}

Q20.

     leap year and not leapl year 


     import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("enter the year :");
        int y=input.nextInt();
        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not leap year");
        }
    }
}




Q21.

     prime number and not prime number 


     import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        int n=inputdo.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
            count++;
            }

        }

        if(count==2)
        {
            System.out.println("prime nunmber");
        }
        else
        {
            System.out.println("not prime number ");
        }
    }
}



Q22.

    perfect number


    import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the number");
        int num=inputdo.nextInt();
        int sum=0;

        for(int i=1;i<num;i++)
        {
            System.out.print(i + "  ");
           if(num%i==0)
           {
               sum=sum+i;
           }

        }
        if(num==sum)
        {
            System.out.println(num+ " this number is perfect number " + sum);
        }
        else
        {
            System.out.println("this number not perfect number");
        }
    }
}


Q23.


