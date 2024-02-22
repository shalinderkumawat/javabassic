Data Type	Size	Description
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,37                                           2,036,854,775,807




Q1.
     int data type

     public class Main{
    public static void main(String[] args)
    {
        int value=9;
        System.out.println(value);
    }
}


Q2.
    long data type

    A Java long data type can hold the largest integer values, taking up 64 bits of memory and accepts a range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. It's useful for storing numbers that outgrow the integer data type


import java.util.*;


public class Main{
    public static void main(String[] args)
    {
        Scanner userinput=new Scanner (System.in);
        long value=userinput.nextInt();
        System.out.print(value);


Q3.
	 short value stord int your program;

public class Main{
    public static void main(String[] args)
    {
        short number=30;
        System.out.print(number);
    }
}


Q4.

   byte data type stord in your programm


   public class Main{
    public static void main(String[] args)
    {
        byte value=43;
        System.out.println(value);
    }
}
                     
		=>	decmail value data type        <=

Q1.
    float dtat type value stord in your programm;

    public class Main{
    public static void main(String[] args)
    {
        float value=12.32f;
        System.out.print(value);
    }
}


Q2.

    double data type stored in your programm

    public class Main{
    public static void main(String[] args)
    {
        double value=210947.27384;
        System.out.print(value);
    }
}







         =>            non numaric type value             <=


Q1.
     char data type value stoed in your program;

     public class Main{
    public static void main(String[] args)
    {
        char value='h';
        System.out.println(value);
    }
}


Q2.
     boolean data type value stord in your program;

     public class Main
{
    public static void main(String[] args)
    {
        boolean value=true;
        System.out.print(value);

        // condition in your program Linke
       int a=3;
       int b=2;

        if(a<=b)
        {
            System.out.print("hi");
        }
        else
        {
            System.out.println("hi");
        }
    }
}




Q3  
               =>    class data type     <=

	       class data type is two types 
	        1.pre defined 
		  = System
		  = Consol
		  =Scanner
		  = String

		2. user defined class 
		 = class name
		 // inside class create data and methodes
		 

2. user defined class 
   
 class Hi{
	 void num()
	 {
		 int a=2;
		 int b=3;
		 System.out.println(a + " " + b);
	 }
	 //class create but class dose't memory creat space
	 //than need to object

	 class & object;
	 object is a class mamber 
		 =object creat in memory space according your class 

		 Syntax;
	                class-name  obj-name= new class-name();
			new = new keyword is create object 



Q1.
   creat a class and this class create a object 

   class Hi
{
    void num()
    {
        int a=2;
        int b=3;
        System.out.println(a + " " + b);
    }
}
public class Main{
    public static void main(String[] args)
    {
        Hi hireprisent=new Hi();
        hireprisent.num();
    }
}



Q2.
    create a class object and two number given by user and two number add;

    import java.util.*;
class Add
{

    void add()
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the number of a :");
        int a=inputdo.nextInt();
        System.out.println("Enter the number of b:");
        int b=inputdo.nextInt();
        System.out.println(a + " + " + b+ "="+ (a+b));
    }
}
public class Main{
    public static void main(String[] args)
    {
        Add ref=new Add();
        ref.add();
    }
}





     =>  Array    <=

     Syntax=
               data-type [] varible-name;
	       data-type varible-name;
EX.

    int a[] ;
    int []a;

 Q1.
      creat the array in java language 

      public class Main{
    public static void main(String[] args)
    {
        int a[]={3232,23,23322,43};
        System.out.print(a[3]);
    }
}

or


public class Main{
public static void main(String[] args){
    int a[] = new int[5];
    a[0]=4;
    a[1]=3;
    a[2]=34;
    a[3]=4;
    a[4]=4332232;
    System.out.print(a[4]);
}
}


Q2.
   creat the array form user input array size and array value

   import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the array size : ");
        int size=inputdo.nextInt();
        int a[]=new int[size];

        for(int i=0;i<size;i++)
        {
            a[i]=inputdo.nextInt();

        }
        System.out.println("print fo the array : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i] + "  ");
        }
    }
}
