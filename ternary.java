1)voter id 
=>user input  	

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter your age :");
        int age=input.nextInt();
        String out=(age>=18)?"you are valide for vote":"you are not valide ";
        System.out.println(out);
    }   
}

2)one number max a>10 
one number : 

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter number of 20 your number is max :");
        int age=input.nextInt();
        String out=(age>=20)?"A is max":"A is not max ";
        System.out.println(out);
    }   
}

3)two number max a b 

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter number of max:");
        int a=input.nextInt();
        System.out.print("Enter the second number :");
        int b=input.nextInt();
        String out=(a>=b)?"A is max":"B is max ";
        System.out.println(out);
    }   
}

4)three number max a b c 
tenno mey se konsa badha hey 

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter number of max:");
        int a=input.nextInt();
        System.out.print("Enter the second number :");
        int b=input.nextInt();
        System.out.print("Enter the three number ");
        int c=input.nextInt();
        String out=(a>=b&&a>=c)?"A is max":(b>=a&&b>=c)?"B is max ":"C is max";
        System.out.println(out);
    }   
}

5)five number max abcde 	

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter number of max:");
        int a=input.nextInt();
        System.out.print("Enter the second number :");
        int b=input.nextInt();
        System.out.print("Enter the three number ");
        int c=input.nextInt();
        System.out.print("Enter the number for :");
        int d=input.nextInt();
        System.out.print("Enter the five number :");
        int e=input.nextInt();
        String out=(a>=b&&a>=c&&a>=d&&a>=e)?"A is max":(b>=a&&b>=c&&b>=d&&a>=e)?"B is max ":(c>=a&&c>=b&&c>=d&&c>=e)?"C is max":(d>=a&&d>=b&&d>=c&&d>=e)?"D is max":"E is max";
        System.out.println(out);
    }   
}

6) user 
-9 negative integer 
5 positive integer 
0 =zero 

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the number :");
        int a=input.nextInt();

        String out=(a<0)?"Your number is negative int value "+a:(a>0)?"Your number is positive number :"+a:"Your number is zero "+a;
        System.out.println(out);
    }
}

7) vowel and consonat 
->a e i o u vowel 
consonant 

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter any character :");
        char a=input.next().charAt(0);
        System.out.print(a);
        String out=(a=='a'||a=='e'||a=='i'||a=='o'|a=='u')?" Vowal":"consonant";
        System.out.print(out);
    }
}

8)divisible 5 and 11 
	a)num dono se divide ho jb process ho 
	b)num kisi se bhi divide ho jb process ho 




import java.util.Scanner;

public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the number :");
        int a=input.nextInt();

        String out=(a%5==0&&a%11==0)?"your number is divisible  5 or 11 :":(a%5==0||a%11==0)?"Your number is dividible is "+a:"Your number is divisible is "+a;
        System.out.print(out);
    }
}


m =you are 
f = female 
other

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the first latter :");
        char a=input.next().charAt(0);
        String out=(a=='m')?"You are male ":(a=='f')?"Your are female ":"Sorry you are other ";
        System.out.println(out);
    }
}

number 
1 =>sunday 
2 =>monday 
3 =>tuesday 

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the first latter :");
        int a=input.nextInt();
        String out=(a==1)?"Sunday":(a==2)?"monday":(a==3)?"tuesday":"wednesday";
        System.out.print(out);
    }
}

ser number 
check number :even odd 

import java.util.*;
public class All{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of even number or odd number  :");
        int a=input.nextInt();
        String out=(a%2==0)?"This number is even number ":"This number is odd number ";
              System.out.print(out);
    }
}

 	