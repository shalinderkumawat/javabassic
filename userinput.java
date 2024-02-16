Q1 give the user input your name 
   
   import java.util.*;

public class Main
{
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String name=sc.next();
        System.out.print(name);
        
    }
}

Q2 give the user input more name in same line

   import java.util.*;

public class Main
{
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        System.out.print(name);
        
    }
Q2. user input to print name in java language
  import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        System.out.println("its working");
        Scanner user= new Scanner(System.in);
        String a=user.nextLine();
        System.out.print(a);
    }
}

Q3.give the intrger value form user

        import  java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner user= new Scanner(System.in);
        int intvalue=user.nextInt();
        System.out.println(intvalue);
    }
}

Q4 give the float value of user input

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner userinput=new Scanner (System.in);
        float floatvalue=userinput.nextFloat();
        System.out.print(floatvalue);
    }
}

Q5. user input add to number in java language

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {

        Scanner userinput= new Scanner(System.in);
        System.out.print("enter the frist value of add");
        int number;
        number=userinput.nextInt();
        System.out.println(number);
        int number1;
        System.out.println("enter the second value add");
        number1=userinput.nextInt();
        System.out.println(number1);
        int sum=number+number1;
        System.out.print("the sum of number and number1 is :");
        System.out.print(sum);
    }
}



Q7 user input add three number

import java.util.*;

 public class Main{
     public static void main(String[] args)
     {
         Scanner userinput = new Scanner (System.in);

         int number,number1,number2;
         System.out.print("enter the first add number and number1 and number2 :\n");
         number=userinput.nextInt();
         number1=userinput.nextInt();
         number2=userinput.nextInt();
         int sum=number+number1+number2;
         System.out.println("the sum of three number is "+sum);
     }
 }



Q8. user input two number subtraction in java language

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner userinput=new Scanner(System.in);
        int number,number1;
      number=userinput.nextInt();
      number1=userinput.nextInt();

      System.out.print("the subtraction is :");
      System.out.print(number-number1);
    }
}

Q9 user input two number divide


import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("enter the value of divide ");

        Scanner userinput=new Scanner(System.in);
        int number,number1;
        number=userinput.nextInt();
        number1=userinput.nextInt();
        int divide=number/number1;
        System.out.print("the two number divide is :");
        System.out.print(divide);

    }
}

Q10. USER INOUT TWO NUMBER MULTIPLY

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner userinput= new Scanner (System.in);
        System.out.print("enter the value of mulitply");
        int number,number1;
        number=userinput.nextInt();
        number1=userinput.nextInt();
        int multiply=number*number1;

        System.out.print("the two number of multiply is :");
        System.out.print(multiply);
    }
}

Q11.user input moduler


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner userinput= new Scanner (System.in);
        int number,number1;
        number=userinput.nextInt();
        number1=userinput.nextInt();
        int mod=number%number1;
        System.out.print("the two numer is modlur :");
        System.out.print(mod);
    }
}


Q12 add
    multiply
    divide
    mod
    subtraction


    userinput


    import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the two number of add");
        int number,number1;
        number=input.nextInt();
        number1=input.nextInt();
        System.out.print("the add is :");
        int add=number+number1;
        System.out.println(add);
        int multiply=number*number1;
        System.out.print("the multiply is :");
        System.out.println(multiply);
        int divide=number/number1;
        System.out.print("the divide is :");
        System.out.println(divide);
        int subtraction=number-number1;
        System.out.print("the subtraction is :");
        System.out.println(subtraction);
        int mod=number%number1;
        System.out.print("the modluer is :");

        System.out.println(mod);
    }
}
}
